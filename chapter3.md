# Chapter 3: Classes and Objects

## Class

Objects can store data and perform operations

Objects are created from classes; classes are code that describe a specific type of object. Each object is an instance of its class

Building a class:
* decide which attributes it needs
* determine what methods can be used on it

Access specifier (public or private) indicates how the class may be accessed, if public code will be accessible outside of the file
For class members:
**public** means the member can be be accessed inside or outside of the class
**private** cannot be accessed by code outside of the class

To create an object from a class:
ClassName variableName = new ClassName();

variableName will then be used to reference the object created, all numeric fields initialized to 0 unless specified otherwise

void: method that does not return a value
public dataType for methods that return a value of the specified type

return statements return whatever is after the word; can assign a private member to an outside variable this way

Accessor methods: gets a value from a field but does not change it
Mutator methods: stores or changes a value in a field

Data hiding: using *private* to make data inaccessible outside the class; on a larger scale, this assures your classes should always work the way you intend them to

Stale data: attribute that may become incorrect if other attributes change (area could become stale if length or width change in the rectangle example)

Be consistent about whether classes have the field declarations or the public methods first

## Passing Arguments

You can pass multiple arguments to a method, apparently

Arguments are passed by value- a copy of the argument's value is passed into the parameter value; parameter variable changes have no effect on the original argument

## Instance Fields and Methods

You can create multiple instances of the same class, each with their own data

Each instance of a class has its own *instance fields/variables*, *instance methods* operate on an instance of a class

## Constructors

Constructor: method that is automatically called when an object is created; perform setup operations such as storing initial values in instance fields

Accepts arguments to assign to instance fields, doesn't specify a return type

If no constructor is used, Java uses a default one that sets numeric fields to 0, boolean fields to false, char fields to unicode 0, and reference fields to null

No-arg constructors: don't accept arguments

Strings can be created the same way as other classes:
String name = "Katie";
String name = new String("Katie");

## Classes, Variables, and Scope

Local variables: variables inside a method; only available in the method where it is declared
Fields: variables inside a class, but not inside a method; entire class where it is declared (can be used by methods in the same class)
Parameter variables: inside the parentheses of a method header; can be used in the method where it is declared

Shadowing: having a local variable with the same name as a field (probably not ideal)

## Packages and Imports

Package: group of related classes

May have to import a package in order to use it

Explicit: import one specific class from a package
import java.util.Scanner;

Wildcard: imports all of the classes in a package
import java.util.*;

java.lang is automatically imported into every program (contains String and System)

## Finding Classes

Determine which classes are necessary: 
1. get a written description of the problem domain
2. identify all nouns and pronouns in the description (potential classes)
3. refine the list, include only classes that are relevant to the problem

Identify class responsibilities:
* information the class is responsible for having
* actions the class is responsible for doing