plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("buildlogic.my-gradle-plugin")
}

android {
    namespace = "land.sungbin.androidstudy.gradleplugins"
    compileSdk = 33

    defaultConfig {
        minSdk = 23
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    sourceSets {
        getByName("main").java.srcDir("src/main/kotlin")
    }
}

myGradlePlugin {
    message = "Hello, World!"
}
