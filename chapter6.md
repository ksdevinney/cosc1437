# Chapter 6: Return to Classes and Objects

## Static Class Members

'static' keyword placed after access specifier for field or method

Static class members belong to the class, not instances of the class

Static fields are not stored in an instance of a class- only one copy of the field in memory, regardless of how many instances exist

Static methods may be called without using an instance of the class, ex: Math.pow()

Instance method can refer to a static variable in the same class
Instance method can call a static method
An object does not have to be created to use a static method

## Overloading

Overloading: creating methods with the same name, but different parameters
square method that accepts ints and a square method that accepts doubles

Binding: matching a method call to the correct method (using name and parameters)

Signature: method name and parameter types, in order

Constructors can be overloaded as well; each version must have a different signature

Java uses a default constructor when none are given; if there is a constructor that accepts arguments, you will also need a no-arg constructor

## Passing objects as arguments

Passing an object as an argument = passing a reference to that object

Since objects are passed by reference, methods can change information stored in the object

Methods can also return an object

## Methods to Include

### toString

toString: returns a string representing the state of the object

Good idea to include

Don't need to call- Java automatically calls toString when the object is passed as a reference to print or println

### equals

Using == to compare objects (and strings) will actually compare the addresses

.equals method should compare the contents of both objects

### copy

To copy an object, create a new object and use a copy method to set the new object's fields equal to the old object's

You can also use a constructor that accepts an object as an argument and sets the new instance's fields to be the same as the arguments

## Aggregation

Instance of a class is a field in another class

When using aggregate classes:
* Make a deep copy (copy of the object it references)
* Return copies of the field objects, not the originals

Deep copy: when you pass in an object as an argument, create a new object of that class using the reference object as a parameter- you no longer have a reference to the original object

Returning new field objects: use new keyword to create a copy of the referenced return object
Otherwise code outside the object could potentially change information in the object

Avoid using null references- programs will raise an exception if a method tries to use a field that has not been set (ex: calling .length on an object that doesn't have a no-arg constructor)
if statements can help with this

## this

Reference variable that an object can use to refer to itself

Can be used to reduce the amount of field names you need to write:
this.symbol = symbol 
instead of 
symbol = sym

Can be used to call a constructor from another constructor in the same class

## Inner Class

Class defined in another class definition

Inner class is only visible to code in the outer class, only code in the outer class can create an instance of the inner class

## Enumerated Types

Data type consisting of a set of predefined values

enum TypeName { constant, constant, constant }

Enumerated types are specialized classes
Come with toString automatically
ordinal = returns an integer representing the constant's ordinal value
Also equals and comparesTo

Can use enum constants with a switch statement

## Garbage Collection

JVM periodically removes unreferenced objects from memory

Objects that are not longer accessible are removed from memory

Finalize?