// PrimitiveTypes.java
// An example of Primitive Types in java

public class PrimitiveTypes {
   public static void main( String args[] ) {

   	   	/*
	   	The Java programming language is statically-typed, which means that all variables must 
	   	first be declared before they can be used. This involves stating the variable's type 
	   	and name. A variable's data type determines the values it may contain, plus the 
	   	operations that may be performed on it. The Java programming language supports 8 
	   	primitive types: byte, short, int, long, float, double, boolean and char. Each type 
	   	can hold a specific range of values (see session1 slides).
   	   	*/
       	
       	int matt = 21; //  tells your program that a field named "matt" exists, holds numerical data, and has an initial value of "21"

   	   	/*
		boolean - This data type has only two possible values: true and false. Use this data 
		type for simple flags that track true/false conditions.
   	   	*/
   	  	boolean myBool = true;


   	   	/*
		byte - The byte data type is an 8-bit signed two's complement integer. It has a minimum 
		value of -128 and a maximum value of 127 (inclusive). The byte data type can be useful 
		for saving memory in large arrays, where the memory savings actually matters.
   	   	*/
		byte myB = 100;


   	   	/*
		short - The short data type is a 16-bit signed two's complement integer. It has a minimum 
		value of -32,768 and a maximum value of 32,767 (inclusive). As with byte, the same 
		guidelines apply: you can use a short to save memory in large arrays, in situations where 
		the memory savings actually matters.
   	   	*/
		short myS = 10000;


   	   	/*
		int - By default, the int data type is a 32-bit signed two's complement integer.
   	   	*/
		int myI = 100000;


		/*
		long - The long data type is a 64-bit two's complement integer. An integer literal is of 
		type long if it ends with the letter L or l; otherwise it is of type int. It is 
		recommended that you use the upper case letter L because the lower case letter l is hard 
		to distinguish from the digit 1.
   	   	*/
		long myL = 12345678910L;


		/*
		float - The float data type is a single-precision 32-bit IEEE 754 floating point. A 
		floating-point literal is of type float if it ends with the letter F or f.
   	   	*/
		float myF = 1234.56F;


		/*
		double - TThe double data type is a double-precision 64-bit IEEE 754 floating point. Any 
		floating-point literal that does not ends with the letter F or f, will have a type double.
		You can optionally end with the letter D or d.
   	   	*/
		double myD = 1234.56;
		double myD1 = 1234.56D;


   	   	/*
		char - The char data type is a single 16-bit Unicode character. It has a minimum value of
		\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive)
   	   	*/
		char MyC = 'M';


		/*
		In addition to the eight primitive data types listed above, the Java programming language 
		also provides special support for character strings via the java.lang.String class. 
		Enclosing your character string within double quotes will automatically create a new String 
		object. String objects are immutable, which means that once created, their values cannot be 
		changed. The String class is not technically a primitive data type.
   	   	*/

		String myStr = "matt's string";


		/*
		Literals of types char and String may contain any Unicode (UTF-16) characters. If your editor 
		and file system allow it, you can use such characters directly in your code. If not, you can 
		use a "Unicode escape" such as '\u0108' (capital C with circumflex), or "S\u00ED Se\u00F1or" (
		Sí Señor in Spanish). Always use 'single quotes' for char literals and "double quotes" for 
		String literals. Unicode escape sequences may be used elsewhere in a program (such as in field 
		names, for example), not just in char or String literals.

		The Java programming language also supports a few special escape sequences for char and String 
		literals: 
		\b (backspace)
		\t (tab)
		\n (line feed)
		\f (form feed)
		\r (carriage return)
		\" (double quote)
		\' (single quote)
		\\ (backslash)
   	   	*/


		/*
   	   	NOTE: Default Values

		It's not always necessary to assign a value when a field is declared. Fields that are declared 
		but not initialized will be set to a reasonable default by the compiler. Generally speaking, this 
		default will be zero or null, depending on the data type. Relying on such default values, however, 
		is generally considered bad programming style!!

		The following chart summarises the default values for the above data types.


		byte						0
		short						0
		int							0
		long						0L
		float						0.0f
		double						0.0d
		char						'\u0000'
		String (or any object)  	null
		boolean						false
   	   	*/

   }
}
