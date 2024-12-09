# Facade Design Pattern  

## Overview  

The **Facade Design Pattern** is a structural design pattern that provides a unified and simplified interface to a complex system of classes, subsystems, or libraries. It acts as a "facade" that hides the complexity of the underlying system and offers a cleaner interface for the client.  

## Purpose  

- To simplify the use of complex systems by providing a high-level interface.  
- To reduce dependencies between the client and the subsystem.  
- To improve readability and maintainability by encapsulating the complexity.  

## Structure  

The Facade pattern consists of the following components:  

- **Facade**: Provides a simplified interface to the complex subsystem.  
- **Subsystem Classes**: The complex system components with intricate functionality.  
- **Client**: Interacts with the Facade instead of directly with subsystem classes.  

## UML Diagram  

```plaintext  
           +----------+  
           |  Client  |  
           +----------+  
                |  
                v  
           +----------+  
           |  Facade  |  
           +----------+  
            /    |    \  
           /     |     \  
+---------+ +---------+ +---------+  
|Subsystem| |Subsystem| |Subsystem|  
| ClassA  | | ClassB  | | ClassC  |  
+---------+ +---------+ +---------+  
