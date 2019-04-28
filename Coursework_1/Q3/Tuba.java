public class Tuba extends Brass{
  private int tubaTubeLength;

  //Constructors

  public Tuba(int TubeLength, String brassFamily, String Name, Float Price, Float Weight, String countryOfOrigin, String Owner ){
    super( brassFamily, Name, Price, Weight, countryOfOrigin, Owner );
    this.tubaTubeLength = TubeLength;
  }

  //Methods

  public int getTubeLength(){
    return tubaTubeLength;
  }

  public void printString(){
    super.printString();
    System.out.println("This tuba has a tube length of " + tubaTubeLength + ".\n");
  }

}
