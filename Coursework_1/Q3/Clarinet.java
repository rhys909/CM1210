public class Clarinet extends Woodwind{
  private String clarinetType;

  //Constructors

  public Clarinet(String clarinetType, String Mouthpiece, String Name, Float Price, Float Weight, String countryOfOrigin, String Owner){
    super(Mouthpiece, Name, Price, Weight, countryOfOrigin, Owner);
    this.clarinetType = clarinetType;
  }

  //Methods

  public String getClarinetType(){
    return clarinetType;
  }

  public void printString(){
    super.printString();
    System.out.println("This clarinet is the " + clarinetType + ".\n");
  }

}
