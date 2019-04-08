import java.util.Scanner;

public class RoomCarpet extends RoomDimensions{
  public static void (String args[]){

    Scanner in = new scanner(System.in);

    private double size;
    private double carpetCost;

    public RoomCarpet( RoomDimensions dim, double cost ){
      System.out.print("What is the width? ")
      double width = in.nextline()
      System.out.print("What is the width? ")
      double length = in.nextline()
      dim = getArea(RoomDimensions( width , length ));
      cost = carpetCost;
    }

    public double getCost(){
      System.out.print("What is the cost per m2 in GBP? ")
      double carpetCost = in.nextLine();
      return carpetCost;
    }

    public double getTotalCost(){
      return size*carpetCost
    }


  }
}
