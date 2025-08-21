This project is a simple Java application demonstrating fundamental database interactions using the JDBC (Java Database Connectivity) API. It showcases how to perform CRUD (Create, Read, Update, Delete) operations on a database table.

A key feature of this project is the exclusive use of PreparedStatement for all SQL queries. This approach is crucial for preventing SQL injection attacks and improving performance by pre-compiling SQL statements.

## Key Features
Database Connectivity: Establishes and manages a connection to a SQL database.

Create: Insert new records into the database.

Read: Retrieve and display records from the database.

Update: Modify existing records.

Delete: Remove records from the database.

Secure Queries: Utilizes PreparedStatement to safely handle user input and prevent SQL injection.

## Prerequisites
Java Development Kit (JDK) 8

A running SQL database instance (e.g., MySQL)

The appropriate JDBC driver for your database.
