import java.util.Scanner;

public class GettingInput {
   public static void main(String[] args) {
      
	  Scanner in = new Scanner(System.in); // Create a scanner object passing std in to the constructor
	  
	  /*
	  Ask the user their name
	  */
	  System.out.print("What is your name? ");
	  String name = in.nextLine();
	  
	  /*
	  Ask the user their age
	  */
	  System.out.print("Hello " + name + ", how old are you? ");
	  int age = in.nextInt();
	  
	  System.out.println(name + " is " + age + " years old"); // output name and age
   }
}