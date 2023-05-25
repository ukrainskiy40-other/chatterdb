
//plugins {
//	java
//	id("io.freefair.lombok") version "5.3.3.3"
//}
dependencies {
	implementation("org.springframework.boot:spring-boot-starter-webflux")
	implementation("org.projectlombok:lombok")
	compileOnly("org.projectlombok:lombok")
	compileOnly("org.mapstruct:mapstruct:1.5.3.Final")
	annotationProcessor("org.mapstruct:mapstruct-processor:1.5.3.Final")
	annotationProcessor("org.projectlombok:lombok-mapstruct-binding:0.2.0")
//	annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
	annotationProcessor("org.projectlombok:lombok")


//    //lombok
//	annotationProcessor("org.projectlombok:lombok:1.18.24")
//	implementation("org.projectlombok:lombok:1.18.24")
//	//mapstruct
//	implementation("org.mapstruct:mapstruct:1.5.3.Final")
//	implementation("org.mapstruct:mapstruct-processor:1.5.3.Final")
//
    implementation(project(":core:port:output"))
    implementation(project(":core:service"))
    implementation(project(":adapter:persistence"))
}

