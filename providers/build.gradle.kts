plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.lagradost.cloudstream3.gradle")
}

cloudstream {
    setRepoUrl("https://raw.githubusercontent.com/Memsal/AnadoluStream/master")
}

dependencies {
    // Cloudstream dependency is handled by the gradle plugin
}