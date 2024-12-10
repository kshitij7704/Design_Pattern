# Chain of Responsibility Design Pattern  

## Overview  

The **Chain of Responsibility Design Pattern** is a behavioral design pattern that allows a request to pass through a chain of handlers. Each handler processes the request or forwards it to the next handler in the chain. This decouples the sender of a request from its receiver, promoting flexibility and scalability.  

## Purpose  

- To avoid coupling the sender and receiver of a request.  
- To allow multiple objects to handle a request, dynamically determining the handler at runtime.  
- To create a chain of handlers, where each handler decides whether to process the request or pass it to the next handler.  

## Structure  

The Chain of Responsibility pattern consists of the following components:  

- **Handler (Abstract)**: Defines an interface for handling requests and setting the next handler.  
- **Concrete Handlers**: Implement the handler's interface and process requests or pass them along the chain.  
- **Client**: Initiates requests and sends them to the chain.  

## UML Diagram  

```plaintext  
+-------------+        +----------------+  
|   Client    | -----> |    Handler     |  
+-------------+        +----------------+  
                               | 
                               |  
                               v  
                      +-------------------+  
                      | ConcreteHandler1  |  
                      +-------------------+  
                               |  
                               |  
                               v  
                      +-------------------+  
                      | ConcreteHandler2  |  
                      +-------------------+  
                               |  
                               |  
                               v  
                      +-------------------+  
                      | ConcreteHandlerN  |  
                      +-------------------+  
