plugins {
    id("build.android.application")
    id("build.android.hilt")
}

android {
    namespace = "com.example.build"

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
            excludes += "META-INF/DEPENDENCIES"
        }
    }
}

dependencies {
    // TODO: Add your project dependencies

    androidTestImplementation(libs.androidx.test.ext)
    implementation(libs.app.update.ktx)
}