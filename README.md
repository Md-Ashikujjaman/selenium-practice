
# Selenium Web Automation Practice with Java & Maven

[![Java](https://img.shields.io/badge/Java-17-blue.svg)](https://www.oracle.com/java/)  
[![Build with Maven](https://img.shields.io/badge/build-maven-blue)](https://maven.apache.org/)  
[![License: Educational](https://img.shields.io/badge/license-Educational-lightgrey)]()  
[![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-blue.svg)](https://www.jetbrains.com/idea/)  

Welcome! This repository contains practice projects developed while learning **Selenium WebDriver** with **Java** and **Maven**, using **IntelliJ IDEA Community Edition**.

---

## 🚀 Project Goal

To gain hands-on experience in:

- Automating web applications using Selenium WebDriver  
- Understanding Java fundamentals and object-oriented programming in test automation  
- Configuring and managing dependencies using Maven  
- Writing clean and maintainable test automation code  

---

## 📂 Project Structure

```
selenium-practice/
├── pom.xml                     # Maven config file with dependencies
├── src/
│   └── test/
│       └── java/
│           └── org/example/
│                   ├── FirstTest.java
│                   └── DriverSetup.java
└── README.md                   # This file
```

---

## 🛠️ Tools & Technologies

- **Java** (JDK 17 or compatible)  
- **Maven** (Project Management & Build Tool)  
- **Selenium WebDriver**  
- **JUnit** or **TestNG** (Test Framework)  
- **IntelliJ IDEA Community Edition**

---

## 📦 Installation & Setup

1. **Clone the repository**  
   ```bash
   git clone https://github.com/yourusername/selenium-practice.git
   ```
2. **Open the project in IntelliJ IDEA**  
3. **Ensure Maven is imported**  
4. **Run any test** from `src/test/java/` using the IDE or command line:

```bash
mvn test
```

---

## 🧪 Sample Test Output

Here's an example of a successful test execution:

```bash
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running org.example.FirstTest
Starting ChromeDriver 114.0...
Launching browser and opening https://www.google.com
✅ Test Passed: Title is Google

Results:
===============================================
Default Suite
Total tests run: 2, Passes: 2, Failures: 0, Skips: 0
===============================================


Process finished with exit code 0

-------------------------------------------------------
```

---

## 📚 Learning Progress

| Date       | Topic/Feature Practiced        | File/Example     |
|------------|--------------------------------|------------------|
| 2025-05-11 | First test with ChromeDriver   | `FirstTest.java` |
| 2025-05-12 | Setup WebDriver initialization | `DriverSetup.java` |
| ...        | ...                            | ...              |

---

## 💡 Notes

- Download the correct WebDriver version that matches your browser.
- Tests are simplified and designed for learning purposes.

---

## ✅ To-Do (Next Steps)

- [ ] Learn about implicit and explicit waits  
- [ ] Implement Page Object Model (POM) design pattern  
- [ ] Capture screenshots on test failures  
- [ ] Integrate reporting tools (ExtentReports / Allure)  

---

## 👥 Contributors

> Currently maintained by **[Md. Ashikujjaman]**  
> Contributions are welcome — feel free to fork and create a pull request!

---

## 📜 License

This project is for **educational purposes only**.

