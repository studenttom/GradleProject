plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/org.testng/testng
    implementation("org.testng:testng:7.4.0")
    // https://mvnrepository.com/artifact/org.json/json
    implementation("org.json:json:20211205")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}