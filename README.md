# Smart Expense Tracker API

A RESTful API built using Spring Boot to manage personal expenses. Users can add expenses, view all expenses, filter expenses by category, calculate total expenses, and delete expenses. Data is stored in a local JSON file (`expenses.json`) for persistence.

## Features

- Add a new expense
- View all expenses
- Get expense by ID
- Filter expenses by category
- Calculate total expenses
- Calculate total expenses by category
- Delete an expense
- Swagger/OpenAPI Documentation

## Technologies Used

- Java 17
- Spring Boot
- Maven
- Jackson
- Swagger/OpenAPI
- JUnit 5

## Project Structure

expense-tracker-api/
├── README.md
├── AI_NOTES.md
├── expenses.json
├── pom.xml
├── src/
└── src/test/

## Installation

```bash
git clone <https://github.com/ShreyaKR26/expense-tracker-api>
cd expense-tracker-api
mvn clean install
```

## Run Application

```bash
mvn spring-boot:run
```

Application URL:

```text
http://localhost:8081
```

## Run Tests

```bash
mvn test
```

## Swagger Documentation

```text
http://localhost:8081/swagger-ui/index.html
```

## API Endpoints

### Add Expense

POST /expenses

### View All Expenses

GET /expenses

### Get Expense By ID

GET /expenses/{id}

### Filter By Category

GET /expenses/category/{category}

### Total Expenses

GET /expenses/total

### Total Expenses By Category

GET /expenses/total/{category}

### Delete Expense

DELETE /expenses/{id}

## Data Storage

Expenses are stored in a local JSON file named `expenses.json`.
