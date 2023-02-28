plugins {
    id("ara.library.compose.feature")
    id("ara.hilt")
}

android {
    namespace = "ara.note.notedetail"
}

dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.google.android.material)
    implementation(libs.kotlinx.datetime)
}
