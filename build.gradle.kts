plugins {
    java
    id("org.springframework.boot") version "3.5.10"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
description = "Demo project for Spring Boot"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("com.typesafe.akka:akka-stream_3:2.8.6")
    implementation("com.typesafe.akka:akka-actor_3:2.8.6")
    implementation("org.apache.httpcomponents:httpclient:4.3.5")
    implementation("com.squareup.okhttp3:logging-interceptor:4.7.1)
    implementation("org.codehaus.plexus:plexus-utils:2.0.7")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
