# What is that?
REST CRUD backend with Spring Boot for self improvement purpose.

### Stack
* OpenJDK 11
* Spring Boot 2.4.2
* Spring Data JPA
* Docker
* H2
* Lombok
* Mapstruct
* Mockito

### Build
```mvn clean package -DskipTests```

### Test
```mvn test```

### Run
```mvn spring-boot:run``` 

###### Known bugs / TODOs
* JPA should return Set of objects not a list.
    * override equals and hashCode then.
* Remove redundant annotations on Entities
* Write integration tests
* Create some class for Constants
* Inserts are not working in data.sql for H2
* Create dev, prod profiles
* Not sure what creates SQL schema data.sql or spring.jpa.hibernate.ddl-auto=update ?
* Anemic model to bounded context with package-private classes
* Add validation to REST and some custom error handling
