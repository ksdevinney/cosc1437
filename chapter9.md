# Chapter 9: Inheritance

Classes can be based on an existing class

"is-a" relationship: specialized object has all the characteristics of the general object, plus its own additional characteristics
ex: a rectangle is a shape

Superclass: general class
Subclass: specialized class
Subclass is an extended version of the superclass; it automatically inherits fields and methods from the superclass

Class declaration:
public class FinalExam extends GradedActivity
extends keyword shows inheritance from class
Subclass inherits all public members; constructors are not inherited
Subclass can call public methods present in the superclass; superclass cannot call subclass methods
Superclass constructor executes before subclass constructor

Use the *super* keyword to call a specific method from the superclass

If a superclass does not have a default constructor or a no-arg constructor, subclass must call one of its constructors

Overriding: method in the subclass to replace an inadequate method in the superclass
Subclass method must have the same signature as the superclass method
@Override annotation indicates to the compiler that you are attempting to override; will throw an error if overriding doesn't happen
Even with overriding, subclass can still call superclass methods using super.methodName()

Overloading and overriding are not the same- overloaded methods have different signatures
Both can take place in inheritances; overriding can only happen in inheritances

Methods declared with *final* in the header cannot be overridden

Protected: access specifier; protected members can be accessed by members of the class, the subclass, and classes in the same package
Class members that are not declared with an access specifier are given package access
Package access: any member in the same package can access

Superclasses can inherit from other classes

All classes inherit from Object, provided by Java API
Object provides .toString and .equals

Polymorphism: allows you to do some weird, wild stuff with classes:
GradedActivity exam1 = new FinalExam();
GradedActivity exam2 = new PassFailActivity();
GradedActivity exam = new PassFailExam();
Are all valid because all 3 classes inherit from GradedActivity class
All objects of the GradedActivity data type are assigned reference variables to different types of objects;
cannot call methods of those classes, only GradedActivity

Binding: object's data type determines which (overidden) method is called, not the variable type
Examples above would not call the GradedActivity methods if the object has an overridden version
ex: exam2 uses PassFailActivitiy's version of getGrade()

instanceOf operator can determine if a reference variable is an instance of a particular class

## Abstract Classes!

Abstract method: appears in a superclass, has no header and no body, requires overriding by subclass

Abstract classes cannot be instantiated, but are there to serve as a superclass for other classes
public abstract class ClassName

Classes that contain abstract methods cannot be instantiated, must serve as a superclass

## Interfaces

Specifies behavior for a class

Interface: class that contains only abstract methods
public interface InterfaceName

All methods in an interface are inherently public

Any class that implements an interface must override all methods specified by the interface

use *implements* keyword instead of *extends*

Classes can only inherit from one superclass, but can implement multiple interfaces

Default method: interface with a body
*default* keyword is required
Classes are not required to override default methods

## Anonymous Inner Classes

inner class: class defined within another class
anonymous: has no name
anonymous inner class: must implement an interface or extend another class

For classes that are simple, and only need to be used once

new ClassOrInterfaceName() {}
Creates an object that is an instance that extends the class or implements the interface

## Functional Interfaces and Lambda

can simplify anonymous inner classes

functional interface: has one abstract method

lambda expression
parameter -> expression

IntCalculator square = x -> x * x;

Lambda expressions can be void (if the abstract method is void)

Can use more than one parameter:
(x, y) -> x + y;

Can have no parameters
Can use multiple statements in the expression body, but use {}