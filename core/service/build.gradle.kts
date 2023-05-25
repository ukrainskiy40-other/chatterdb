plugins {
    java
    id("io.freefair.lombok") version "5.3.3.3"
}
dependencies {
    implementation(project(":core:port:input"))
    implementation(project(":core:port:output"))
    implementation(project(":core:domain"))
    implementation(project(":adapter:persistence"))
}
