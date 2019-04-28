public class String extends Instruments{
  private String Construction;

  //Constructors
  //3 String constructions Lutes (Violin), Harpes and Zithers (Piano)

  public String(String Construction, String Name, Float Price, Float Weight, String countryOfOrigin, String Owner){
    super(Name, Price, Weight, countryOfOrigin, Owner);
    this.Construction = Construction;
  }

  //Methods

  public String getConstruction(){
    return Construction;
  }

  public void printString(){
    super.printString();
    System.out.println("This string instrument has a " + Construction + " construction.\n");
  }

}
