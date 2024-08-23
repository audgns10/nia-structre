plugins {
    id("build.android.core")
    id("build.android.hilt")
}

android {
    namespace = "com.example.data"
}

dependencies {
    implementation(project(":core:common"))
    implementation(project(":core:model"))
    implementation(project(":core:network"))
    implementation(project(":core:datastore"))

    // todo: add dependencies
}