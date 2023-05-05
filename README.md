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