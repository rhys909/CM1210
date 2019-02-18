import jave.util.Scanner;

public class AddInt {
  public static void main ( String[] args ) {


    int a = getInt();
    int b = getInt();
    

  }

  public static int getInt(){
      Scanner in = new Scanner(System.in);
      System.out.print("Input Number: ");
      int a = in.NextInt();
      return a;
  }
}
