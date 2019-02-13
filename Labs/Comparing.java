// Comparing.java
// An example of Comparing in java

public class Comparing {
   public static void main( String args[] ) {


   		int myInt = 2;
		double myDouble =  3.0;
		float myFloat = 1.0F;
		String myStr = "MATT";

		/*
		All comparison operators return True or False. All values of primitive types are comparable.
		*/
		System.out.println( "myInt == myInt = " + (myInt == myInt) );
		System.out.println( "myInt != myInt = " + (myInt != myInt) );
		System.out.println( "myInt < myInt = " + (myInt < myInt) );
		System.out.println( "myInt > myInt = " + (myInt > myInt) );
		System.out.println( "myInt <= myInt = " + (myInt <= myInt) );
		System.out.println( "myInt >= myInt = " + (myInt >= myInt) );

		System.out.println( "myInt == myDouble = " + (myInt == myDouble) );
		System.out.println( "myInt != myDouble = " + (myInt != myDouble) );
		System.out.println( "myInt < myDouble = " + (myInt < myDouble) );
		System.out.println( "myInt > myDouble = " + (myInt > myDouble) );
		System.out.println( "myInt <= myDouble = " + (myInt <= myDouble) );
		System.out.println( "myInt >= myDouble = " + (myInt >= myDouble) );

		System.out.println( "myInt == myFloat = " + (myInt == myFloat) );
		System.out.println( "myInt != myFloat = " + (myInt != myFloat) );
		System.out.println( "myInt < myFloat = " + (myInt < myFloat) );
		System.out.println( "myInt > myFloat = " + (myInt > myFloat) );
		System.out.println( "myInt <= myFloat = " + (myInt <= myFloat) );
		System.out.println( "myInt >= myFloat = " + (myInt >= myFloat) );


		/*
		Values of reference types are comparable if and only if they implement the compareTo method. 
		compareTo returns 0 if the two objects are equal (using the equals method), a negative integer 
		if the receiver object is less than the parameter object, and a positive integer if the receiver 
		object is greater than the parameter object.
		*/
		System.out.println(myStr.compareTo("MATE") == 0);
		System.out.println(myStr.compareTo("MATE") != 0);
		System.out.println(myStr.compareTo("MATE") < 0);
		System.out.println(myStr.compareTo("MATE") > 0);
		System.out.println(myStr.compareTo("MATE") <= 0);
		System.out.println(myStr.compareTo("MATE") >= 0);

   }
}
