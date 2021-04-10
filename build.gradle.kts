import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id("org.openjfx.javafxplugin") version "0.0.9"
    id("com.github.johnrengelman.shadow") version "2.0.4"
    base
}

group = "maxwainer.planner"
version = "0.0.1-PRE"

var author = "Max_Wainer"
var appName = "Planner by $author v$version"

repositories {
    mavenCentral()
}

dependencies {
    implementation("redis.clients:jedis:3.4.1")
    implementation("com.zaxxer:HikariCP:3.4.5")
    implementation("org.jetbrains:annotations:20.1.0")
    // For description serialization
    implementation("com.google.code.gson:gson:2.8.6")
    // For big boiz
    implementation("com.google.guava:guava:30.1.1-jre")
    implementation("org.apache.commons:commons-lang3:3.0")
}

javafx {
    modules("javafx.controls", "javafx.fxml")
}

tasks {
    withType<JavaCompile> {
        sourceCompatibility = JavaVersion.VERSION_1_8.toString()
        targetCompatibility = JavaVersion.VERSION_1_8.toString()
    }

    // Ignore it...
    // relocate no need :)
    withType<ShadowJar> {
        archiveFileName.set("$appName.jar")

        manifest {
            attributes["Manifest-Version"] = "1.0"
            attributes["Main-Class"] = "maxwainer.planner.SuperApplication"
        }

        // Ignore it
        destinationDirectory.set(File("./toExecutable"))
    }
}