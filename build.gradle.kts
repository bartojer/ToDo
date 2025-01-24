plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.composeMultiplatform) apply false
    alias(libs.plugins.composeCompiler) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false

    kotlin("plugin.serialization") version libs.versions.kotlin

    id("com.google.gms.google-services") version "4.4.2" apply false
//    id("com.android.application")
//    id("org.jetbrains.kotlin.android")
//}
//
//dependencies {
//    implementation(libs.androidx.navigation.compose)
}