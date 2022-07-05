// Suppress to fix IntelliJ bug.
@Suppress("DSL_SCOPE_VIOLATION")

// Plugin Definitions
plugins {
    id("maven-publish")
    alias(libs.plugins.quilt.loom)
    alias(libs.plugins.kotlin)
    alias(libs.plugins.dokka)
}

// Variable Assignment
group = project.properties["mavenGroup"]!!
version = project.version
val archivesBaseName = rootProject.properties["archivesBaseName"]!!

val javaVersion = 17 // Minecraft's default version of Java

// Repository Definitions
repositories {
    // Add repositories to retrieve artifacts from in here.
    // You should only use this when depending on other mods because
    // Loom adds the essential maven repositories to download Minecraft and libraries from automatically.
    // See https://docs.gradle.org/current/userguide/declaring_repositories.html
    // for more information about repositories.

    mavenCentral() // Default Maven repository + all required Minecraft repositories
    maven {
        url = uri("https://maven.shadew.net/") // Shadew's Maven repository (Used for an optional dependency)
    }
}

// Dependency Definitions
// All the dependencies are declared at gradle/libs.version.toml and referenced with "libs.<id>"
// See https://docs.gradle.org/current/userguide/platforms.html for information on how version catalogs work.
dependencies {
    // Minecraft
    minecraft(rootProject.libs.minecraft)
    mappings(loom.layered {
        addLayer(quiltMappings.mappings("org.quiltmc:quilt-mappings:${rootProject.libs.versions.quilt.mappings.get()}:v2")) // Quilt mappings. If below line is uncommented, it will be used as a fallback.
        // officialMojangMappings() // Uncomment to use the official Mojang mappings (Mojmaps).
    })

    // Quilt Mod Loader
    modImplementation(rootProject.libs.quilt.loader) // Quilt Loader
    modImplementation(rootProject.libs.quilt.api) // Quilt API; QSL is not complete, so a quilted version of the Fabric API is automatically included.
    modImplementation(rootProject.libs.bundles.qkl) // Quilt Kotlin Libraries

    // Kotlin
    implementation(rootProject.libs.kotlin.stdlib) // Kotlin + Standard Library
}
