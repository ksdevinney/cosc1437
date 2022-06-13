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

Can be unary, binary, or ternary depending on how many operands are required

Unary: requires a single operand (negative sign)

Binary: two operands (+-*/%)

Integer division: when both operands of a division operator are integers; fractional part of the quotient is thrown away
ex: number = 5 / 2
5 and 2 are both integers, so number = 2
To avoid this, one operand must be a float, ex 5.0

Highest precedence operators:  -(negative), then *, /, %, then + -

Math: library provided by Java API

Java contains *combined assignment operators* as well, += and the like

## Data Type Conversion

Data cannot be stored in variables that would cause a "loss of precision," ex: double cannot be stored in an int

Primitive data types, from highest precision to lowest:
* double
* float
* long
* int
* short
* byte

Widening conversion: when values of lower-ranked data types are stored in a higher-rank, data is automatically converted (short to float)

Java does not automatically perform *narrowing conversions* because they can cause a loss of data (float to int), must use a *cast operator*
ex: x = (int)number
Values are truncated, but does not change the content of the variable

Values of byte and short are converted to int for mathematic operations

If one operand is a double, the value of the other operand will be converted to a double- answer will be a double

If one operand is a float, the other value will be converted to a float, and the answer will be a float

If one operand is a long, the other will be converted to a long, and the answer will be a long

## Named Constants

Named constants: values that cannot be changed

Use *final* in the declaration ahead of the data type
EX: final double INTEREST = 0.69

Constants are named in all caps by convention

Cannot use a final value before it has a value, final cannot be changed after it is declared

Math.PI is a named constant from the Java API

## String Class

String: a sequence of characters

Java does not have a data type for strings, but the Java API provides a class for handling them

Each object created from a class is an instance of the class

Primitive-type variables hold data items; class-type variables hold the address in memory of the data it is associated with
Reference variables = class-type variables

Strings contain methods to use on strings, ex: .length(), .charAt(index), .toLowerCase(), .toUpperCase()

## Scope

Scope: part of the program where a variable may be accessed

Local variables: declared inside a method

Scope of a local variable begins with the variable's declaration and ends at the end of the method where it is declared

More about this later, for now:
* Cannot use a variable before it has been declared
* Cannot have two local variables of the same name in the same scope

## Comments

Write them

// single line

/* multi-line */

Some programmers use * around their comments to visually separate them from the code

/** Documentation comments can be read by javadoc */

Javadoc exampleProgram.java creates documentation for exampleProgram in HTML

## Keyboard Input

System.in allows the program to read values from the keyboard; can only take in byte values

Scanner class can allow the program to read input of other data types. To use, declare a new variable of type Scanner, then create a Scanner object to read input from System.in, ex:
Scanner keyboard = new Scanner(System.in);

Scanner class has methods for reading different data types:
nextByte(), nextInt(), nextDouble(), nextLine(), nextLong(), nextShort()

Scanner must be imported manually:
import java.util.Scanner;

No method for reading a character, instead use nextLine() to read a string and then charAt(0) to get the first character typed

nextLine() does not skip newline characters, which are automatically included in the *keyboard buffer* after pressing Enter
To get around this, include a statement to consume the nextline character after taking input, ex keyboard.nextLine()

## Dialog Boxes

Use JOptionPane class to quickly create dialog boxes

Message dialog: displays a message and dismissal button

Input dialog: prompts the user for input, has an input box, OK, and cancel buttons

JOptionPane must be imported:
import javax.swing.JOptionPane;

showMessageDialog allows a message to be displayed:
JOptionPane.showMessageDialog(null, "message");

showInputDialog allows the user to enter input:
String name;
name = JOptionPane.showInputDialog("message: ");

must include system.exit(0); at the end of the main method

showInputDialog always returns input as a string, if you want a number value you will need to convert:
Integer.parseInt(string)

## Displaying Formatted Output

To format output for the console, use System.out.printf(FormatString, ArgumentList)
FormatString: string to be formatted
ArgumentList: 0 or more additional arguments to format output

printf can use format specifiers (%f) to print a non-string from the argument list

%f: float and double
%d: int, short, and long

%[flags][width][.precision]conversion

ex: %.2f will round to 2 decimal places instead of 6
Can only use precision with %f

width: minimum number of spaces used to display the value- will be right justified if value is smaller than specified width

Flags:
* display numbers with comma separators (,)
* pad numbers with leading zeroes (0)
* left justify numbers (-)

System.out.printf("%,15.2f\n", amount) 
prints variable amount with commas, in a minimum of 15 spaces, rounded to 2 decimals

Strings (%s) can also use field width and left justified flags

String.format for when you need to format a string that will not be displayed in the console

Works the same as printf, but it allows you to assign a reference to the formatted string to a variable