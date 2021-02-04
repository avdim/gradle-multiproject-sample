plugins {
    id("com.example.android-application")
    id("ru.example.version")
}

group = "${group}.android-app"

dependencies {
    implementation("com.example.myproduct.user-feature:table2")
    Versions.kotlinVersion
}
