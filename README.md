# 📱 Project Progress Tracker

A role-based Android application designed to simplify and digitize the management of student mini projects. The application replaces traditional manual tracking methods such as registers and spreadsheets with an efficient mobile solution for **Admins, Teachers, and Students**.

---

## 📖 Overview

Project Progress Tracker provides a centralized platform for managing student projects in educational institutions. It enables administrators to organize classes and users, teachers to monitor project progress, and students to access their project details through a simple and user-friendly interface.

The application uses **SQLite** for local data storage and **SharedPreferences** for user session management, making it suitable for offline use.

---

## ✨ Features

### 👨‍💼 Admin
- Create and manage classes
- Generate unique class codes
- Manage teachers and students
- Maintain user records

### 👨‍🏫 Teacher
- View assigned student groups
- Manage project information
- Monitor project progress

### 👨‍🎓 Student
- Login using class code
- View assigned group details
- Access project information

### 🔐 Authentication
- Secure login validation
- Role-based access control
- Class code verification

---

## 🛠️ Tech Stack

| Technology | Purpose |
|------------|---------|
| Java | Application Development |
| Android Studio | IDE |
| XML | User Interface Design |
| SQLite | Local Database |
| SharedPreferences | User Session Management |
| Material Components | Modern Android UI |

---

## 📂 Project Structure

```
ProjectProgressTracker
│
├── app
│   ├── java
│   │   ├── activities
│   │   ├── adapters
│   │   ├── database
│   │   ├── models
│   │   └── utils
│   │
│   ├── res
│   │   ├── layout
│   │   ├── drawable
│   │   ├── values
│   │   └── mipmap
│   │
│   └── AndroidManifest.xml
│
├── Gradle Scripts
└── README.md
```

---

## 🚀 Getting Started

### Prerequisites

Before running the project, ensure you have:

- Android Studio (Latest Stable Version)
- Java Development Kit (JDK 17 or later)
- Android SDK
- Gradle (Included with Android Studio)
- Git

---

## 📥 Clone the Repository

```bash
git clone https://github.com/YOUR_USERNAME/ProjectProgressTracker.git
```

Navigate to the project directory:

```bash
cd ProjectProgressTracker
```

---

## ⚙️ Android Studio Setup

### 1. Open the Project

- Launch **Android Studio**
- Select **Open**
- Choose the cloned project folder

### 2. Sync Gradle

Wait for Android Studio to download the required dependencies and complete the Gradle sync.

### 3. Build the Project

Go to:

```
Build → Make Project
```

or simply press:

```
Ctrl + F9
```

### 4. Run the Application

- Connect an Android device with USB Debugging enabled

**OR**

- Start an Android Emulator

Then click:

```
Run ▶
```

or press:

```
Shift + F10
```

---

## 📱 APK Installation

Download the latest APK from the **Releases** section.

1. Download the APK.
2. Enable **Install Unknown Apps** if prompted.
3. Install the APK.
4. Launch the application.

---

## 🗄️ Database

The application uses:

- **SQLite** for storing application data locally.
- **SharedPreferences** for managing user sessions and application preferences.

No internet connection is required for core functionality.

---

## 🎯 Objectives

- Digitize student project management
- Reduce manual paperwork
- Improve transparency
- Organize project information efficiently
- Provide an offline-first mobile solution

---

## 🔮 Future Enhancements

- Firebase Authentication
- Cloud Database Synchronization
- Project Progress Charts
- Notifications
- File Upload Support
- Attendance Tracking

---

## 👨‍💻 Developer

**Ishwar Bachhav**

MCA Student

---

## 📄 License

This project is developed for **educational and learning purposes**.

---

## 📥 Download

Download the latest APK from the **Releases** section.

https://github.com/<your-username>/Project-Progress-Tracker-Application-Android/releases/latest

---

## ⭐ Support

If you found this project helpful, consider giving it a **⭐ Star** on GitHub.

