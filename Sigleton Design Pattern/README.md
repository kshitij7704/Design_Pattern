# Singleton Design Pattern

## Overview

The Singleton Design Pattern is a creational pattern that ensures a class has only one instance and provides a global point of access to that instance. This is useful when exactly one object is needed to coordinate actions across a system. Singleton is commonly used for scenarios like database connections, logging, configuration settings, and other resources where having multiple instances could lead to inconsistent behavior or performance issues.

## Purpose

The Singleton pattern is intended to provide a single instance of a class that can be accessed globally. This pattern ensures that a single instance is created, shared, and accessed in a controlled manner, preventing the need to create multiple instances of the class. It also provides lazy initialization, meaning the instance is created only when it’s first needed.

## Structure

The Singleton pattern typically includes the following elements:

- **Private Constructor**: Prevents other classes from instantiating the Singleton directly.
- **Static Instance**: Holds the single instance of the class, often initialized only when first accessed.
- **Static Access Method**: Provides a way to retrieve the single instance, creating it if it does not already exist.

## UML Diagram

```plaintext
       +----------------------------+
       |      Singleton             |
       +----------------------------+
       | - instance: Singleton      |
       +----------------------------+
       | + getInstance(): Singleton |
       +----------------------------+
