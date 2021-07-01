buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven(uri("https://plugins.gradle.org/m2/")) // For kotlinter-gradle
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.10")
        with(Deps.Gradle) {
            classpath(kotlin)
            classpath(kotlinSerialization)
            classpath(androidGradle)
            classpath(sqlDelight)
            classpath(shadow)
            classpath(kotlinter)
        }
    }
}

allprojects {
    apply(plugin = "org.jmailen.kotlinter")

    repositories {
        google()
        mavenCentral()
        maven(url = "https://kotlin.bintray.com/kotlin-js-wrappers/")
        maven(url = "https://jitpack.io")
    }
}