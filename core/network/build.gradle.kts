plugins {
    id("build.android.core")
    id("build.android.hilt")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.network"

    // todo: add buildConfigField
}

dependencies {
    implementation(project(":core:common"))
    implementation(project(":core:model"))
    implementation(project(":core:datastore"))

    // todo: add dependencies
}