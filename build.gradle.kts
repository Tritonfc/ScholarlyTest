// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Build.buildTools)
        classpath(Build.kotlinPlugin)
        classpath(Build.hiltPlugin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}