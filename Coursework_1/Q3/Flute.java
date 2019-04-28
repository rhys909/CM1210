public class Flute extends Woodwind{
  private String fluteCategory;

  //Constructors

  public Flute(String fluteCategory, String Mouthpiece, String Name, Float Price, Float Weight, String countryOfOrigin, String Owner){
    super(Mouthpiece, Name, Price, Weight, countryOfOrigin, Owner);
    this.fluteCategory = fluteCategory;
  }

  //Methods

  public String getFluteCategory(){
    return fluteCategory;
  }

  public void printString(){
    super.printString();
    System.out.println("This flute comes under the " + fluteCategory + " category of flutes.\n");
  }

}
