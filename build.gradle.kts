plugins {
    kotlin("jvm") version "2.3.0"
    application
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

application {
    mainClass.set("MainKt")
}
