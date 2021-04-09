import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    kotlin("jvm") version "1.4.31"
    id("org.openjfx.javafxplugin") version "0.0.9"
    id("com.github.johnrengelman.shadow") version "2.0.4"
    base
}

group = "maxwainer.planner"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("no.tornado:tornadofx:1.7.20")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.3")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.1.0")
    implementation("redis.clients:jedis:3.4.1")
    implementation("com.zaxxer:HikariCP:3.4.5")
}

javafx {
    modules("javafx.controls", "javafx.fxml")
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }

    withType<Jar> {
        manifest {
            attributes["Manifest-Version"] = "1.0"
            attributes["Main-Class"] = "$group.PlannerApplicationKt"
        }
    }

    withType<ShadowJar> {
        archiveFileName.set("")
        destinationDirectory.set(File(""))
    }
}