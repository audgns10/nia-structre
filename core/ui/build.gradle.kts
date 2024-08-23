plugins {
    id("build.android.core")
    id("build.android.compose")
}

android {
    namespace = "com.example.ui"
}

dependencies {
    implementation(project(":core:analytics"))
    implementation(project(":core:design-system"))
    implementation(project(":core:model"))

    // todo: add dependencies
}