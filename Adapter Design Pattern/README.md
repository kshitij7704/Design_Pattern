# Adapter Design Pattern  

## Overview  

The **Adapter Design Pattern** is a structural design pattern that acts as a bridge between two incompatible interfaces. It allows existing classes to work together without modifying their source code by providing a wrapper (adapter) around one of the interfaces.  

## Purpose  

- To enable compatibility between classes with different interfaces.  
- To reuse existing functionality without altering the underlying code.  
- To facilitate integration of new functionality into existing systems.  

## Structure  

The Adapter pattern consists of the following components:  

- **Client**: The class that interacts with the adapter.  
- **Target**: The interface that the client expects.  
- **Adaptee**: The existing class with an incompatible interface.  
- **Adapter**: A class that implements the `Target` interface and translates requests to the `Adaptee`.  

## UML Diagram  

```plaintext  
        +----------+         +----------------+  
        |  Client  | ------> |     Target     |  
        +----------+         +----------------+  
                                     | 
                                     |  
                                     v  
                            +----------------+  
                            |     Adapter    |  
                            +----------------+  
                                     |  
                                     |  
                                     v  
                            +----------------+  
                            |     Adaptee    |  
                            +----------------+  
