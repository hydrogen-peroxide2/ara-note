plugins {
    id("ara.library.compose.feature")
    id("ara.hilt")
}

android {
    namespace = "ara.note.settings"
}

dependencies {
    implementation(project(":core:backup"))
}
