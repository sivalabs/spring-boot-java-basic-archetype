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


## Developer Notes

Procedure for deploying to Maven Central https://central.sonatype.org/pages/apache-maven.html

Create or update archetypes and set version to SNAPSHOT (ex: 1.0.0-SNAPSHOT)

Deploy SNAPSHOT version to https://oss.sonatype.org/content/repositories/snapshots/

`spring-boot-java-basic-archetype> mvn clean deploy`

Deploy release version to Maven Central

```
spring-boot-java-basic-archetype> mvn release:clean release:prepare
spring-boot-java-basic-archetype> mvn release:perform`
```
