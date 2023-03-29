// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    dependencies {
        dependencies {
            classpath(libs.hilt.android.gradle.plugin)
        }
    }
}

plugins {
    alias(libs.plugins.com.android.application) apply false
    alias(libs.plugins.org.jetbrains.kotlin.android) apply false
}