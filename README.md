# Student-Management-System

# Objective

This project implements a **Student Management System** demonstrating:
- Inheritance  
- Abstract Classes  
- Interfaces  
- Method Overloading and Overriding  
- Packages and Modular Design  

---

## Class Structure

| Class | Type | Description |
|-------|------|-------------|
| `Person` | Abstract | Base class with common fields (`name`, `email`) |
| `Student` | Concrete | Extends `Person`, adds fields like rollNo, course, marks, grade |
| `RecordActions` | Interface | Declares CRUD methods |
| `StudentManager` | Concrete | Implements `RecordActions` using `HashMap` |
| `Main` | Driver Class | Tests all functionalities |

---

## Concepts Used
- **Inheritance:** `Student` extends `Person`
- **Abstract Class:** `Person` with abstract method `displayInfo()`
- **Interface:** `RecordActions` defines CRUD operations
- **Polymorphism:** Method Overriding (`displayInfo`) & Overloading
- **Encapsulation:** Private fields with getters/setters
- **Packages:** `model` and `service` for modular structure

---

## Sample Output

Student added successfully!

Student added successfully!

Student Info:

Roll No: 101
Name: Ankit
Email: ankit@mail.com
Course: B.Tech
Marks: 89.5
Grade: A

Student Info:

Roll No: 102
Name: Riya
Email: riya@mail.com
Course: M.Tech
Marks: 91.2
Grade: A+

Overloaded display method example:

Student Info:

Roll No: 101
Name: Ankit
Email: ankit@mail.com
Course: B.Tech
Marks: 89.5
Grade: A

# Author

Namee - Kartikeya Drall

Roll.no - 2401720014

B.Sc (H) Computer Science

Java Programming Lab Assignment-2
