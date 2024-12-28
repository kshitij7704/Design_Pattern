# Flyweight Design Pattern  

## Overview  

The **Flyweight Design Pattern** is a structural design pattern that focuses on reducing memory usage by sharing as much data as possible with similar objects. It is particularly useful when dealing with a large number of objects that share common state or behavior.  

This pattern introduces the concept of **intrinsic** and **extrinsic** states:  
- **Intrinsic State**: Shared and immutable data stored in the Flyweight object.  
- **Extrinsic State**: Context-specific data that is provided to the Flyweight when it is used.  

## Purpose  

- To reduce memory usage by sharing common parts of the object state.  
- To improve application performance when creating large numbers of similar objects.  

## Structure  

The Flyweight Design Pattern consists of the following components:  

1. **Flyweight**: An interface or abstract class that defines operations for objects.  
2. **Concrete Flyweight**: Implements the Flyweight interface and stores intrinsic state.  
3. **Flyweight Factory**: Ensures the proper sharing of Flyweight objects.  
4. **Client**: Uses Flyweight objects and provides extrinsic state as needed.  

## UML Diagram  

```plaintext  
        +--------------------+       
        |     Flyweight      |  
        +--------------------+  
        | + operation()      |  
        +--------------------+  
                 /|\  
                  |  
        +--------------------+  
        | ConcreteFlyweight  |  
        +--------------------+  
        | - intrinsicState   |  
        | + operation()      |  
        +--------------------+  
  
          +------------------+  
          | FlyweightFactory |  
          +------------------+  
          | + getFlyweight() |  
          +------------------+  
                 |  
          +-----------------+  
          |      Client     |  
          +-----------------+  
          | - extrinsicState|  
          +-----------------+  
