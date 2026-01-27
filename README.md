<h1 align="center">💼 Employee Management System</h1>

<p align="center">
  <b>Spring Boot • PostgreSQL • REST API • CRUD Application</b>
</p>

<p align="center">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="50"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" width="50"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/postgresql/postgresql-original.svg" width="50"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/maven/maven-original.svg" width="50"/>
</p>

<hr>

<h2>📘 Overview</h2>
<p>
The <b>Employee Management System</b> is a CRUD-based RESTful application built using
<b>Spring Boot</b> and <b>PostgreSQL</b>.  
It demonstrates clean layered architecture, environment-based configuration,
Jakarta Bean Validation, and Global Exception Handling.
</p>

<hr>

<h2>⚙️ Technologies Used</h2>
<ul>
  <li>☕ <b>Java 21+</b></li>
  <li>🌱 <b>Spring Boot</b> (Spring Web, Spring Data JPA)</li>
  <li>🐘 <b>PostgreSQL</b></li>
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
src/
 └── main/
     ├── java/
     │    └── com/suvam/
     │         ├── controller/
     │         │     ├── EmployeeController.java
     │         │     └── GlobalExceptionHandler.java
     │         ├── model/
     │         │     └── Employee.java
     │         ├── repository/
     │         │     └── EmployeeRepository.java
     │         └── service/
     │               └── EmployeeService.java
     └── resources/
          └── application.yml
</pre>

<hr>

<h2>🔐 Environment Variables</h2>
  <table border="1" cellpadding="8" cellspacing="0">
    <tr>
      <th>Variable</th>
      <th>Description</th>
    </tr>
    <tr>
      <td>DB_URL</td>
      <td>PostgreSQL JDBC URL</td>
    </tr>
    <tr>
      <td>DB_USER</td>
      <td>Database username</td>
    </tr>
    <tr>
      <td>DB_PWD</td>
      <td>Database password</td>
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
      <td>demo/employees</td>
      <td>Get all employees</td>
    </tr>
    <tr>
      <td>GET</td>
      <td>demo/employees/{id}</td>
      <td>Get employee by ID</td>
    </tr>
    <tr>
      <td>POST</td>
      <td>demo/employees</td>
      <td>Create new employee</td>
    </tr>
    <tr>
      <td>PUT</td>
      <td>demo/employees/{id}</td>
      <td>Update employee</td>
    </tr>
    <tr>
      <td>DELETE</td>
      <td>demo/employees/{id}</td>
      <td>Delete employee</td>
    </tr>
  </table>

  <hr />

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
PostgreSQL Database
</pre>

<hr>


<h2>🚀 Build, Run & Docker Workflow</h2>

<h3>🔐 Step 1: Set Environment Variables (Terminal)</h3>

<p><b>Windows (PowerShell)</b></p>
<pre>
$env:DB_URL="jdbc:postgresql://localhost:5432/EmployeeCRUD"
$env:DB_USER="postgres"
$env:DB_PWD="suvam123"
</pre>

<p><b>Linux / macOS</b></p>
<pre>
export DB_URL=jdbc:postgresql://localhost:5432/EmployeeCRUD
export DB_USER=postgres
export DB_PWD=suvam123
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
Run the Docker image while connecting to a <b>local PostgreSQL database</b>
using environment variables:
</p>

<pre>
docker run -p 8081:8081 \
-e DB_URL="jdbc:postgresql://host.docker.internal:5432/EmployeeCRUD" \
-e DB_USER="postgres" \
-e DB_PWD="suvam123" \
employee-management
</pre>

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
