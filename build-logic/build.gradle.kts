plugins {
    kotlin("jvm") version "1.8.21"
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

gradlePlugin {
    plugins {
        create("MyGradlePlugin") {
            id = "buildlogic.my-gradle-plugin"
            implementationClass = "MyGradlePlugin"
        }
    }
}
