// First question to calculate an average using java
import java.util.Scanner;

public class forLoop {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int Total = 0;

    System.out.print("Input Marks Available: ");
    int marksAvailable = in.nextInt();
    System.out.print("Input Mark: ");
    int markGivenFirst = in.nextInt();
    Total += markGivenFirst;

    for (0 <= Total && Total > marksAvailable - 1){
      System.out.print(str("Input Next Mark: "));
      int markGiven = in.nextInt();
      if (markGiven != int) break;
      else (Total += markGiven) continue;
    }
    System.out.print("Input No Of Questions: ");
    int noOfQ = in.nextInt();
    float Avrg = Total / noOfQ;
    System.out.print(int(Avrg));
  }
}
