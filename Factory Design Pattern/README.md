# Factory Design Pattern

## Overview

The Factory Design Pattern is a creational design pattern that provides an interface or method to create objects in a superclass, but allows subclasses to alter the type of objects that will be created. It helps to encapsulate object creation logic, promoting loose coupling between client code and the classes it instantiates.

## Purpose

The Factory pattern aims to delegate the responsibility of instantiating objects to a factory class or method, making the codebase more modular and flexible. This is particularly useful when the exact type of the object to be created is determined at runtime or when object creation involves complex logic.

## Structure

The Factory pattern consists of the following key components:

- **Creator**: Declares a factory method, which returns an object of the `Product` type.
- **ConcreteCreator**: Overrides the factory method to create and return an instance of `ConcreteProduct`.
- **Product**: Declares the interface for objects that the factory method will create.
- **ConcreteProduct**: Implements the `Product` interface and defines the object to be created.

## UML Diagram

```plaintext
           +------------------+
           |     Product      |
           +------------------+
           | + operation():   |
           +------------------+
                  ^
                  |
           +------------------+
           | ConcreteProduct  |
           +------------------+
           | + operation():   |
           +------------------+
                  ^
                  |
           +-----------------------------+
           | Creator                     |
           +-----------------------------+
           | + factoryMethod(): Product  |
           +-----------------------------+
                  ^
                  |
           +----------------------------+
           | ConcreteCreator            |
           +----------------------------+
           | + factoryMethod(): Product |
           +----------------------------+
