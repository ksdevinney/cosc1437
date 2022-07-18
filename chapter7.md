# Chapter 7: Arrays and the ArrayList Class

Arrays let you hold multiple values of the same type in one variable
another type of reference variable

int[] numbers = new int[n];
n in second set of brackets represents number of elements in the array
first set of brackets indicates array
Size cannot change after being created

Array elements can be accessed using a subscript [i]

By default, Java initializes arrays with a default value (0 for ints)

Print arrays by index, printing the array will print a memory address
For loops are good for this

Java throws an exception when trying to access an invalid element (bounds checking)

You can also initialize an array with values
int[] numbers = {0, 1, 2, 3, 4, 5}

Can also place the brackets after variable name:
int numbers[]

int[] numbers, days, temps
initializes 3 array variables

int numbers[], days, temps
initializes 1 array, 2 int variables

