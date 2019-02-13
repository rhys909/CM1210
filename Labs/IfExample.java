// IfExample.java
// An example of using If in java

public class IfExample {
   public static void main( String args[] ) {

		int numberOfEntries = 23;

		/*
    Output numberOfEntries
    */
    System.out.println("numberOfEntries = " + numberOfEntries );
		System.out.println();

		/*
    Check for a valid number of entries.
    */
      	if ( numberOfEntries <= 0 ) {
        	 System.out.println( "No entries" );
        	 System.exit( 0 );
      	}

      	// if-else Example
      	if ( numberOfEntries <= 10 ) {
        	 System.out.println( "between 1 and 10" );
      	} else if ( numberOfEntries <= 20 ) {
			     System.out.println( "between 11 and 20" );
      	} else if ( numberOfEntries <= 30 ) {
			     System.out.println( "between 21 and 30" );
      	}

   }
}
