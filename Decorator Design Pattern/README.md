# Decorator Design Pattern

## Overview

The Decorator Design Pattern is a structural pattern that allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class. It achieves this by wrapping the object with additional functionality, providing a flexible alternative to subclassing for extending functionality.

## Purpose

The Decorator pattern enables the dynamic extension of an object's behavior without modifying its structure. It allows for creating a stackable set of behaviors, where decorators wrap an object and add functionality, keeping the base class free of feature bloat. This pattern is commonly used for enhancing objects with new capabilities, such as adding responsibilities or modifying behavior at runtime.

## Structure

The Decorator pattern typically includes these elements:

- **Component**: The interface or abstract class defining the basic structure or behavior.
- **ConcreteComponent**: The core class that implements `Component` and defines the default behavior.
- **Decorator**: An abstract class that implements `Component` and holds a reference to a `Component` object, allowing it to wrap additional functionality around the `Component`.
- **ConcreteDecorator**: Extends the `Decorator` class, adding specific functionalities or behaviors to the `Component`.

## UML Diagram

```plaintext
           +---------------------+
           |      Component      |
           +---------------------+
           | + operation(): void |
           +---------------------+
                   ^
                   |
           +---------------------+
           |  ConcreteComponent  |
           +---------------------+
           | + operation(): void |
           +---------------------+
                   ^
                   |
           +------------------------+
           |     Decorator          |
           +------------------------+
           | - component: Component |
           | + operation(): void    |
           +------------------------+
                   ^
                   |
           +------------------------+
           |   ConcreteDecorator    |
           +------------------------+
           | + operation(): void    |
           +------------------------+
