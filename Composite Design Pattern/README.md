# Composite Design Pattern  

## Overview  

The **Composite Design Pattern** is a structural design pattern that allows you to compose objects into tree-like structures to represent part-whole hierarchies. It enables clients to treat individual objects and compositions of objects uniformly.  

This pattern is especially useful when you need to manipulate a group of similar objects in a consistent way.  

## Purpose  

- To represent complex hierarchies or tree structures.  
- To simplify client code by treating individual and composite objects in the same manner.  
- To enable flexibility in handling objects and their aggregates.  

## Structure  

The Composite pattern consists of the following components:  

- **Component**: Defines the interface for all objects in the hierarchy.  
- **Leaf**: Represents individual objects that do not have any children.  
- **Composite**: Represents composite objects (containers) that can have children, which may be other `Composite` objects or `Leaf` objects.  
- **Client**: Interacts with objects in the hierarchy via the `Component` interface.  

## UML Diagram  

```plaintext  
              +-------------------+
              |    Component      |
              +-------------------+
              | + operation():    |
              |   void            |
              +-------------------+
                     ^
                     |
     +---------------|----------------+
     |                                |
+-------------------+         +---------------------+
|       Leaf        |         |     Composite       |
+-------------------+         +---------------------+
| + operation():    |         | + operation():      |
|   void            |         |   void              |
|                   |         | + add(Component):   |
|                   |         |   void              |
|                   |         | + remove(Component):|
|                   |         |   void              |
|                   |         | + getChild(int):    |
|                   |         |   Component         |
+-------------------+         +---------------------+
