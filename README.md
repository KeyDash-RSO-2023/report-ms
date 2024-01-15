# KeyDash Report Service

## Overview
The KeyDash Report Service is a Spring Boot microservice application designed to handle game report storage and report generation for the KeyDash app, a typing speed test platform. This service is a critical component in the KeyDash ecosystem, ensuring data integrity and providing valuable insights through reports.

## Features
- **Game Report Storage:** Securely stores game results submitted by users.
- **Report Generation:** Generates comprehensive reports based on user performance metrics.

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites
- Java JDK 11 or higher
- Maven 3.6 or higher
- MySQL 8.0 or higher (or another compatible database)

### Installation
1. **Clone the repository**
`git clone [repository-url]`

2. **Navigate to the project directory**
`cd keydash-report-service`

3. **Configure application properties**
- Edit `src/main/resources/application.properties` to set your database connection and other environment-specific properties.

4. **Build the project**
`mvn clean install`

5. **Run the application**
`java -jar target/keydash-report-service-0.0.1-SNAPSHOT.jar`


## Usage
The service provides RESTful endpoints for storing and retrieving game reports. Below are the key endpoints:

- **POST /reports**: Submits a new game report.
- **GET /reports/{userId}**: Retrieves reports for a specific user.

## Architecture
This service is part of the KeyDash microservices architecture and interacts with the following components:
- Frontend Application
- Other Microservices (Authentication, User Profile, etc.)

## Swagger
For API docs UI, use path `/swagger-ui/index.html`, for example http://localhost:8080/swagger-ui/index.html. 

## Contributing
Please read `CONTRIBUTING.md` for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning
We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](repository-url/tags).

## Authors
- **Tilen & Alen**

## License
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

## Acknowledgments
- Hat tip to anyone whose code was used
