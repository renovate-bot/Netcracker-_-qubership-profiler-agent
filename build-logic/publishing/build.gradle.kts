plugins {
    id("build-logic.kotlin-dsl-gradle-plugin")
}

dependencies {
    implementation(project(":basics"))
    implementation(project(":jvm"))
    implementation(project(":build-parameters"))
    implementation("com.github.vlsi.gradle-extensions:com.github.vlsi.gradle-extensions.gradle.plugin:2.0.0")
    implementation("com.gradleup.nmcp:com.gradleup.nmcp.gradle.plugin:0.1.5")
    implementation("com.gradleup.shadow:com.gradleup.shadow.gradle.plugin:8.3.6")
    implementation("org.apache.ant:ant:1.10.15")
}
