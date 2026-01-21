# Ruumy E2E

> End-to-End Testing Project for Room Booking System

## 📋 Overview

This is a Spring Boot-based End-to-End (E2E) testing project for a room booking system called "Ruumy". The project uses Cucumber BDD (Behavior-Driven Development) for defining test scenarios in a human-readable format and REST Assured for API testing.

## 🏗️ Project Information

- **Group ID**: tech.buildrun
- **Artifact ID**: ruumye2e
- **Version**: 0.0.1-SNAPSHOT
- **Name**: ruumye2e
- **Description**: Demo project for Spring Boot
- **Java Version**: 21

## 🚀 Technologies Used

### Core Framework
- **Spring Boot**: 3.4.4
- **Spring Boot Web**: For building web applications
- **Java**: 21

### Testing Frameworks
- **Cucumber**: 7.22.0 - BDD testing framework
  - cucumber-java
  - cucumber-junit-platform-engine
  - cucumber-spring
- **REST Assured**: 5.5.1 - Java library for testing REST APIs
- **JUnit Platform Suite**: For running test suites
- **Spring Boot Starter Test**: For unit and integration testing

## 📦 Prerequisites

Before running this project, make sure you have:

- **Java 21** or higher installed
- **Maven** 3.6+ installed (or use the included Maven Wrapper)
- **Git** for version control

## 🔧 Installation

1. Clone the repository:
```bash
git clone https://github.com/matalvesdev/Build-Run-Rummy.git
cd Build-Run-Rummy
```

2. Build the project:
```bash
./mvnw clean install
```

Or on Windows:
```bash
mvnw.cmd clean install
```

## ▶️ Running the Application

Start the Spring Boot application:

```bash
./mvnw spring-boot:run
```

Or on Windows:
```bash
mvnw.cmd spring-boot:run
```

## 🧪 Running Tests

The project includes Cucumber BDD tests for the following features:

- **Room Management**: Create and manage room resources
- **Booking**: Book available rooms
- **Unbooking**: Cancel room bookings
- **Site**: General site functionality

### Run all tests:
```bash
./mvnw test
```

Or on Windows:
```bash
mvnw.cmd test
```

### Test Features

The test scenarios are written in Gherkin format and cover:

1. **Room Feature**: Managing room availability
2. **Book Feature**: Booking rooms for meetings
3. **Unbook Feature**: Canceling room reservations
4. **Site Feature**: General website functionalities

## 📁 Project Structure

```
ruumye2e/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── tech/buildrun/ruumye2e/
│   │   │       └── Ruumye2eApplication.java
│   │   └── resources/
│   └── test/
│       ├── java/
│       │   └── tech/buildrun/ruumye2e/
│       │       ├── config/
│       │       ├── dto/
│       │       ├── service/
│       │       └── stepdefinitions/
│       └── resources/
│           └── features/
│               ├── book.feature
│               ├── unbook.feature
│               ├── room.feature
│               └── site.feature
├── pom.xml
└── README.md
```

## 🛠️ Build Tools

This project uses Maven for dependency management and build automation. The project includes Maven Wrapper scripts (`mvnw` and `mvnw.cmd`) so you don't need to have Maven installed on your system.

## 📝 Maven Commands

- **Clean and build**: `./mvnw clean install`
- **Run tests**: `./mvnw test`
- **Run application**: `./mvnw spring-boot:run`
- **Package**: `./mvnw package`

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is a demo project for Spring Boot.

## 👨‍💻 Author

Build Run Tech

---

**Note**: This is an E2E testing project designed to test a room booking system using BDD practices with Cucumber.