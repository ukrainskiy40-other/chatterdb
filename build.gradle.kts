plugins {
	java
	id("org.springframework.boot") version "2.7.11"
	id("io.spring.dependency-management") version "1.0.15.RELEASE"
}

group = "io.ukrainskiy.rnd"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

allprojects {
	repositories {
		mavenCentral()
	}

	if (subprojects.isNotEmpty()) {
		return@allprojects
	}

	apply(plugin = "java")
	apply(plugin = "io.spring.dependency-management")

	java.sourceCompatibility = JavaVersion.VERSION_17

	configurations {
		compileOnly {
			extendsFrom(configurations.annotationProcessor.get())
		}
	}

	dependencies {
		implementation("org.springframework.boot:spring-boot-starter-batch")
		implementation("org.springframework.boot:spring-boot-starter-data-r2dbc")
		runtimeOnly("org.postgresql:postgresql")
		runtimeOnly("org.postgresql:r2dbc-postgresql")
		implementation("org.liquibase:liquibase-core:4.20.0")

		testImplementation("org.springframework.boot:spring-boot-starter-test")
		testImplementation("io.projectreactor:reactor-test")
		testImplementation("org.springframework.batch:spring-batch-test")

	}

	dependencyManagement {
		imports {
			mavenBom(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES)
		}
	}
}


dependencies {
	implementation("org.springframework.boot:spring-boot-starter-batch")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("io.projectreactor:reactor-test")
	testImplementation("org.springframework.batch:spring-batch-test")

	implementation(project(":adapter:persistence"))
	implementation(project(":adapter:rest"))
	implementation(project(":core:port:input"))
	implementation(project(":core:port:output"))
}

tasks.withType<Test> {
	useJUnitPlatform()
}
