plugins {

    id(Plugins.androidApplication)
    id(Plugins.hilt)


    kotlin(Plugins.Kotlin.android)
    kotlin(Plugins.Kotlin.extensions)
    kotlin(Plugins.Kotlin.kapt)

}
android {
    compileSdk = Application.compileSdk

    defaultConfig {
        applicationId = Application.applicationId
        minSdk = Application.minSdk
        targetSdk = Application.targetSdk
        versionCode = Application.versionCode
        versionName = Application.versionName

        testInstrumentationRunner = Application.testRunner
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8

    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

dependencies {

    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    coreLibraryDesugaring(Deps.jdkDesugar)

    implementation(Deps.coroutinesCore)
    implementation(Deps.coroutinesAndroid)

    implementation(Deps.navigationUi)
    implementation(Deps.navigationFragment)

    implementation(Deps.appCompat)
    implementation(Deps.constraintLayout)
    implementation(Deps.coreKtx)
    implementation(Deps.lifecycleRuntime)
    implementation(Deps.lifecycleViewModelKtx)
    implementation(Deps.fragmentKtx)
    implementation(Deps.materialComponents)
    implementation(Deps.kotlinReflection)
    implementation(Deps.retrofit)
    implementation(Deps.retrofitGson)

    implementation(Deps.gson)

    implementation(Deps.hilt)
    kapt(Deps.hiltCompiler)

    implementation(Deps.room)
    kapt(Deps.roomAnnotation)
    implementation(Deps.roomCoroutines)

    implementation(Deps.leakCanary)

    testImplementation(TestDeps.junit)
}