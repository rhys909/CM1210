// Casting.java
// An example of Casting in java

public class Casting {
   public static void main( String args[] ) {

		double myD =  6.73;
		int myI = 5;
		int myI1 = 65;
		char myC = 'm';

		/*
		Numeric types can be converted to other numeric types by using the appropriate cast operators.  
		A cast operator is formed by enclosing the destination type name in parentheses.
		*/
		System.out.println( "(int) myD = " + (int) myD );
		System.out.println( "(double) myI = " + (double) myI );
		System.out.println( "(char) myI1 = " + (char) myI1 );
		System.out.println( "(int) myC = " + (int) myC  );


		/*
		An easy way to convert any value to a string is to concatenate it with an empty string:
		*/
		String myStr = "" + myD;
		String myStr1 = "" + myI1;
		System.out.println( "\"\" + myD = " + myStr );
		System.out.println( "\"\" + myD1 = " + myStr1 );
		System.out.println( );


		/*
		Some important examples:
		*/
		System.out.println( "Integer & float division:" );
        System.out.println( "1 / 2   : " + (1 / 2) );
        System.out.println( "1 / 2.0 : " + (1 / 2.0) );
        System.out.println( );

        int x = 2;
        int y = 4;

        System.out.println( "Casting to ensure float division:" );
        System.out.println( "int x = 2;" );
        System.out.println( "int y = 4;" );
        System.out.println( "x / y         : " + (x / y) );
        System.out.println( "(float) x / y : " + ((float) x / y) );
        System.out.println( );

        int a = x / y;
        float b = x / y;

        System.out.println( "Assigning to a float still uses integer division:" );
        System.out.println( "int a = x / y;" );
        System.out.println( "float b = x / y;" );
        System.out.println( "a : " + a );
        System.out.println( "b : " + b );
        System.out.println( );

        float c = 0.7f;

        System.out.println( "Casting truncates - doesn't round:" );
        System.out.println( "c      : " + c );
        System.out.println( "(int)c : " + (int) c );
        System.out.println();

		/*
        Casting doesn't change the type:
        (Uncommenting the next line will give a compile error)
        */
        // int d = c;

        short e = 1;
        short f = 2;
        /*
        Short/byte must be cast EVEN if the result is small enough
        (Uncommenting the next line will give a compile error)
        */
        //short g = e + f;

        short g = (short) (e + f);
        
        /*
        Casting is only temporary.
        */
        System.out.println( 
               "The type is only changed for the current operation");
        float h = 15.264f;
        System.out.println( "h      : " + h );
        System.out.println( "(int)h : " + (int)h);
        System.out.println( "h      : " + h );

   }
}
