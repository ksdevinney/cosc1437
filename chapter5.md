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