plugins {
    kotlin("jvm") version "1.3.72" // targeting jvm
    id("org.springframework.boot") version "2.3.0.RELEASE" // adds spring boot
    // use maven bom to version dependencies (set by boot)
    id("io.spring.dependency-management") version "1.0.9.RELEASE"
    // kotlin("plugin.spring") == id("org.jetbrains.kotlin.plugin.spring")
    kotlin("plugin.spring") version "1.3.72" // open kotlin classes for spring
    kotlin("plugin.jpa") version "1.3.72" // entities with empty constructor
}

group = "com"
version = "1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8")) // kotlin std lib for java 8
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation(kotlin("reflect")) // reflection for data-jpa
    runtimeOnly("org.postgresql:postgresql")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}