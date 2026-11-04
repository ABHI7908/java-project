# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.5.4/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.5.4/maven-plugin/build-image.html)
* [Spring Data JPA](https://docs.spring.io/spring-boot/3.5.4/reference/data/sql.html#data.sql.jpa-and-spring-data)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/3.5.4/reference/using/devtools.html)
* [Validation](https://docs.spring.io/spring-boot/3.5.4/reference/io/validation.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.5.4/reference/web/servlet.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Local MySQL

The application connects only to MySQL at `localhost:3306` by default, using the
`employeedb` database and `root` user. Set these environment variables to match
your local MySQL setup before starting:

```powershell
$env:JAVA_HOME = "$HOME\.jdk\temurin-25\jdk-25.0.5+8"
$env:Path = "$env:JAVA_HOME\bin;$env:Path"
java -version
$env:MYSQL_HOST = "localhost"
$env:MYSQL_PORT = "3306"
$env:MYSQL_DATABASE = "employeedb"
$env:MYSQL_USER = "root"
$securePassword = Read-Host "MySQL password" -AsSecureString
$env:MYSQL_PASSWORD = (New-Object System.Net.NetworkCredential("", $securePassword)).Password
.\mvnw.cmd spring-boot:run
```

Create the configured database in MySQL first if it does not exist. The
application runs in the foreground; keep the terminal open while using it and
press `Ctrl+C` to stop it. The browser-based employee management page at
`http://localhost:8081/` supports adding, editing, and deleting employee rows;
these operations are saved in MySQL. To view or edit database tables directly,
connect to `localhost:3306` and select `employeedb` in MySQL Workbench. The JDBC
URL is `jdbc:mysql://localhost:3306/employeedb`; it is not an HTTP/browser URL.
Hibernate uses `ddl-auto: update` and may update its tables on startup. H2 is
not configured.

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.
