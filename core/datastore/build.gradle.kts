plugins {
    id("build.android.core")
    id("build.android.hilt")
    alias(libs.plugins.protobuf)
}

android {
    namespace = "com.example.datastore"
}

protobuf {
    protoc {
        artifact = libs.protobuf.protoc.get().toString()
    }
    generateProtoTasks {
        all().forEach { task ->
            task.builtins {
                register("java") {
                    option("lite")
                }
                register("kotlin") {
                    option("lite")
                }
            }
        }
    }
}

dependencies {
    implementation(project(":core:common"))
    implementation(project(":core:model"))

    implementation(libs.androidx.dataStore.core)
    implementation(libs.protobuf.kotlin.lite)

    // todo: add dependencies
}