plugins {
    `java-library`
}

group = "dev.hollowcube"
version = System.getenv("TAG_VERSION") ?: "dev"
description = "Schematic reader and writer for Minestom"

repositories {
    mavenCentral()
    maven(url = "https://jitpack.io")
}

dependencies {
    println(libs)
    compileOnly(libs.minestom)
    testImplementation(libs.minestom)

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation(libs.bundles.logback)
}

java {
    toolchain.languageVersion = JavaLanguageVersion.of(21)

    withSourcesJar()
    withJavadocJar()
}

tasks.test {
    useJUnitPlatform()
}