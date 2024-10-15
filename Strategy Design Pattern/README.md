# Strategy Design Pattern

## Overview

The Strategy Design Pattern is a behavioral pattern that enables selecting an algorithm at runtime. This pattern allows the definition of a family of algorithms, encapsulates each one, and makes them interchangeable. The Strategy pattern lets the algorithm vary independently from the clients that use it, promoting flexibility and reusability in the code.

## Purpose

The primary purpose of the Strategy pattern is to allow a client to choose an algorithm from a family of algorithms without modifying the client code. This results in cleaner, more maintainable code and follows the Open/Closed Principle, allowing new strategies to be added without altering existing code.

## Structure

The key components of the Strategy pattern include:

- **Context**: Maintains a reference to a strategy object and is responsible for interacting with it.
- **Strategy**: An interface that defines the method(s) that concrete strategies must implement.
- **ConcreteStrategy**: Implements the Strategy interface, providing specific algorithm implementations.

## UML Diagram

```plaintext
        +-----------------------------+
        |          Context            |
        +-----------------------------+
        |   - strategy: Strategy      |
        +-----------------------------+
        | + set_strategy(s: Strategy) |
        | + execute_strategy()        |
        +---------+-------------------+
                  |
        +---------+---------+
        |                   |
+---------------+   +--------------------+
|  Strategy     |   | ConcreteStrategyA  |
+---------------+   +--------------------+
| + algorithm() |   | + algorithm()      |
+---------------+   +--------------------+
                    | ConcreteStrategyB  |
                    +--------------------+
                    | + algorithm()      |
                    +--------------------+
