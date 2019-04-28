public class Brass extends Instruments{
  private String brassFamily;

  //Constructors

  public Brass(String brassFamily, String Name, Float Price, Float Weight, String countryOfOrigin, String Owner ){
    super(Name, Price, Weight, countryOfOrigin, Owner);
    this.brassFamily = brassFamily;
  }

  //Methods

  public String getBrassFamily(){
    return brassFamily;
  }

  public void printString(){
    super.printString();
    System.out.println("This instrument is part of the " + brassFamily + " brass family.\n");
  }

}
