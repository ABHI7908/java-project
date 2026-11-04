<h1 align="center">💼 Employee Management System</h1>

<p align="center">
  <b>Spring Boot • MySQL • REST API • CRUD Application</b>
</p>

<p align="center">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="50"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" width="50"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original.svg" width="50"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/maven/maven-original.svg" width="50"/>
</p>

<hr>

<h2>📘 Overview</h2>
<p>
The <b>Employee Management System</b> is a CRUD-based RESTful application built using
<b>Spring Boot</b> and <b>MySQL</b>.
It demonstrates clean layered architecture, environment-based configuration,
Jakarta Bean Validation, and Global Exception Handling.
</p>

<hr>

<h2>⚙️ Technologies Used</h2>
<ul>
  <li>☕ <b>Java 25 LTS</b></li>
  <li>🌱 <b>Spring Boot</b> (Spring Web, Spring Data JPA)</li>
  <li>🐬 <b>MySQL</b></li>
  <li>🧾 <b>Jakarta Validation</b></li>
  <li>📦 <b>Maven</b></li>
</ul>

<hr>

 <h2>✨ Features</h2>
  <ul>
    <li>📌 CRUD APIs for Employee Management</li>
    <li>🐳 Fully Dockerized backend</li>
    <li>⚡ Fast startup & lightweight image</li>
  </ul>

  <hr />
  
<h2>📁 Project Structure</h2>

<pre>
.
├── .mvn/wrapper/              Maven Wrapper configuration
├── src/
│    ├── main/
│    │    ├── java/com/suvam/
│    │    │    ├── SpringbootCrudH2DbApplication.java
│    │    │    ├── controller/
│    │    │    │    └── EmployeeController.java
│    │    │    ├── exceptions/
│    │    │    │    └── GlobalExceptionHandeller.java
│    │    │    ├── model/
│    │    │    │    └── Employee.java
│    │    │    ├── repository/
│    │    │    │    └── EmployeeRepository.java
│    │    │    └── service/
│    │    │         └── EmployeeService.java
│    │    └── resources/
│    │         ├── application.yml
│    │         └── static/
│    │              └── index.html
│    └── test/
│         ├── java/com/suvam/
│         │    └── SpringbootCrudH2DbApplicationTests.java
├── .gitignore
├── Dockerfile
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
</pre>

<hr>

<h2>🔐 Environment Variables</h2>
  <table border="1" cellpadding="8" cellspacing="0">
    <tr>
      <th>Variable</th>
      <th>Description</th>
    </tr>
    <tr>
      <td>MYSQL_HOST</td>
      <td>MySQL server host (default: localhost)</td>
    </tr>
    <tr>
      <td>MYSQL_PORT</td>
      <td>MySQL server port (default: 3306)</td>
    </tr>
    <tr>
      <td>MYSQL_DATABASE</td>
      <td>Existing database/schema name (default: employeedb)</td>
    </tr>
    <tr>
      <td>MYSQL_USER</td>
      <td>Database username (default: root)</td>
    </tr>
    <tr>
      <td>MYSQL_PASSWORD</td>
      <td>Database password; do not commit it to source control</td>
    </tr>
  </table>

<h2>🧪 API Endpoints</h2>
  <table border="1" cellpadding="8" cellspacing="0">
    <tr>
      <th>Method</th>
      <th>Endpoint</th>
      <th>Description</th>
    </tr>
    <tr>
      <td>GET</td>
      <td>demo/employee</td>
      <td>Get all employees</td>
    </tr>
    <tr>
      <td>GET</td>
      <td>demo/employee/{id}</td>
      <td>Get employee by ID</td>
    </tr>
    <tr>
      <td>POST</td>
      <td>demo/employee</td>
      <td>Create new employee</td>
    </tr>
    <tr>
      <td>PUT</td>
      <td>demo/employee/{id}</td>
      <td>Update employee</td>
    </tr>
    <tr>
      <td>DELETE</td>
      <td>demo/employee/{id}</td>
      <td>Delete employee</td>
    </tr>
  </table>

  <hr />

<h2>🗄️ Database Admin (phpMyAdmin)</h2>
<p>
Start Docker Desktop, then run <code>docker compose up -d</code> from the project
root. Open <a href="http://localhost:8082">http://localhost:8082</a> and sign in
with the MySQL username and password configured for the application (defaults to
user <code>root</code>). The admin page connects to the MySQL server on this
computer at port <code>3306</code>. It is bound to localhost and is not exposed
to other machines.
</p>

<h2>📦 Sample JSON Request</h2>

<pre>
{
  "fName": "Suvam",
  "lName": "Debnath",
  "email": "suvam.debnath@example.com",
  "gender": "Male"
}
</pre>

<hr>

<h2>⚠️ Global Exception Handling</h2>

<p>
Validation errors are handled using <code>@RestControllerAdvice</code> and
<code>@ExceptionHandler</code> to provide clean and consistent error responses.
</p>

<hr>

<h2>🧩 Architecture Flow</h2>

<pre>
Client
  ↓
Controller
  ↓
Service
  ↓
Repository
  ↓
MySQL Database
</pre>

<hr>


<h2>🚀 Build, Run & Docker Workflow</h2>

<h3>🔐 Step 1: Configure MySQL</h3>

<p>
Create the database in MySQL if it does not already exist. For example, connect
to your local MySQL server and run:
</p>

<pre>
CREATE DATABASE employeedb;
</pre>

<p>The application uses MySQL only and reads connection settings from
<code>MYSQL_*</code> environment variables. It defaults to
<code>localhost:3306</code>, database <code>employeedb</code>, and
user <code>root</code>. Set <code>MYSQL_PASSWORD</code> locally without
putting the password in the repository.</p>

<p><b>Windows (PowerShell)</b></p>
<pre>
$env:JAVA_HOME = "$HOME\.jdk\temurin-25\jdk-25.0.5+8"
$env:Path = "$env:JAVA_HOME\bin;$env:Path"
java -version
$env:MYSQL_HOST="localhost"
$env:MYSQL_PORT="3306"
$env:MYSQL_DATABASE="employeedb"
$env:MYSQL_USER="root"
$securePassword = Read-Host "MySQL password" -AsSecureString
$env:MYSQL_PASSWORD = (New-Object System.Net.NetworkCredential("", $securePassword)).Password
.\mvnw.cmd spring-boot:run
</pre>

<p>Run these commands from PowerShell in the project directory after ensuring
the <code>employeedb</code> database exists in MySQL. Maven runs the application
in the foreground; keep this terminal open while using it, and press
<code>Ctrl+C</code> to stop it. Set <code>MYSQL_HOST</code>,
<code>MYSQL_PORT</code>, <code>MYSQL_DATABASE</code>, and <code>MYSQL_USER</code>
to match your MySQL setup if you are not using the defaults. The application's
JDBC connection is
<code>jdbc:mysql://localhost:3306/employeedb</code>; use MySQL Workbench with
host <code>localhost</code> and port <code>3306</code> to browse the database.
This JDBC address is not a browser URL. For employee CRUD in a browser, open
<code>http://localhost:8081/</code>; changes made there are stored in MySQL.
Swagger API documentation is at
<code>http://localhost:8081/swagger-ui/index.html</code>.</p>

<p><b>Linux / macOS</b></p>
<pre>
export MYSQL_HOST=localhost
export MYSQL_PORT=3306
export MYSQL_DATABASE=employeedb
export MYSQL_USER=root
read -s MYSQL_PASSWORD
export MYSQL_PASSWORD
</pre>

<hr>

<h3>📦 Step 2: Build JAR using Maven Wrapper</h3>

<pre>
./mvnw package
</pre>

<p>
This command generates a runnable JAR file inside the <code>target/</code> directory.
</p>

<hr>

<h3>🐳 Step 3: Create Docker Image</h3>

<p>After creating the <code>Dockerfile</code> in the Spring Boot project root:</p>

<pre>
docker build -t employee-management .
</pre>

<hr>

<h3>▶️ Step 4: Run Docker Container with Environment Variables</h3>

<p>
Run the Docker image while connecting to a <b>local MySQL database</b>
using environment variables:
</p>

<pre>
docker run -p 8081:8081 -e MYSQL_HOST=host.docker.internal -e MYSQL_PORT=3306 -e MYSQL_DATABASE=employeedb -e MYSQL_USER=root -e MYSQL_PASSWORD employee-management
</pre>

<p>Set <code>MYSQL_PASSWORD</code> in your local environment before running this
command; Docker passes it through without putting the password in the command.
The MySQL database must already exist and be reachable from the container.</p>

<p>
Application will be available at:  
<b>http://localhost:8081</b>
</p>

<hr>

<h3>📤 Step 5: Push Docker Image to Docker Hub</h3>

<pre>
docker tag employee-management suvam478/employee-management
docker login
docker push suvam478/employee-management
</pre>

<p>
Once pushed, anyone can pull and run the image directly from Docker Hub.
</p>


<hr>
<h2>👨‍💻 Author</h2>
<p>
<b>Developed by:</b> Suvam Debnath
</p>
