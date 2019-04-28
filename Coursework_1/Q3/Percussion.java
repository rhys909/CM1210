public class Percussion extends Instruments{
  private String Pitched;

  //Constructors

  public Percussion(String Pitched, String Name, Float Price, Float Weight, String countryOfOrigin, String Owner){
    super(Name, Price, Weight, countryOfOrigin, Owner);
    this.Pitched = Pitched;
  }

  //Methods

  public String getPitch(){
    return Pitched;
  }

  public void printString(){
    super.printString();
    System.out.println("The percussion instrument is: " + Pitched + ".\n");
  }

}
