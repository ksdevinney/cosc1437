# Chapter 2: Java Fundamentals

Class header marks the beginning of a class definition:
public class X

public: specifies where the class can be accessed from (*public* means unrestricted)
class: indicates class definition

You may have more than one class in a file, but only one *public class*
Name of the public class must be same as the name of the file (X.java)

Method header marks the beginning of a method:
public static void main(String[] args)

Every Java application must have a **main**

Use a semicolon at the end of every line, except:
* comments
* class/method headers (since they are followed by braces)
* braces {}

Java API: standard library of prewritten classes for performing specific operations

EX: System(class).out(object).print(method)

println: at the end of the line, moves the cursor to the next line
print: just prints the text

\n also breaks to the next line

## Variables

Variables must be declared before they can be used

+ concatenates multiple strings; can be used with non-strings (will be converted to a string before printing)

String literals cannot be longer than one line; must be broken up and concatenated

Variable identifiers cannot begin with a number, contain spaces or illegal characters ($ is not illegal, but don't use it)

Class names are capitalized by convention

## Data Types

byte: numbers -128 to 127
short: numbers -32768 to 32767
int: numbers up to billions
long: big numbers
float: numbers with 7 decimal places of accuracy
double: longer numbers with 15 decimal places of accuracy

Can declare multiple variables of the same type in one line

Integers (numbers without decimals) are assumed to be of the int type, you can write them with an L at the end to be treated as a long

Floating point numbers (with decimals) are treated as doubles, can be prefixed with f or F to be treated as a float

Java uses E notation to represent values in scientific notation

Non-numerical data types:
boolean: true or false
char: single character in single quotes, ex 'A'

Initialization: you can assign a value to a variable when you declare it

## Operators