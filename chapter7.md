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

Elements in arrays can be manipulated just like variables; use a loop to iterate through all elements

Length = number of elements in the array
Largest subscript in an array is length - 1

Length cannot be changed after initialization

Special for loop:
for (dataType elementVariable : array) {
   statement(s); 
}


dataType elementVariable is a variable declaration for receiving the value of an array element
array is the array to operate on
statement is what executes during each iteration

Enhanced for loop does not need the length value
Cannot be used for: 
* changing array elements
* iterating in reverse order
* only accessing some array elements
* using more than one array
* accessing a specific subscript

To copy arrays: 
Iterate through original array and copy each element to a new array
Assigning a new array to an original array only copies the memory address, so they will reference the same object

Arrays can be passed as an argument to a method

Reference to the array is passed

## Useful Array Algorithms

This section covers:

#### Comparing Arrays

Arrays cannot be compared like variables; memory address will be compared
Must compare each element, one at a time

#### Summing array values

Use a loop with an accumulator variable

#### Averaging array values

same as summing, but divide by length

#### finding the min and max

copy the first element into a variable for "highest" and/or "lowest"
Iterate through and compare each element
If any element is higher than highest, that element becomes the new highest
Vice versa for lowest

Arrays can be returned by methods
Correct return type must be specified in method header

String arrays!

Array of strings is a reference variable that references each individual string (since strings are also reference variables)

If not initialized, String arrays will be set to null at each element

Arrays of objects!
You can also create an array of class objects
Array will be initialized to null values, must create objects each element will reference

Sequential search: uses a loop to sequentially step through each element in an array, compares each value to the value being searched for

## Selection sort and binary search

sort: arrange data in some order
search: locate a specific item

Selection sort: smallest value is located and moved to index 0, next smallest value is located and moved to index 1...

public static void selctionSort(int array[]) {
    int startScan, index, minValue, minIndex;
    for (startScan = 0; startScan < array.length - 1; startScan++) {
        minIndex = startScan;
        minValue = array[startScan];

        for (index = startScan + 1; index < array.length; index++) {
            if (array[index] < minValue) {
                minValue = array[index];
                minIndex = index;
            }
        }
        array[minIndex] = array[startScan];
        array[startScan] = minValue;
    }
}

Binary search: values must be sorted in ascending order, starts in the middle and compares to the value being looked for, then starts in the middle of the first half (for a smaller value) to the last half (for a larger value)

Longer and I don't feel like typing it :(

Two-dimensional arrays: array of arrays, "rows" and "columns"
int[][] array = new int[3][3]

Use nested loops to access an element in a 2D array

To initialize a 2D array, encolse each row's initialization list in its own set of braces
int[][] numbers = { {1, 2, 3}, {4, 5, 6}. {7, 8, 9} };

2D arrays have multiple length fields: one for holding the number of rows, each row holds a length field for the number of columns

