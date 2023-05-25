//pluginManagement {
//    repositories {
//        mavenCentral()
//        gradlePluginPortal()
//    }
//}

rootProject.name = "chatterdb"
include("adapter:persistence")
include("adapter:rest")
include("core:port:input")
include("core:port:output")
include("core:service")
include("core:domain")
