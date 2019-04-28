public class Woodwind extends Instruments{
  private String Mouthpiece;

  //Constructors

  public Woodwind(String Mouthpiece, String Name, Float Price, Float Weight, String countryOfOrigin, String Owner){
    super(Name, Price, Weight, countryOfOrigin, Owner);
    this.Mouthpiece = Mouthpiece;
  }

  //Methods

  public String getMouthpiece(){
    return Mouthpiece;
  }

  public void printString(){
    super.printString();
    System.out.println("This Woodwind instrument uses a: " + Mouthpiece + ".\n");
  }

}
