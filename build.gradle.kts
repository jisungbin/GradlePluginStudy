plugins {
    id("com.android.application") version "8.2.0-alpha01" apply false
    id("org.jetbrains.kotlin.android") version "1.8.21" apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
