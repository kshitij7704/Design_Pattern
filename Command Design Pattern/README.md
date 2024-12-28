# Command Design Pattern  

## Overview  

The **Command Design Pattern** is a behavioral design pattern that encapsulates a request as an object, thereby allowing you to parameterize clients with different requests, delay or queue the execution of requests, and support undoable operations.  

This pattern decouples the object that invokes the operation from the one that knows how to perform it, promoting flexibility and extensibility.  

## Purpose  

- Encapsulate a request as an object.  
- Allow requests to be queued, logged, or undone.  
- Decouple the invoker and receiver.  

## Structure  

The Command Design Pattern consists of the following components:  

1. **Command**: An interface or abstract class defining a method to execute the command.  
2. **Concrete Command**: Implements the Command interface and binds a receiver with an action.  
3. **Receiver**: Knows how to perform the operations associated with the command.  
4. **Invoker**: Executes the command.  
5. **Client**: Creates specific command objects and associates them with the invoker.  

## UML Diagram  

```plaintext  
+----------------+          +----------------+  
|     Client     |          |    Receiver    |  
+----------------+          +----------------+  
       |                           /|\  
       |                            |  
+----------------+          +----------------+  
| ConcreteCommand|<--------->|   Command     |  
+----------------+          +----------------+  
       |  
       |  
+----------------+  
|     Invoker    |  
+----------------+  
