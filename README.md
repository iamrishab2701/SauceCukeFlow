# SauceCukeFlow - Cucumber 7 + Allure Report + Selenium Framework

## Overview
SauceCukeFlow is a **Cucumber 7 + Selenium + Allure** test automation framework designed for **web UI automation** on the [SauceDemo](https://www.saucedemo.com/) website. This framework utilizes the **Page Object Model (POM)** for maintainability and supports multi-environment execution with **configurations managed via YAML**.

---

## **Project Structure**
```
SauceCukeFlow/
|-- src/main/java/
|   |-- com/sauce/base/        # Base classes (WebDriver setup, Hooks, etc.)
|   |-- com/sauce/pages/       # Page Object Model classes
|   |-- com/sauce/utils/       # Utility classes (Config Reader, Driver Factory, etc.)
|
|-- src/test/java/
|   |-- com/sauce/runner/      # Test Runner
|   |-- com/sauce/hooks/       # Hooks for setup & teardown
|   |-- com/sauce/stepdefinitions/  # Step Definition files
|
|-- src/test/resources/
|   |-- features/              # Cucumber feature files
|   |-- config/                # YAML config files for different environments
|   |-- allure.properties      # Allure report configuration
|
|-- pom.xml                    # Maven dependencies and plugin configurations
|-- README.md                  # Project documentation
```

---

## **Prerequisites**
Ensure the following are installed on your system:
- **Java 17+**
- **Maven 3.8+**
- **Allure CLI** (`brew install allure` for Mac users)
- **Google Chrome & ChromeDriver**

---

## **Setup and Configuration**
### **1️⃣ Clone the repository**
```bash
git clone https://github.com/iamrishab2701/SauceCukeFlow.git
cd SauceCukeFlow
```

### **2️⃣ Install dependencies**
```bash
mvn clean install
```

### **3️⃣ Configure Environment Variables**
Modify `src/test/resources/config/environment.yaml`:
```yaml
prod:
  url: "https://www.saucedemo.com/"
  username: "standard_user"
  password: "secret_sauce"
```

---

## **Running Tests**
### **1️⃣ Execute tests with Maven**
Run tests with a specified browser and environment:
```bash
mvn clean test -Dbrowser=chrome -Denv=prod
```

---

## **Allure Report Generation**
### **1️⃣ Run tests to generate Allure results**
```bash
mvn clean test
```

### **2️⃣ Serve Allure Report (Recommended)**
```bash
allure serve target/allure-results
```

---

## **Key Features**
✔ **Cucumber 7** for BDD-style test execution  
✔ **Selenium WebDriver** for UI automation  
✔ **Page Object Model (POM)** for maintainability  
✔ **Multi-environment support (prod, staging, integration)**  
✔ **Allure Reports for Test Execution Analytics**

---

## **Contributing**
Feel free to fork this project, create feature branches, and submit **pull requests**.

---

## **License**
MIT License - Open Source Project

---

## **Contact**
For queries or issues, reach out via [GitHub Issues](https://github.com/iamrishab2701/SauceCukeFlow.git).

