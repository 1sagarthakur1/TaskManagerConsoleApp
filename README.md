# 📝 Task Manager Console Application

A fully-featured **Java console-based task manager** that allows users to create, view, update, and manage their tasks effectively using object-oriented principles and file persistence.

---

## 🌟 Features

- ✅ Add Work or Personal Tasks
- 📋 View All Tasks
- 🔍 Search Tasks by ID
- 🔁 Update Task Status (PENDING/COMPLETED)
- ❌ Delete Tasks by ID
- 📌 Filter Tasks by Status
- 📅 Sort Tasks by Due Date
- ⚙️ Object-Oriented Design
- 🧪 Custom Exception Handling
- 📁 Uses Enums for Status and Priority
- 🧠 In-memory data handling

---

## 📁 Project Structure

```
TaskManagerApp.java         --> Main class with menu and input handling
TaskManager.java            --> Service class implementing task logic
TaskOperations.java         --> Interface with core task operations
Task.java                   --> Base class for all tasks
WorkTask.java               --> Represents a Work task
PersonalTask.java           --> Represents a Personal task
Status.java                 --> Enum for task status
Priority.java               --> Enum for task priority
TaskNotFoundException.java  --> Custom exception for invalid task IDs
tasks.txt                   --> Data file for persisting tasks
```

---

## 🚀 Getting Started

### 🧰 Prerequisites

- Java 8 or higher
- IDE (Optional): IntelliJ IDEA / Eclipse
- Git (Optional)

### 🔧 Build & Run

#### Using Command Line:

```bash
javac *.java
java TaskManagerApp
```

#### Using IntelliJ or Eclipse:

1. Open project folder
2. Run `TaskManagerApp.java` from the IDE

---

## 🖥️ Sample Screenshot

```
===== Task Manager Menu =====
1. Add Task
2. View All Tasks
3. Search Task by ID
4. Update Task Status
5. Delete Task by ID
6. View Tasks by Status
7. Sort Tasks by Due Date
8. Exit
Enter your choice:
```

---

## 🔍 Sample Input/Output

### ➕ Adding a Task:
```
Enter Task Type (1. Work / 2. Personal): 1
Enter Task ID: 101
Enter Task Title: Submit report
Enter Task Description: Finalize Q1 report
Enter Task Status (PENDING/COMPLETED): PENDING
Enter Due Date (yyyy-MM-dd): 2025-06-15
```

### 📋 Viewing Tasks:
```
Task ID: 101 | Title: Submit report | Status: PENDING | Due Date: 2025-06-15 | Type: Work
```

---

## 💡 Technologies Used

- Java 8 functionality
- OOP Concepts (Inheritance, Abstraction, Polymorphism)
- Exception Handling
- Collections (ArrayList)
- Enums
