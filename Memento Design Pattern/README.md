# Memento Design Pattern  

## Overview  

The **Memento Design Pattern** is a behavioral design pattern used to capture and restore the state of an object without violating its encapsulation. It allows you to save the current state of an object into a "memento" and later restore it, providing a mechanism for undo functionality or rollback operations.  

## Purpose  

- To preserve the internal state of an object for future use.  
- To enable undo/redo operations.  
- To maintain encapsulation by ensuring the object's internal details are not exposed externally.  

## Structure  

The Memento pattern consists of three main components:  

1. **Originator**: The object whose state needs to be saved and restored.  
2. **Memento**: A value object that stores the state of the originator.  
3. **Caretaker**: Manages the mementos and ensures proper saving and restoring of the originator's state.  

## UML Diagram  

```plaintext  
       +--------------+          +-------------+  
       |  Caretaker   |<-------->|   Memento   |  
       +--------------+          +-------------+  
              /|\                        /|\  
               |                          |  
               |                          v  
       +--------------+          +-------------+  
       |  Originator  |--------->|   State     |  
       +--------------+          +-------------+  
