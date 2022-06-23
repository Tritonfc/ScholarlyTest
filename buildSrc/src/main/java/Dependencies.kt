object Versions {
    // Android libraries
    const val APP_COMPAT = "1.3.1"
    const val MATERIAL = "1.4.0"
    const val ANDROID_KTX = "1.6.0"
    const val ROOM = "2.4.2"
    const val CONSTRAINT_LAYOUT = "2.1.0"

    const val COROUTINES = "1.6.0"

    const val RETROFIT = "2.9.0"

    const val REFLECTION = "1.7.0"

    const val NAVIGATION = "2.3.0"

    const val LIFECYCLE_KTX = "2.4.1"

    const val GSON = "2.8.8"

    const val FRAGMENT_KTX = "1.3.6"

    const val LEAK_CANARY = "2.7"

    const val BUILD_TOOLS = "7.0.3"

    const val KOTLIN = "1.6.0"

    const val HILT = "2.38.1"

    const val JDK_DESUGAR = "1.1.5"

    // Test Libraries
    const val JUNIT = "4.13.2"
}

object Deps {
    const val appCompat = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"
    const val materialComponents = "com.google.android.material:material:${Versions.MATERIAL}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.ANDROID_KTX}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT_KTX}"

    const val kotlinReflection = "org.jetbrains.kotlin:kotlin-reflect:${Versions.REFLECTION}"

    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINES}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES}"

    const val lifecycleViewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE_KTX}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE_KTX}"

    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION}"

    const val hilt = "com.google.dagger:hilt-android:${Versions.HILT}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.HILT}"

    const val gson = "com.google.code.gson:gson:${Versions.GSON}"
const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
    const val leakCanary = "com.squareup.leakcanary:leakcanary-android:${Versions.LEAK_CANARY}"

    const val room = "androidx.room:room-runtime:${Versions.ROOM}"

    const val roomAnnotation = "androidx.room:room-compiler:${Versions.ROOM}"
    const val roomCoroutines = "androidx.room:room-ktx:${Versions.ROOM}"

    const val jdkDesugar = "com.android.tools:desugar_jdk_libs:${Versions.JDK_DESUGAR}"
}

object TestDeps {
    const val junit = "junit:junit:${Versions.JUNIT}"
}