// WhileTest.java
// Example of a while loop.
// Calculates the first square number above 1500.

public class WhileTest {
   public static void main( String[] args ) {
      int i = 1;

      /*
      Increment i until its square is above 1500.
      */
      while ( (i * i) < 1500 )
         i++;

      /*
      Output results.
      */
      System.out.println( "The first square number above 1500 is " 
						  + i * i ); // Note how we can spread a line of code across multiple lines
   }
}