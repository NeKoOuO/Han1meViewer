plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "com.yenaly.han1meviewer"
        minSdk = 23
        targetSdk = 32
        versionCode = 1
        versionName = "0.1"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    buildFeatures {
        dataBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(project(":yenaly_libs"))

    implementation("androidx.core:core-ktx:1.8.0")
    implementation("androidx.appcompat:appcompat:1.4.2")
    implementation("com.google.android.material:material:1.6.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.5.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.5.0")
    implementation("androidx.fragment:fragment-ktx:1.5.0")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("org.jsoup:jsoup:1.14.3")
    implementation("io.coil-kt:coil:2.1.0")
    implementation("io.github.scwang90:refresh-header-material:2.0.5")
    implementation("io.github.scwang90:refresh-footer-classics:2.0.5")
    implementation("com.github.li-xiaojun:XPopup:2.8.3")
    implementation("com.github.li-xiaojun:XPopupExt:0.0.8")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("cn.jzvd:jiaozivideoplayer:7.7.0")
    implementation("com.github.MZCretin:ExpandableTextView:v1.6.1-x")
    implementation("androidx.room:room-runtime:2.4.2")
    implementation("androidx.room:room-ktx:2.4.2")
    implementation("androidx.navigation:navigation-fragment:2.5.0")
    implementation("androidx.navigation:navigation-fragment-ktx:2.5.0")
    implementation("androidx.navigation:navigation-ui:2.5.0")
    implementation("androidx.navigation:navigation-ui-ktx:2.5.0")
    implementation("androidx.preference:preference-ktx:1.2.0")
    implementation("dev.rikka.rikkax.material:material-preference:2.0.0")
    implementation("com.drakeet.about:about:2.5.1")
    implementation("com.drakeet.multitype:multitype:4.3.0")

    kapt("androidx.room:room-compiler:2.4.2")

    testImplementation("junit:junit:4.13.2")

    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}

configurations.all {
    exclude(group = "androidx.appcompat", module = "appcompat")
}