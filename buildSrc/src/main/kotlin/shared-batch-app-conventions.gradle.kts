val versionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

plugins {
   java
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
    implementation(project(":spring-batch-library"))


    compileOnly("org.projectlombok:lombok")

    annotationProcessor("org.projectlombok:lombok")
    annotationProcessor(platform(versionCatalog.findLibrary("spring-boot").get()))

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.batch:spring-batch-test")
    testImplementation(versionCatalog.findLibrary("spock-spring").get())
    testImplementation("com.h2database:h2")
}

tasks.withType<Test> {
    useJUnitPlatform()
}