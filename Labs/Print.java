public class Print {
  public static void main( String[] args) {
    System.out.printf("%.2f", Math.PI);
    System.out.printf("%.4f", Math.PI);
    System.out.printf("%4d", 12);
    System.out.printf("%2$d %1$d", 48, 47);
    System.out.printf("%2$x %1$o", 48, 47);
  }
}
