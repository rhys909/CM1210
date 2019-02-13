// Arithmetic.java
// An example of Arithmetic in java

public class Arithmetic {
   public static void main( String args[] ) {


   		int myInt = 2;
		double myDouble =  2.0;
		float myFloat = 2.0F;

		/*
		Two integer operands yield an integer result.
		*/
		System.out.println( "myInt + myInt = " + (myInt + myInt) );
		System.out.println( "myInt - myInt = " + (myInt - myInt) );
		System.out.println( "myInt * myInt = " + (myInt * myInt) );
		System.out.println( "myInt / myInt = " + (myInt / myInt) );
		System.out.println( "myInt % myInt = " + (myInt % myInt) );


		/*
		Given at least one double operand, a double will result.
		*/
		System.out.println( "myInt + myDouble = " + (myInt + myDouble) );
		System.out.println( "myInt - myDouble = " + (myInt - myDouble) );
		System.out.println( "myInt * myDouble = " + (myInt * myDouble) );
		System.out.println( "myInt / myDouble = " + (myInt / myDouble) );
		System.out.println( "myInt % myDouble = " + (myInt % myDouble) );		


		/*
		Given at least one float operand, a float will result.
		*/
		System.out.println( "myInt + myFloat = " + (myInt + myDouble) );
		System.out.println( "myInt - myFloat = " + (myInt - myDouble) );
		System.out.println( "myInt * myFloat = " + (myInt * myDouble) );
		System.out.println( "myInt / myFloat = " + (myInt / myDouble) );
		System.out.println( "myInt % myFloat = " + (myInt % myDouble) );

   }
}
