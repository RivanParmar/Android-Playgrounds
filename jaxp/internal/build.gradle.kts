plugins {
    id("java-library")
}

dependencies {
    implementation(project(":jaxp:xml"))
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}