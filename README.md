# Automatic ID Card Maker

## Project Overview
The Automatic ID Card Maker is a web application designed to streamline the process of creating ID cards for different organizations, schools, or institutions. It provides functionality to manage user information, including both organizational users and school users. The application is built using Spring Boot for the backend and Angular for the frontend.

## Table of Contents
- [Setup Instructions](#setup-instructions)
- [API Documentation](#api-documentation)
- [Detailed View](#detailed-view)

## Setup Instructions
### 1. Clone the Repository:
```bash
git clone https://github.com/knightabir/Automatic_ID_Card_Maker.git
cd Automatic_ID_Card_Maker
```

### 2. Backend Setup:
- Navigate to the `backend` directory and follow the README for backend setup instructions.

### 3. Frontend Setup:
- Navigate to the `frontend` directory and follow the README for frontend setup instructions.

### 4. Run the Application:
- Start the backend server.
- Start the frontend application.

### 5. Access the Application:
- Open a web browser and go to [http://localhost:frontend-port](http://localhost:frontend-port) (replace `frontend-port` with the actual port configured for the frontend).

## API Documentation
### OrgUser API
#### Create OrgUser
- **Endpoint:** `POST /orguser/`
- **Request Body:**
```json
// Sample JSON
{
  "email": "demo_user@example.com",
  "password": "demoPassword123",
  "phone": "123-456-7890",
  "firstName": "John",
  "lastName": "Doe",
  "organization": "Demo Organization",
  "officeAddress": "123 Main Street, Cityville",
  "role": "Employee"
}
```
#### Get OrgUser by ID
- **Endpoint:** `GET /orguser/{userId}`

#### Update OrgUser by ID
- **Endpoint:** `PUT /orguser/{userId}`
- **Request Body:** Same as create

#### Get All OrgUsers
- **Endpoint:** `GET /orguser/all`

#### Delete OrgUser by ID
- **Endpoint:** `DELETE /orguser/{userId}`

### OrgId API
#### Create OrgId
- **Endpoint:** `POST /orgid/`
- **Request Body:**
```json
// Sample JSON
{
  "firstName": "John",
  "lastName": "Doe",
  "phone": "123-456-7890",
  "position": "Manager",
  "candidateAddress": "456 Side Street, Townsville",
  "email": "john.doe@example.com",
  "dateOfJoin": "2022-01-01",
  "blood": "O+",
  "orgUser": {
    "id": 1
  }
}
```

#### Get OrgId by ID
- **Endpoint:** `GET /orgid/{userId}`

#### Update OrgId by ID
- **Endpoint:** `PUT /orgid/{userId}`
- **Request Body:** Same as create

#### Get All OrgIds
- **Endpoint:** `GET /orgid/all`

#### Delete OrgId by ID
- **Endpoint:** `DELETE /orgid/{userId}`

### SchoolUser API
- (Repeat similar pattern for SchoolUser API)

### SchoolId API
- (Repeat similar pattern for SchoolId API)

## Detailed View
- (Provide additional details or insights about the project, architecture, or any specific features.)
