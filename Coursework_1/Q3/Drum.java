public class Drum extends Percussion{
  private String drumType;

  //Constructors

  public Drum(String drumType,String Pitched, String Name, Float Price, Float Weight, String countryOfOrigin, String Owner){
    super(Pitched, Name, Price, Weight, countryOfOrigin, Owner);
    this.drumType = drumType;
  }

  //Methods

  public String getDrumType(){
    return drumType;
  }

  public void printString(){
    super.printString();
    System.out.println("This drum is a " + drumType + ".\n");
  }

}
