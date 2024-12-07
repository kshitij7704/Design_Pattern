# Bridge Design Pattern  

## Overview  

The **Bridge Design Pattern** is a structural design pattern that decouples an abstraction from its implementation, allowing the two to evolve independently. It provides a mechanism to combine multiple abstraction hierarchies with multiple implementation hierarchies, promoting flexibility and scalability.  

## Purpose  

The Bridge pattern is used to avoid a permanent binding between an abstraction and its implementation. It separates the abstraction (interface) from the implementation (concrete logic) by introducing a bridge layer. This is especially useful when the abstraction and implementation may vary or extend independently.  

## Structure  

The Bridge pattern involves the following components:  

- **Abstraction**: Defines the interface for the abstraction and maintains a reference to the implementer.  
- **RefinedAbstraction**: Extends the `Abstraction` and provides additional functionality.  
- **Implementor**: Defines the interface for implementation classes. This interface does not need to correspond to the `Abstraction` interface directly.  
- **ConcreteImplementor**: Implements the `Implementor` interface and provides specific functionality.  

## UML Diagram  

```plaintext  
           +-------------------+
           |   Abstraction     |
           +-------------------+
           | - implementor:    |
           |   Implementor     |
           | + operation():    |
           |   void            |
           +-------------------+
                   ^
                   |
     +-------------|----------------+
     |                              |
+-------------------+     +--------------------+
| RefinedAbstraction|     | AnotherAbstraction |
+-------------------+     +--------------------+
| + additionalOp(): |     | + otherMethod():   |
+-------------------+     +--------------------+
                   ^
                   |
           +-------------------+
           |   Implementor     |
           +-------------------+
           | + operationImp(): |
           |   void            |
           +-------------------+
                   ^
                   |
     +-------------|----------------+
     |                              |
+--------------------+     +--------------------+
|ConcreteImplementorA|     |ConcreteImplementorB|
+--------------------+     +--------------------+
| + operationImp():  |     | + operationImp():  |
+--------------------+     +--------------------+
