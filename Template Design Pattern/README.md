# Template Method Design Pattern  

## Overview  

The **Template Method Design Pattern** is a behavioral design pattern that defines the skeleton of an algorithm in a base class, allowing subclasses to override specific steps without changing the algorithm's structure. This pattern ensures consistency in the overarching process while providing flexibility for individual steps.  

The pattern is called "template" because it acts as a blueprint for subclasses to follow.  

## Purpose  

- To define the general steps of an algorithm while deferring some specific steps to subclasses.  
- To promote code reuse by implementing the invariant parts of an algorithm in a base class.  

## Structure  

The Template Method Design Pattern consists of the following components:  

1. **Abstract Class**: Defines the template method, which outlines the steps of the algorithm. It also provides default or abstract methods for steps that can be overridden by subclasses.  
2. **Concrete Class**: Implements the specific steps of the algorithm by overriding the methods defined in the abstract class.  

## UML Diagram  

```plaintext  
       +--------------------+  
       |  AbstractClass     |  
       +--------------------+  
       | templateMethod()   |  
       | step1()            |  
       | step2()            |  
       +--------------------+  
                /|\  
                 |  
       +--------------------+  
       |  ConcreteClassA    |  
       +--------------------+  
       | step2()            |  
       +--------------------+  
                 |  
       +--------------------+  
       |  ConcreteClassB    |  
       +--------------------+  
       | step1()            |  
       +--------------------+  