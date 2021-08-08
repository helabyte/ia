import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        mavenCentral()
    }

}

plugins {
    id("org.springframework.boot") version "2.5.3" apply false
    id("io.spring.dependency-management") version "1.0.11.RELEASE" apply false
    kotlin("jvm") version "1.5.21" apply false
    kotlin("plugin.spring") version "1.5.21" apply false
    kotlin("plugin.jpa") version "1.5.21" apply false
    kotlin("plugin.allopen") version "1.4.32" apply false


}

allprojects {
    group = "com.helabyte.ia"
    version = "1.0.0"
    ext {

    }


    tasks.withType<JavaCompile> {
        sourceCompatibility = "11"
        targetCompatibility = "11"
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "11"
        }
    }
}

subprojects {
    repositories {
        mavenCentral()
    }

    apply {
        plugin("io.spring.dependency-management")
    }

}
