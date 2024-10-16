# Iterator Design Pattern

## Overview

The Iterator Design Pattern is a behavioral design pattern that provides a way to access the elements of a collection (such as a list, stack, or array) sequentially without exposing its underlying representation. This pattern allows for traversing a collection regardless of its structure (array, list, tree, etc.) and is commonly used to decouple the collection from the traversal logic.

## Purpose

The Iterator pattern allows a client to traverse through a collection in a uniform manner, without needing to know the collection's internal structure. It also provides a clean way to iterate over different kinds of collections (arrays, linked lists, etc.) while keeping the client code simple and maintainable.

## Structure

The key components of the Iterator pattern include:

- **Iterator**: An interface or abstract class that defines the methods required for iteration (e.g., `next()`, `hasNext()`).
- **ConcreteIterator**: Implements the `Iterator` interface for traversing the elements of a specific collection.
- **Aggregate (Collection)**: An interface that defines the factory method `createIterator()` to return an iterator for the collection.
- **ConcreteAggregate (Concrete Collection)**: Implements the `Aggregate` interface and provides an implementation to return the appropriate iterator.

## UML Diagram

```plaintext
       +-------------------+             
       |     Iterator      |<--------------------+
       +-------------------+                     |
       | + hasNext(): bool |                     |
       | + next(): Object  |                     |
       +-------------------+                     |
                                                 |
       +-----------------------+                 |
       | ConcreteIterator      |                 |
       +-----------------------+                 |
       | - collection: List    |                 |
       | - index: int          |                 |
       | + hasNext(): bool     |                 |
       | + next(): Object      |                 |
       +-----------------------+                 |
                                                 |
       +-----------------------+                 |
       |     Aggregate         |<----------------+
       +-----------------------+
       | + createIterator():   |
       |   Iterator            |
       +-----------------------+

       +---------------------------+
       |  ConcreteAggregate        |
       +---------------------------+
       | - items: List             |
       | + createIterator():       |
       |   Iterator                |
       +---------------------------+

