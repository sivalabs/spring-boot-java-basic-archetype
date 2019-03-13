# spring-boot-java-basic-archetype

## How to use?

This archetype is published to Maven central. 
You can generate projects using this archetype with `mvn archetype:generate` and select the archetype number.

### Install archetype locally

```
git clone https://github.com/sivalabs/spring-boot-java-basic-archetype.git
cd spring-boot-java-basic-archetype
./mvnw clean install
```

### Generate application from archetype

```
mvn archetype:generate \
    -B -DarchetypeGroupId=io.github.sivalabs.maven.archetypes \
    -DarchetypeArtifactId=spring-boot-java-basic-archetype \
    -DarchetypeVersion=0.0.1 \
    -DgroupId=com.mycompany \
    -DartifactId=myapp \
    -Dversion=1.0-SNAPSHOT \
    -Dpackage=com.mycompany.myapp
```
