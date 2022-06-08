# Chapter 1: Introduction

## 1.5

Language Elements

Key words/reserved words: words with special meaning in that language

Operators: perform operations on operands

Punctuation: marks to serve a specific purpose

Programmer-defined names/identifiers: words used to identify storage locations in memory

Syntax: rules that must be followed when writing a program

Java programs consist of source code in a source file, which is written in a text editor, then run through a compiler to turn the source code into byte code instructions. Byte code is read by the java virtual machine

Java is "portable" because byte code is the same on all computers

To compile: javac Filename

To run: java classFilename
.class created by compiler, do not need to type the .class extension

## 1.7 Object-Oriented Programming

Object: entity that contains data and procedures
Attributes: object's data
Methods: object's procedures

Encapsulation: combining data and code into a single object

Data hiding: object's ability to hide data from code outside the object

Class: a collection of programming statements that specify attributes and methods; description of an object

Subclasses can be created from a more general superclass. Subclasses inherit attributes and methods of a superclass used to create it.
Vehicle (superclass) -> Truck, Car, Plane (subclasses)