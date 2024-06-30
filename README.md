To provide instructions on how to run and test the Rest API locally, here is a detailed guide:

# Previous requirements

Make sure you have the following items installed on your local machine:

1. **Java Development Kit (JDK) 22**: Verify the installation with the `java -version` command.
2. **Apache Maven**: Verify the installation with the `mvn -version` command.
3. **Docker**: Verify the installation with the `docker --version` command.

### Step 1: Clone this Repository

### Step 2: Configure the Database

Make sure you have a MySQL instance running and configure the credentials in the Spring Boot `application.properties` or `application.yml` file:

```properties
# src/main/resources/application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/Chargin_Sation
spring.datasource.username=your_user
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto = update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

### Step 3: Build and Run the Application

Use Maven to build and run the application:

```
# Compile the application
mvn clean install

# Run the application
mvn spring-boot:run
```

### Step 4: Test the API

Once the application is running, you can test the endpoints using tools like `curl`, `Postman` 

### Step 5: Run Tests

To run the unit and integration tests configured in your project, use the following command:

```
mvn test
```
