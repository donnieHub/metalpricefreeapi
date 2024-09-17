plugins {
    kotlin("jvm")
}

group = "org.metalpricefreeapi"
version = "1.1-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.jar {
    manifest.attributes["Main-Class"] = "org.metalpricefreeapi.MainKt"
    manifest.attributes["Class-Path"] = configurations
        .runtimeClasspath
        .get()
        .joinToString(separator = " ") { file ->
            "libs/${file.name}"
        }
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation("com.codeborne:selenide:7.5.0")
}

tasks.test {
    useJUnitPlatform()
}