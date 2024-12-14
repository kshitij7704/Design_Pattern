# State Design Pattern  

## Overview  

The **State Design Pattern** is a behavioral design pattern that allows an object to alter its behavior when its internal state changes. The pattern encapsulates state-specific behavior within separate state objects and delegates the state-related behavior to the current state of the object.  

This pattern promotes the open/closed principle by enabling the addition of new states without modifying existing code.  

## Purpose  

- To allow an object to change its behavior dynamically based on its current state.  
- To manage state transitions in a controlled and scalable manner.  

## Structure  

The State Design Pattern consists of the following components:  

1. **Context**: Maintains a reference to the current state object and delegates state-specific behavior to it.  
2. **State**: Defines an interface for encapsulating the behavior associated with a particular state.  
3. **Concrete State**: Implements the behavior for a specific state of the context.  

## UML Diagram  

```plaintext  
       +----------------+           +-----------------+  
       |    Context     |           |      State      |  
       +----------------+           +-----------------+  
       | - state: State |<>-------->| + handle()      |  
       | + setState()   |           +-----------------+  
       | + request()    |                  /|\  
       +----------------+                   |  
               /|\                          |  
                |                           |  
     +------------------+         +-------------------+  
     | ConcreteStateA   |         |  ConcreteStateB   |  
     +------------------+         +-------------------+  
     | + handle()       |         | + handle()        |  
     +------------------+         +-------------------+  