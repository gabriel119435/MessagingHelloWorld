plugins {
    kotlin("jvm") version "1.3.72" // targeting jvm
    id("org.springframework.boot") version "2.3.0.RELEASE" // adds spring boot
    // use maven bom to version dependencies (set by boot)
    id("io.spring.dependency-management") version "1.0.9.RELEASE"
    // kotlin("plugin.spring") == id("org.jetbrains.kotlin.plugin.spring")
    kotlin("plugin.spring") version "1.3.72" // open kotlin classes for spring
}

group = "com"
version = "1"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web") // spring web
    implementation(kotlin("stdlib-jdk8")) // kotlin std lib for java 8
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "11"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "11"
    }
}