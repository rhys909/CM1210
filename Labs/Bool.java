// Bool.java
// Demonstrates the relational and logical operators.
public class Bool {
   public static void main( String[] args ) {

      int i = 33;
      int j = 55;

      /*
      Output integer values in variables i and j.
      */
      System.out.println( "i = " + i );
      System.out.println( "j = " + j );

      /*
      The comparison operators are ==, !=, <, >, <=, and >=.
      All comparison operators return a boolean result, i.e. True or False.
      */
      System.out.println( "i < j is " + (i < j) ); // Less than operator
      System.out.println( "i > j is " + (i > j) ); // Greater than operator
      System.out.println( "i <= j is " + (i <= j) ); // Less than or equal to operator
      System.out.println( "i >= j is " + (i >= j) ); // Greater than or equal operator
      System.out.println( "i == j is " + (i == j) ); // Equality operator
      System.out.println( "i != j is " + (i != j) ); // Inequality operator
      
      /*
      The logical operators are ! (not) && (and), and || (or). Compound Boolean expressions 
      consist of one or more Boolean operands and a logical operator. Evaluation stops when 
      enough information is available to return a value.  
      
      NOTE: ! is evaluated first, then &&, then ||.
      */
      System.out.println( "(i < 10) && (j < 10) is " 
                              + ((i < 10) && (j < 10)) );
      System.out.println( "(i < 10) || (j < 10) is " 
                              + ((i < 10) || (j < 10)) );
      System.out.println( "!(i < 10) is " + (!(i < 10)) );
   }
}
