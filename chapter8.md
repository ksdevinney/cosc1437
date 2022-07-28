# Chapter 8: Text Programming and Wrapper Classes

Wrapper classes for variables of a primitive type contain a value as well as methods for performing operations

Wrapper classes creates objects instead of variables
Immutable, more difficult to use as values for simple operations

Some Character class methods:
* boolean isDigit(char c)
* boolean isLetter(char c)
* boolean isLetterOrDigit(char c)
* boolean isLowerCase(char c)
* boolean isUpperCase(char c)
* boolean isSpaceChar(char c)
* boolean isWhiteSpace(char c) : tests for space, tab, or newline
* char toLowerCase(char c)
* char toUpperCase(char c)

toLowerCase and toUpperCase return the lower or uppercare verion of the character passed. If the character is already lower or upper, or if it is not a character that has cases, the method will return the given char

String class contains methods for finding and working with substrings
* boolean startsWith(String s)
* boolean endsWith(String s)
* boolean regionMatches(int start, String s, int start2, int n) : returns true if the specified region of the calling string matches a specified region of the string passed in
* boolean regionMatches(boolean ignoreCase, int start, String s, int start2, int n)

startsWith and endsWith are case sensitive

Lots of substring methods...
Substring finding
Substring copying
Substring modification

(copying and modification require a new string variable)

Static valueOf methods

StringBuilder: similar to String, but you can change the contents of a StringBuilder object
StringBuilder() : constructor for up to 16 characters
StringBuilder(int i) : constructor for i characters
StringBuilder(String s) : initializes with s + space for 16 characters

(listing of many of the same methods usable by String class)

object.append(item) : append a string representation of item to object's current contents
object.insert(start, item) : inserts a value into the calling object's string
object.replace(start, end, string)

Tokenizing: breaking a string into its components
Delimiter: character separating tokens

java.util.StringTokenizer allows you to tokenize a string

.split() takes a delimiter as an argument

Wrapper classes exist for numeric data types as well
Parse methods for data types can get numeric data from a string
Wrapper classes also have toString methods (also toBinaryString, toHexString, toOctalString for large numbers)

Autoboxing: automatic process of placing a value inside an object, ex:
Integer number = new Integer(7);

Unboxing: converting a wrapper class object to a primitive type, ex:
int primitiveNumber = number;

Primitive values can be added to an ArrayList through autoboxing, .add(5) will automatically convert 5 into a wrapper class object