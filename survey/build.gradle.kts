@file:Suppress("SuspiciousCollectionReassignment")

//import com.quickbirdstudios.surveykit.configureLibraryPublication

plugins {
    id("com.android.library")
    kotlin("android")
    id("org.jetbrains.kotlin.android.extensions")
    //id("com.jfrog.bintray")
    //`maven-publish`
}

androidExtensions { isExperimental = true }

android {
    compileSdkVersion(Project.Android.compileSdkVersion)

    defaultConfig {
        minSdkVersion(Project.Android.minSdkVersion)
        targetSdkVersion(Project.Android.targetSdkVersion)

        versionName = "v2.0.0-ait-SNAPSHOT"

        testInstrumentationRunner = Project.Android.testInstrumentationRunner
    }

    testOptions {
        animationsDisabled = true
    }

    lintOptions {
        isAbortOnError = false
    }
}

dependencies {
    implementation(Deps.Kotlin.stdlib)
    api(Deps.Kotlin.coroutines)
    implementation(Deps.Kotlin.androidCoroutines)
    implementation(Deps.AndroidSupport.appCompat)
    implementation(Deps.AndroidSupport.constraint)
    implementation(Deps.AndroidSupport.recyclerView)
    implementation(Deps.lottie)
    implementation(Deps.PlayServices.maps)

    testImplementation(Deps.Test.jUnitJupiter)
    testImplementation(Deps.Test.jUnitPlatform)
}

//project.configureLibraryPublication()

apply {
    from("../maven_publish_helper.gradle")
}