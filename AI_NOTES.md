# AI_NOTES.md

## AI Tool Used

ChatGPT

## 1. Which parts were AI-generated vs. written by me

### AI-assisted

ChatGPT helped generate or provide initial drafts/examples for:

- Expense model structure (Expense.java)
- Service layer methods for:
  - Adding expenses
  - Retrieving expenses
  - Category filtering
  - Expense totals
  - Deleting expenses
- REST controller endpoint examples
- JSON file persistence approach using Jackson
- Swagger/OpenAPI integration guidance
- Sample test data and API requests

### Written and integrated by me

I personally:

- Created the Spring Boot project using Spring Initializr.
- Set up the package structure (controller, service, model).
- Created the project files and organized them.
- Added dependencies and configured the project.
- Created and managed expenses.json.
- Integrated the generated code into the application.
- Added the GET /expenses/{id} endpoint.
- Tested and debugged the application.
- Created README.md and project documentation.
- Configured and verified Swagger UI.

---

## 2. What I validated, tested, or changed

I reviewed and validated all AI-generated code before using it.

Changes and fixes made during development:

- Fixed package naming inconsistencies between files.
- Corrected import statements that caused compilation errors.
- Resolved application startup issues caused by port conflicts.
- Verified JSON persistence by checking expenses.json after API requests.
- Tested all endpoints using Postman.
- Tested API documentation through Swagger UI.
- Confirmed that IDs were generated correctly and expenses could be retrieved and deleted successfully.

Reason:

I wanted to ensure the generated code worked correctly in my project environment and matched the assignment requirements.

---

## 3. AI suggestions not used

I chose not to implement several suggestions:

### MySQL Database

Not used because the assignment explicitly allowed local JSON file storage and did not require a database.

### Docker Support

Not used because I selected Swagger/OpenAPI as my optional bonus feature.

### Monthly Summary Endpoint

Not used because it was outside the required functionality and I preferred to focus on completing and testing the core requirements thoroughly.

---

## Final Notes

AI was used as a development assistant for guidance, code examples, and troubleshooting. All code was reviewed, integrated, tested, and validated by me before submission.