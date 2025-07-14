# Default Functional Interfaces (Java 8+)

This project demonstrates the use of Java's default functional interfaces introduced in Java 8. Each example illustrates how to work with a specific interface from the `java.util.function` package.

## 🧠 What Are Functional Interfaces?

A **functional interface** is an interface with a **single abstract method**, used in lambda expressions and streams.

---

## 🔍 Functional Interfaces Explained

### 🔹 `Consumer<T>` :-  
📄 Accepts a single input and performs an action without returning a result.  
📄 This is a functional interface whose functional method is `accept(Object)`.  

### 🔹 `Function<T, R>` :-  
📄 Function that accepts one argument and produces a result.  
📄 This is a functional interface whose functional method is `apply(Object)`.  

### 🔹 `Predicate<T>` :-  
📄 Represents a predicate (boolean-valued function) of one argument.  
📄 This is a functional interface whose functional method is `test(Object)`.  

### 🔹 `Supplier<T>` :-  
📄 Represents a supplier of results.  
📄 Does not accept any input but produces a result.  
📄 This is a functional interface whose functional method is `get()`.  

### 🔹 Streams + Functional Interfaces :-  
Demonstrates a real-world example of combining functional interfaces with the Java Stream API:  
- `Predicate`  
- `Function`  
- `Consumer`  
- `Supplier`  

💡 **What it does:**  
- Filters even numbers  
- Squares them  
- Prints each squared number  
- Counts how many numbers were squared  
