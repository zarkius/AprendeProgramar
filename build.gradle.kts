android {
    // ... other configurations

    signingConfigs {
        create("debug") {
            storeFile = file("debug.keystore") // Or the path to your keystore
            storePassword = "android"
            keyAlias = "androiddebugkey"
            keyPassword = "android"
        }
    }

    buildTypes {
        getByName("debug") {
            signingConfig = signingConfigs.getByName("debug")
        }
        // ... other build types
    }
}