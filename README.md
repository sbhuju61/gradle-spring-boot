# gradle-spring-boot

```text
`spring-batch-library` is used by `batch-app-one` and `batch-app-two`
.
├── batch-app-one
│   ...
│   └── build.gradle.kts
├── batch-app-two
│   ...
│   └── build.gradle.kts
├── buildSrc
│   ├── build.gradle.kts
│   ├── settings.gradle.kts
│   ├── src
│   │   ├── main
│   │   │   └── kotlin
│   │   │       ├── shared-batch-app-conventions.gradle.kts
│   │   │       └── spring-batch-library-conventions.gradle.kts
├── spring-batch-library
│   ...
│   └── build.gradle.kts
└── settings.gradle.kts
```

#### NOTE: If using IntelliJ IDEA, IntelliJ IDEA Ultimate is required for Spring/Spring Boot support.

### Running the batch-app-one application
1. Go to `batch-app-one\src\test\groovy\com\example\batchappone\config\ExportUserJobIntegrationTest.groovy`
2. Launch Test

### Running the batch-app-two application
1. Go to `batch-app-two\src\test\groovy\com\example\batchapptwo\config\ImportUserBatchIntegrationTest.groovy`
2. Launch Test