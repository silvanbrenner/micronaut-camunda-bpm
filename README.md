# micronaut-camunda-bpm
Integration between Micronaut and Camunda BPM Process Engine

# Getting Started
## Install Micronaut CLI
Install SDKMAN and Micronaut CLI by following the instructions on https://micronaut.io/download.html

To later update the `mn` CLI application invoke `sdk update micronaut`.

## Run in IntelliJ IDEA

To import a Micronaut project into IntelliJ IDEA simply open the build.gradle file and follow the instructions to import the project.

For IntelliJ IDEA if you plan to use the IntelliJ compiler then you should enable annotation processing under the "Build, Execution, Deployment → Compiler → Annotation Processors" by ticking the "Enable annotation processing" checkbox.

Once you have enabled annotation processing in IntelliJ you can run the application and tests directly within the IDE without the need of an external build tool such as Gradle.

## Run in console

Unix:
```
cd micronaut-camunda-app
./gradlew clean run
```

Windows:

```
cd micronaut-camunda-app
gradlew.bat clean run
```
