plugins {
    id("ara.library")
}

android {
    namespace = "ara.note.domain"
}

dependencies {

    implementation(project(":core:entity"))
    implementation(project(":core:data"))
    implementation(project(":core:util"))
    implementation(project(":core:preference"))

    implementation(libs.javax.inject)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.datetime)
}
