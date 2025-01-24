plugins {
    id("java")
    //id("checkstyle")
    //id("io.freefair.lombok") version "8.6"
    //id("com.github.ben-manes.versions") version "0.50.0"
    //id("com.github.johnrengelman.shadow") version "8.1.1"
    application
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

application {
    mainClass = "hexlet.code.App"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

//application { mainClass.set("io.hexlet.Application") }