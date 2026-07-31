# Smart Expense Tracker API

A RESTful API built using **Spring Boot** to manage personal expenses. This API allows users to add expenses, view expenses, filter expenses by category, calculate total expenses, and delete expenses.

The application stores expense data in a local JSON file (`expenses.json`) for persistence.

## Features

* Add a new expense
* View all expenses
* Get expense details by ID
* Filter expenses by category
* Calculate total expenses
* Calculate total expenses by category
* Delete an expense
* Swagger/OpenAPI API Documentation
* Unit Testing using JUnit 5

## Technologies Used

* Java 17
* Spring Boot
* Maven
* Jackson (JSON Processing)
* Swagger/OpenAPI
* JUnit 5

## Project Structure

```
smart-expense-tracker-api/
│
├── README.md
├── AI_NOTES.md
├── expenses.json
├── pom.xml
│
└── src/
    ├── main/
    │   └── java/
    │       └── com/example/expense_tracker_api/
    │
    └── test/
        └── java/
```

## Prerequisites

Before running the application, make sure you have:

* Java 17 installed
* Maven installed
* Git installed

Verify Java installation:

```bash
java -version
```

Verify Maven installation:

```bash
mvn -version
```

## Installation

Clone the repository:

```bash
git clone <https://github.com/ShreyaKR26/expense-tracker-api>
```

Navigate to the project directory:

```bash
cd smart-expense-tracker-api
```

Install dependencies and build the project:

```bash
mvn clean install
```

## Running the Application

Start the Spring Boot application using:

```bash
mvn spring-boot:run
```

The application will start at:

```
http://localhost:8081
```

## Running Tests

Execute the test suite using:

```bash
mvn test
```

All unit tests should pass successfully.

## Swagger API Documentation

Swagger UI is available at:

```
http://localhost:8081/swagger-ui/index.html
```

Using Swagger, you can test all API endpoints directly from the browser.

## API Endpoints

### Add Expense

**POST**

```
/expenses
```

Example Request:

```json
{
  "title": "Food",
  "amount": 400,
  "category": "Food",
  "date": "2026-07-31"
}
```

---

### View All Expenses

**GET**

```
/expenses
```

---

### Get Expense By ID

**GET**

```
/expenses/{id}
```

---

### Filter Expenses By Category

**GET**

```
/expenses/category/{category}
```

Example:

```
/expenses/category/Food
```

---

### Calculate Total Expenses

**GET**

```
/expenses/total
```

---

### Calculate Total Expenses By Category

**GET**

```
/expenses/total/{category}
```

Example:

```
/expenses/total/Food
```

---

### Delete Expense

**DELETE**

```
/expenses/{id}
```

---

## Data Storage

Expense details are stored locally in:

```
expenses.json
```

This file is automatically updated whenever expenses are added or deleted.

## Testing

The project includes JUnit 5 test cases covering:

* Adding expenses
* Fetching expenses
* Filtering by category
* Calculating totals
* Deleting expenses

## Author

Shreya K R

```
```
