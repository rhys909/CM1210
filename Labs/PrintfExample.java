public class PrintfExample {
   public static void main(String[] args) {
      System.out.printf("%.3f%n", 1/3f);
	  System.out.printf("%.2f", Math.PI);  System.out.println();
	  System.out.printf("%.4f", Math.PI); System.out.println();
	  System.out.printf("%.4e", 1234.5678); System.out.println();
	  System.out.printf("%04d", 23); System.out.println();
	  System.out.printf("%4d", 12); System.out.println();
	  System.out.printf("%2$d %1$d", 48, 47);	  System.out.println();
	  System.out.printf("%2$x %1$o", 48, 47);	  System.out.println();
   }
}