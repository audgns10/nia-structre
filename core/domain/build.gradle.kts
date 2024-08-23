plugins {
    id("build.android.core")
    id("build.android.hilt")
}

android {
    namespace = "com.example.domain"
}

dependencies {
    implementation(project(":core:data"))
    implementation(project(":core:model"))

    // todo: add dependencies
}