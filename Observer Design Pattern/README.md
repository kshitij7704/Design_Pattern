# Observer Design Pattern  

## Overview  

The **Observer Design Pattern** is a behavioral design pattern that defines a one-to-many dependency between objects. When the state of one object (the **Subject**) changes, all its dependent objects (the **Observers**) are notified and updated automatically.  

This pattern is widely used to implement event handling systems, where multiple objects need to react to changes in another object.  

## Purpose  

- To allow objects to subscribe and listen for updates from another object.  
- To promote loose coupling between the subject and its observers.  

## Structure  

The Observer pattern consists of the following components:  

1. **Subject**: The object being observed. It maintains a list of observers and notifies them of changes.  
2. **Observer**: The object that observes the subject and gets updated when the subject changes.  
3. **Concrete Subject**: Implements the subject interface and notifies observers when its state changes.  
4. **Concrete Observer**: Implements the observer interface and defines specific behavior upon state updates.  

## UML Diagram  

```plaintext  
       +------------------+          +-------------------+  
       |     Subject      |<>------->|      Observer      |  
       +------------------+          +-------------------+  
       | attach()         |          | update()          |  
       | detach()         |          +-------------------+  
       | notify()         |  
       +------------------+  
              /|\  
               |  
       +------------------+  
       |  ConcreteSubject |  
       +------------------+  
       | state            |  
       +------------------+  
              /|\  
               |  
       +------------------+  
       | ConcreteObserver |  
       +------------------+  
       | update()         |  
       +------------------+  