pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
        maven("https://devrepo.kakao.com/nexus/repository/kakaomap-releases/")
    }
}

rootProject.name = "build"

include(":app")

include(":core")
include(":core:common")
include(":core:data")
include(":core:datastore")
include(":core:model")
include(":core:design-system")
include(":core:network")
include(":core:ui")
include(":core:domain")
include(":core:analytics")

include(":feature:one")
include(":feature:two")
include(":feature:three")
gradle.startParameter.excludedTaskNames.addAll(listOf(":build-logic:convention:testClasses"))