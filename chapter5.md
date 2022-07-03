# Chapter 5: Loops and Files

## Increment and Decrement Operators

Increment: increase by 1
Decrement: decrease by 1

++ and -- are unary operators that can increment and decrement, respectively
Both can be used as a prefix or postfix

Postfix: increment happens after variable is used in expression
Prefix: increment happens before variable is used

## While Loop

Loop is a control structure that causes parts of a program to repeat

While loops have:
* boolean condition that evaulautes to true or false
* group of statements to execute as long as the expression is true

If the boolean expression is true, the statements will execute; after executing the loop will re-start and the condition will be checked again

Iteration: each repetition of a loop

Pretest loop: tests condition before each iteration

Infinite loop: does not have a way within itself to stop (boolean condition never updates, semicolon after entry condition)

Style best practices: if only one statement is supposed to execute, it should be indented one additional level on the next line after *while*; if it repeats a block, each line within the braces should be indented

While loops can be used to repeatedly get input until the exit condition is met

Conditional loops: executes as long as a condition exists

## Do-while Loops

Posttest loop: boolean expression is evaluated after each iteration

**always performs at least one iteration** then evaluated boolean expression

## For loop

Performs a known number of iterations

Count-controlled loops: repeats a specific number of times

Must:
* initialize a control variable to aa starting value
* test the control variable by comparing to a maximum value
* update the control variable each iteration

Loop header:
for (initialization; test; update)

Also a pretest loop

Don't modify the control variable in the loop body

You can declare and initialize the control variable in the loop header in order to limit its scope

Can use user input to set the maximum number of times to iterate

Loops can measure totals by adding amounts to an accumulator variable

User input can continue until a *sentinel value* is input; value that cannot be mistaken for program input

## Nested Loops

Outer loop: minute hand of a clock
Inner loop: second hand of a clock

For each iteration of the outer loop, the inner loop has completed a complete series of iterations
Inner loops complete their iterations before outer loops do
To get the total number of loops for a nested loop, mutliply the number of iterations in all loops

## Break and Continue

Break: loop stops and the program exits to the code following the loop
Breaks are often used in switch statements, but not ideal for loops

continue: current iteration immediately ends, loop begins preparing for next iteration (checking entry condition)
Also not ideal for loops

# Deciding Which Loop to Use

While: ideal for situations where you do not want loop to iterate if condition is false from the beginning, also for using a sentinel value to determine when to stop

Do-while: use when you want the loop to iterate at least once

For: convenient for using the loop variable as a counter, or when exact number of iterations is known 

## File Input and Output

Java API provides classes for reading and writing to files

import java.io.*; to use PrintWriter 

To use a file for a program:
* file is opened
* data is written to the file, or read from the file
* file is closed when program is done

Files can be text or binary

### Writing data to a file

PrintWriter class allows you to open a file for writing

Create an instance of PrintWriter
PrintWriter outputFile = new PrintWriter("StudentData.txt");
Also creates an empty text file in the current directory
If a file by that name already exists in the current directory, it will be deleted and replaced by an empty file

Can also append data to a file by including boolean true as a parameter after filename

.println(); writes a line of data to the file
.print(); writes data without the newline

.close(); will close the file after writing to it

Throwing exceptions: if an error is encountered while creating (or opening) a file, IOException in the method header allows the program to re-throw the exception

Can specify a different directory by including the path in the file name

### Reading data from a file

To read from a file, use Scanner and use a File object as an argument instead of System.in

.nextLine(); can read the next line from a file

Also requires a IOException in the method header to handle exceptions

.hasNext() method determines if a file has reached its end