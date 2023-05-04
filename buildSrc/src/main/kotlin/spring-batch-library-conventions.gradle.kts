val versionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

plugins {
    `java-library`
    groovy
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(versionCatalog.findVersion("java").get().toString()))
    }
}


repositories {
    mavenCentral()
}

dependencies {
    implementation(platform(versionCatalog.findLibrary("spring-boot").get()))

    api("org.springframework.boot:spring-boot-starter-batch")

    compileOnly("org.projectlombok:lombok")

    annotationProcessor("org.projectlombok:lombok")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.batch:spring-batch-test")
    testImplementation(versionCatalog.findLibrary("spock-spring").get())
}

tasks.withType<Test> {
    useJUnitPlatform()
}