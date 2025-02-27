# Student Login Page using JDBC and Servlet

## Project Description
This project provides **boilerplate code** for beginners who want to use **JDBC** and **Servlets** for implementing authentication in their web applications. It serves as a foundational template to understand how to connect Java-based web applications to a database for user login functionality.

---

## Features
- User login functionality.
- Validation of user credentials using JDBC.
- Secure connection to a MySQL database.
- Clear and interactive user interface for login.

---

## Technology Stack
- **Frontend**: HTML, CSS (for the login form UI).
- **Backend**: Java Servlets.
- **Database**: MySQL (for storing student login credentials).
- **Middleware**: JDBC (to connect Java with the database).

---

## Prerequisites
1. **Java JDK** installed (version 8 or above).
2. **Eclipse IDE** or any Java-supported IDE.
3. **Apache Tomcat** server configured in your IDE.
4. **MySQL** installed and configured.

---

## Steps to Run the Project
1. **Clone or Download the Project**
   - Clone this repository or download the `.zip` file and extract it.

2. **Set Up the Database**
   - Create a database in MySQL.
   - Use the following script to create a table:
     ```sql
     CREATE DATABASE student_db;

     USE student_db;

     CREATE TABLE students (
         id INT AUTO_INCREMENT PRIMARY KEY,
         username VARCHAR(50) NOT NULL,
         password VARCHAR(50) NOT NULL
     );

     INSERT INTO students (username, password)
     VALUES ('student1', 'password1'), ('student2', 'password2');
     ```
   - Update the database configuration (e.g., URL, username, password) in the `DBConnection` class.

3. **Deploy the Application**
   - Open the project in your IDE.
   - Configure Apache Tomcat as the server.
   - Build the project and deploy it to the server.

4. **Run the Application**
   - Start the Apache Tomcat server.
   - Access the login page via `http://localhost:8080/YourProjectName/login`.

---

## Project Structure
```
src/main/java
|-- com.example.servlet
|   |-- LoginServlet.java
|   |-- DBConnection.java
|
src/main/webapp
|-- login.html
|-- styles.css
|-- web.xml
```

---

## Future Enhancements
- Add password encryption for security.
- Include user registration functionality.
- Implement session management after login.
- Create a detailed dashboard for students after authentication.

---

## Contributors
- **Dhanesh Koli**  
  - Role: Developer
  - Email: [dhanesh@example.com](mailto:dhanesh@example.com)

---

## License
This project is licensed under the MIT License.
