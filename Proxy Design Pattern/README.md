# Proxy Design Pattern  

## Overview  

The **Proxy Design Pattern** is a structural design pattern that provides a surrogate or placeholder object to control access to another object. The Proxy acts as an intermediary, adding additional functionality (such as access control, lazy initialization, logging, or caching) without altering the actual object's code.  

## Purpose  

The Proxy pattern is used to control access to an object by:  
- Adding a level of indirection.  
- Managing resource-intensive operations efficiently.  
- Enforcing security or access restrictions.  

## Structure  

The Proxy pattern consists of the following components:  

- **Subject**: Defines the common interface for both the RealSubject and Proxy.  
- **RealSubject**: Implements the actual business logic.  
- **Proxy**: Acts as a substitute for the RealSubject and adds additional behavior as needed.  
- **Client**: Interacts with the Subject interface, unaware of whether it’s working with a RealSubject or Proxy.  

## UML Diagram  

```plaintext  
        +-------------------+
        |     Subject       |
        +-------------------+
        | + request(): void |
        +-------------------+
                  ^
                  |
  +---------------|---------------+
  |                               |
+-------------------+    +-------------------+
|   RealSubject     |    |      Proxy        |
+-------------------+    +-------------------+
| + request(): void |    | + request(): void |
+-------------------+    | - realSubject:    |
                         |   RealSubject     |
                         +-------------------+
