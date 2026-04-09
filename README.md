# Soft-Eng-Lab-Assign-6-SOLID-with-Design-Pattern
# 📚 NEU Library System (SOLID Principles Implementation)

## 🧾 Overview

The **NEU Library System** is a refactored object-oriented program designed to manage various library resources such as books, journals, audiobooks, and e-journals.

This system follows **SOLID principles**, especially the **Dependency Inversion Principle (DIP)**, to ensure flexibility, scalability, and maintainability.

---

## 🎯 Problem Scenario

Originally, the system had a `Student` class with tightly coupled methods:

- `borrowBook(String title)`
- `borrowJournal(String title)`

### Issues:
- ❌ Violates Dependency Inversion Principle (DIP)
- ❌ Hard to extend (requires modifying existing code)
- ❌ Poor scalability

---

## ✅ Solution

The system was refactored using **abstraction and design patterns**.

### Key Improvements:
- Introduced `LibraryResource` interface
- All resource types implement this interface
- Added `BorrowService` abstraction
- Used **Dependency Injection** in `Student`

## UML Diagram 
![alt text](https://github.com/ThezzaSalcedo/Soft-Eng-Lab-Assign-6-SOLID-with-Design-Pattern/blob/main/UML%20Diagram%20(2).png)
