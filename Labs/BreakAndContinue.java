// BreakAndContinue.java
// Demonstrates the use of break and continue.

public class BreakAndContinue {
   public static void main( String[] args ) {
      System.out.println("Starting first loop");
      for (int i = 0; i < 100; i++) {
         if (i == 74) break;        // Out of for loop
         if (i % 9 != 0) continue;  // Start next iteration
         System.out.println(i);
      }

      System.out.println("\nStarting second loop");
      int i = 0;
      while (true) {    // Infinite loop
         i++;
         int j = i * 27;
         if (j == 1269) break;      // Out of while loop
         if (i % 10 != 0) continue; // Start next iteration
         System.out.println(i);
      }
   }
}