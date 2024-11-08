# Selenium Java Cucumber POM Project

This project demonstrates a test automation framework using **Selenium WebDriver**, **Cucumber**, and the **Page Object Model (POM)** pattern. It is designed for behavior-driven development (BDD) of web applications, providing a structured approach to writing and maintaining test cases.

## Table of Contents

1. [Project Overview](#project-overview)
2. [Prerequisites](#prerequisites)
3. [Installation](#installation)
4. [Project Structure](#project-structure)
5. [Running Tests](#running-tests)
6. [Configuration](#configuration)
7. [Contributing](#contributing)
8. [License](#license)

## Project Overview

This project leverages the following technologies:
- **Selenium WebDriver**: For interacting with web elements and automating browser actions.
- **Cucumber**: For BDD, enabling tests to be written in a human-readable format.
- **Page Object Model (POM)**: A design pattern that organizes web elements as classes, making the code more maintainable and reducing duplication.

## Prerequisites

- **Java Development Kit (JDK)**: Version 8 or above.
- **Maven**: For dependency management and building the project.
- **IDE**: IntelliJ IDEA, Eclipse, or any IDE of your choice.

Ensure the following are installed and configured on your machine:

- **Java**: [Install Java](https://www.oracle.com/java/technologies/javase-downloads.html)
- **Maven**: [Install Maven](https://maven.apache.org/install.html)
- **Browser Driver**: For Chrome, Firefox, etc. (e.g., ChromeDriver for Chrome)

## Installation

1. Clone this repository:

   ```bash
   git clone https://github.com/SamuelPutra29/SeleniumJavaCucumberPOM.git
Navigate to the project directory:

bash
Copy code
cd SeleniumJavaCucumberPOM
Install project dependencies:

bash
Copy code
mvn clean install
Project Structure
src/test/java: Contains Java test files, including step definitions and page object classes.
pageObjects: Stores classes representing individual pages in the application.
stepDefinitions: Holds the steps corresponding to Cucumber feature files.
src/test/resources: Contains Cucumber feature files and other test resources.
features: Directory for .feature files, where test scenarios are defined.
pom.xml: Project Object Model file for managing dependencies and build configurations.
Running Tests
To run the tests, you can use Maven commands or execute them directly in your IDE.

Run with Maven
Run all tests with:

bash
Copy code
mvn test
Or, specify a particular feature or test:

bash
Copy code
mvn test -Dcucumber.options="src/test/resources/features/yourFeatureFile.feature"
Run with IDE
Right-click on the feature file or test class in your IDE.
Select Run.
Configuration
You can configure the following options:

Browser: Specify the browser driver (e.g., ChromeDriver) in the BaseTest class or configuration properties.
Test Environment: Update the base URL and other test parameters in a config.properties file or as environment variables.
Contributing
Fork the repository.
Create a new branch (git checkout -b feature-branch).
Commit your changes (git commit -m 'Add new feature').
Push to the branch (git push origin feature-branch).
Open a pull request.
