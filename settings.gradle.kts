pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Android Playgrounds"
include("app")
include("kotlinc")
include("android-compiler")
include("core-navigation")
include("jaxp:internal")
include("jaxp:xml")
//include("feature-recents")