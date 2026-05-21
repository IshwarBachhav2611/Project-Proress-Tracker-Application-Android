package com.minigroup.projectprogresstracker;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class AnnouncementStorage {

    private static final String PREF_NAME = "AnnouncementPrefs";
    private static final String KEY_PREFIX = "announcements_";

    /**
     * Saves the list of announcements for a specific class code.
     */
    public static void saveAnnouncements(Context context, String classCode, ArrayList<Announcement> list) {
        if (context == null || classCode == null || classCode.isEmpty()) return;

        SharedPreferences prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        Gson gson = new Gson();
        editor.putString(KEY_PREFIX + classCode, gson.toJson(list));
        editor.apply();
    }

    /**
     * Retrieves announcements filtered by class code.
     */
    public static ArrayList<Announcement> getClassAnnouncements(Context context, String classCode) {
        if (context == null || classCode == null || classCode.isEmpty()) return new ArrayList<>();

        SharedPreferences prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        String json = prefs.getString(KEY_PREFIX + classCode, null);

        if (json == null || json.isEmpty()) return new ArrayList<>();

        try {
            Gson gson = new Gson();
            Type type = new TypeToken<ArrayList<Announcement>>() {}.getType();
            ArrayList<Announcement> list = gson.fromJson(json, type);
            return list != null ? list : new ArrayList<>();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    /**
     * Adds a new announcement to the top of the list for a specific class.
     */
    public static void addAnnouncement(Context context, String classCode, Announcement a) {
        if (context == null || classCode == null || a == null) return;

        ArrayList<Announcement> list = getClassAnnouncements(context, classCode);
        list.add(0, a); // Latest announcement at the top
        saveAnnouncements(context, classCode, list);
    }

    /**
     * Removes a specific announcement from the storage.
     */
    public static void removeAnnouncement(Context context, String classCode, Announcement announcementToRemove) {
        if (context == null || classCode == null || announcementToRemove == null) return;

        ArrayList<Announcement> list = getClassAnnouncements(context, classCode);

        // Find and remove based on content/timestamp equality
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMessage().equals(announcementToRemove.getMessage())) {
                list.remove(i);
                break;
            }
        }

        saveAnnouncements(context, classCode, list);
    }

    /**
     * Deletes an announcement by its position in the list.
     */
    public static void deleteAnnouncement(Context context, String classCode, int position) {
        ArrayList<Announcement> list = getClassAnnouncements(context, classCode);
        if (position >= 0 && position < list.size()) {
            list.remove(position);
            saveAnnouncements(context, classCode, list);
        }
    }
}