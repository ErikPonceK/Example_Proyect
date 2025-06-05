// build.gradle.kts (proyecto raíz)
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    kotlin("jvm")
    id("org.sonarqube") version "4.4.1.3373"
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

kotlin {
    jvmToolchain(8)
}
