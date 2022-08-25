plugins {
    id("java-library")
}
apply(plugin = "kotlin")

configurations.implementation {
    exclude(group = "org.jetbrains", module = "annotations")
}

dependencies {
    implementation(project(":jaxp:xml"))
    implementation(project(":jaxp:internal"))
    implementation("com.github.marschall:zipfilesystem-standalone:1.0.1")
    implementation("androidx.annotation:annotation:1.4.0")

    runtimeOnly("org.jetbrains.kotlin:kotlin-reflect:1.7.10")

    api("org.jetbrains.trove4j:trove4j:20160824")
    api(files("libs/kotlin-compiler-embeddable-1.7.20-Beta.jar"))
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}