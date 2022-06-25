# Chapter 4: Decision Structures

## if Statements

Allows program to execute some statements only under certain circumstances

In Java:
if (boolean expression)
    statement;

Relational operators:
< > >= <= != ==

if can also be used to execute a group of statements; if there is more than one statement, they must be enclosed in braces

flag: boolean that signals some condition exists in the program

Can use relational operators to compare characters; characters are compared by unicode values

## if-else

will execute one group of statements if the boolean expression evaluates to true, and a different set of statements if the boolean evaluates to false

(actually shown as two separate statements: if/else and additional if)

## nested if

If statements can be nested inside another if statement to test more than one condition

## if-else-if

tests a series of conditions, probably simpler than if else

trailing else: at the end of if-else series, for when none of the conditions pass

## Logical Operators

connect two or more relational expressions

&& and
|| or
! not

&& evaluates 2 or more expressions- only evaluates to true if all are true
Short-circuit evaluation: if the first expression is false, the expression on the right will not be checked

|| evaluates to true when either expression is true
Short circuit: if first expression is true, next expression(s) will not be checked

! unary operator that takes a boolean expression and reverses its logical value

Logical precedence:
! -> && -> ||

## Comparing Strings

Do not use relational operators to compare string values- String variable holds the memory address of an object; this would compare the memory addresses

Instead, use String class method .equals():
string1.equals(string2)

string1 is a reference variable, string 2 can be a variable or string literal

To see if one string is greater or less than another:
stringReference.compareTo(otherString)

Will return negative (stringReference is less than otherString), 0 (both are equal), or positive (stringReference is greater than otherString)

Strings are compared character by character, only corresponding characters (index by index) can be compared; if corresponding characters are identical but otherString is shorter, otherString will be less

.equalsIgnoreCase() and .compareToIgnoreCase() do the same as above, but ignore case of each letter

## Conditional Operator

Can use this ternary operator to create if-else statements

boolean expression ? value1 : value2

Ex:
System.out.println("Your grade is: " + (score < 60 ? "Fail" : "Pass"));

## Switch