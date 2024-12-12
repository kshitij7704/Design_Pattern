# Mediator Design Pattern  

## Overview  

The **Mediator Design Pattern** is a behavioral design pattern that promotes loose coupling by centralizing communication between objects in a system. Instead of objects communicating directly with each other, they communicate through a mediator, reducing dependencies and making the system easier to maintain and modify.  

## Purpose  

- To simplify complex communication patterns between multiple objects.  
- To reduce direct dependencies between objects, promoting reusability and flexibility.  
- To centralize control logic in a single mediator, improving code readability.  

## Structure  

The Mediator pattern consists of the following components:  

- **Mediator (Abstract)**: Defines an interface for communication between objects.  
- **Concrete Mediator**: Implements the communication logic between colleagues.  
- **Colleague (Abstract)**: Defines the interface for objects that participate in communication.  
- **Concrete Colleagues**: Objects that communicate with each other through the mediator.  

## UML Diagram  

```plaintext  
          +---------------------+  
          |       Mediator      |  
          +---------------------+  
                    /|\  
                     |  
                     v  
         +-----------------------+  
         |  Concrete Mediator    |  
         +-----------------------+  
                  /|\   /|\  
                   |     |  
        +------------+   +------------+  
        | Colleague1 |   | Colleague2 |  
        +------------+   +------------+  
