// Concatenation.java
// An example of Concatenation in java

public class Concatenation {
   public static void main( String args[] ) {

   		String x = "99";
   		String y = "\tballoons";

		/*
		The concatenation operator + joins together two strings to form a third, new string.  
		Note: As long as ONE of the operands is a string, the other operand can be of any type.
		*/
   	   	
   	   	System.out.println( "matt" + " loves Java." );
		System.out.println( 99 + " red balloons." );
		System.out.println( x + " red balloons." );
		System.out.println( x.toString() + y ); // String is an obect, so we can us ethe toString() method

   }
}
