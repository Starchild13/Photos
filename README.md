# 📸 Photos App

![Photos App Banner](screenshots/app_screenshot.png)

A modern, elegant Android photo gallery application built with **Jetpack Compose** and **Material 3**. The app showcases a high-performance **Staggered Grid** layout displaying a curated collection of Garfield photo assets, adhering to modern Android development best practices.

---

## ✨ Features

- **Jetpack Compose UI**: Built entirely with declarative UI components, ensuring smooth rendering and responsive state handling.
- **Staggered Grid Layout**: Utilizes `LazyVerticalStaggeredGrid` with a 3-column fixed configuration for dynamic photo arrangements.
- **Material 3 Theming**: Implements dynamic color schemes, custom typography, and polished UI components (`FilterChip`, `Image`, etc.).
- **Comprehensive Documentation**: Fully commented codebase with detailed KDoc annotations explaining composables, UI helpers, and data sources.
- **Modern Tech Stack**: Upgraded to Android Gradle Plugin 8.3.2, Kotlin 1.9.24, Compose BOM 2024.05.00, and Android SDK 35.

---

## 📱 Screenshots & Demo

### App Screenshot
![App Screenshot](screenshots/app_screenshot.png)

### App Demo Video
Watch the app interaction and scrolling demo:  
[Download / Play Demo Video](screenshots/app_demo.mp4)

---

## 🛠️ Tech Stack & Dependencies

- **Min SDK**: 26 (Android 8.0 Oreo)
- **Compile/Target SDK**: 35 (Android 15)
- **UI Framework**: Jetpack Compose (BOM 2024.05.00)
- **Design System**: Material 3
- **Language**: Kotlin 1.9.24
- **Build System**: Gradle 8.5 with Android Gradle Plugin 8.3.2

---

## 📂 Project Structure

```tree
Photos/
├── app/
│   ├── src/main/java/com/starchild13/photos/
│   │   ├── MainActivity.kt         # Entry point & Composable UI definitions
│   │   └── ui/theme/               # Material 3 Theme, Color, and Typography
│   └── src/main/res/
│       ├── drawable/               # Curated photo assets (garfield1.jpg - garfield18.jpg)
│       └── values/                 # Strings, colors, and themes
├── screenshots/
│   ├── app_screenshot.png          # High-resolution UI screenshot
│   └── app_demo.mp4                # App interaction & scrolling screen recording
├── build.gradle                    # Root Gradle configuration
└── README.md                       # Project documentation
```

---

## 🚀 Getting Started

1. **Clone the repository**:
   ```bash
   git clone https://github.com/starchild13/Photos.git
   ```
2. **Open in Android Studio**:
   Open Android Studio, select **Open**, and choose the `Photos` project root directory.
3. **Run the App**:
   Connect an Android device or start an emulator (API 26+), then click the **Run** button in Android Studio or execute via Gradle:
   ```bash
   ./gradlew app:assembleDebug
   ```

---

## 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.
