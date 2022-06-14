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