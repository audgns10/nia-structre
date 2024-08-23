import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.firebase.crashlytics.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "build.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }

        register("androidHilt") {
            id = "build.android.hilt"
            implementationClass = "AndroidHiltConventionPlugin"
        }

        register("androidLint") {
            id = "build.android.lint"
            implementationClass = "AndroidLintConventionPlugin"
        }

        register("androidCore") {
            id = "build.android.core"
            implementationClass = "AndroidCoreConventionPlugin"
        }

        register("androidCompose") {
            id = "build.android.compose"
            implementationClass = "AndroidComposeConventionPlugin"
        }

        register("jvmLibrary") {
            id = "build.jvm.library"
            implementationClass = "JvmLibraryConventionPlugin"
        }

        register("androidFeature") {
            id = "build.android.feature"
            implementationClass = "AndroidFeatureConventionPlugin"
        }

        register("androidFirebase") {
            id = "build.android.firebase"
            implementationClass = "AndroidFirebaseConventionPlugin"
        }
    }
}
