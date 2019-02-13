public class ForExample {
    public static void main( String[] args ) {
        
        /*
        For loops can count up...
        */
        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
        }
        
        /*
        ... or down ...
        */
        for (int i = 10; i > 0; --i) {
            System.out.println(i);
        }
        
        /*
        ... or in steps ...
        */
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }
        
        /*
        ... or some other way (NOT RECOMMENDED)
        Note that the loop parameter doesn't
        have to be an int
        */
        for (float f = 0; f < 10; f += Math.random() ) {
            System.out.println(f);
        }

        /*
        The loop variable is only in scope within the 
        {} of the loop, the following would not compile
        UNCOMMENT IT TO CHECK
        */
        //System.out.println(i);
        
        /*
        Loops can be nested:
        */
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                // Note print - not println
                System.out.print( (i + j) + " " );
            }
            System.out.println(); // Insert new line
            // Note j not in scope here
        }
        
        /*
        Carefull with nested loops
        */

        /*
        for (int i = 0; i < 5; ++i) {
            // Easy to put i instead of j in following line
            // compiles as i is in scope. Would run 
            // continuously
            for (int j = 0; j < 5; ++i) {
                // Note print - not println
                System.out.print( (i + j) + " " );
            }
            System.out.println(); // Insert new line
            // Note j not in scope here
        }
        */
        
        /*
        Can omit some or all of the sections
        of the for declaration...
        (POOR STYLE and/or POOR CODE FOLLOWS)
        */
        int i = 0; // Should be inside loop
        for (; i < 10; ++i) {
            System.out.println( i );
        }
        // Poor style as now i is in scope
        
        // Should use a while loop 
        for (; Math.random() > 0.5;) {
            System.out.println("Hello");
        }
        
        // Poor style - very confusing to read
        for (int j = 0; j < 10;) {
            System.out.println(j++);
        }
        
    }
}
