plugins {
    kotlin("jvm") version "2.0.20"
}

group = "com.takuron.moka.kotlin"
version = "1.0.0001"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    implementation("asia.hombre:keccak:1.0.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}