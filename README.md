# BankAccountRegistrationAnnotation Project

## Overview

The **BankAccountRegistrationAnnotation** project is a simple console-based application developed to understand and implement key concepts of the Spring Framework, such as Inversion of Control (IoC), Dependency Injection (DI), Bean Scope, and Bean Lifecycle. The project now leverages **Spring annotations** for managing these concepts, moving away from the previous XML-based configuration.

---

## Features

- **Bank Account Registration**: Users can create new bank accounts by entering basic information such as name, account type, and initial balance.
- **IoC and DI**: Spring's IoC container is used to manage the application's objects and their dependencies via annotations like `@Component`, `@Autowired`, and `@Qualifier`.
- **Bean Lifecycle**: Demonstrates the complete lifecycle of beans using annotations such as `@PostConstruct` and `@PreDestroy`.
- **Bean Scope**: Covers different scopes like singleton and prototype using the `@Scope` annotation.

---

## Technologies Used

- **Spring Framework** (Core)
  - Annotations for configuration
  - Spring IoC, DI, and Bean Management
- **Java** (Core concepts)
- **Maven** (Build tool)

---

## Spring Concepts

### 1. Inversion of Control (IoC)

IoC is used to control object creation and management via the Spring container. The objects (beans) are created, injected, and managed automatically by Spring.

---

### 2. Dependency Injection (DI)

Dependencies between objects are injected using annotations:

- `@Autowired`: For automatic wiring of dependent beans.
- `@Qualifier`: To specify which bean should be injected when multiple beans of the same type are available.

---

### 3. Bean Lifecycle

Lifecycle hooks are managed via annotations:

- `@PostConstruct`: Invoked after the bean initialization.
- `@PreDestroy`: Invoked just before the bean is destroyed.

---

### 4. Bean Scope

Beans can be defined with different scopes using the `@Scope` annotation. This project demonstrates the singleton and prototype scopes.

---

## Configuration

The configuration is annotation-based and managed within the `config` package. Ensure that the necessary Spring annotations (`@Configuration`, `@ComponentScan`) are used for proper component scanning and bean management.

---
