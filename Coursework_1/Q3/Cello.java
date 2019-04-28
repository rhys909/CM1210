public class Cello extends String{
  private String celloSize;

  //Constructors

  public Cello(String violinType, String Construction, String Name, Float Price, Float Weight, String countryOfOrigin, String Owner){
    super(Construction, Name, Price, Weight, countryOfOrigin, Owner);

    this.celloSize = celloSize;
  }

  //Methods

  public String getCelloSize(){
    return celloSize;
  }

  public void printString(){
    super.printString();
    System.out.println("This is a " + celloSize + " sized cello.\n");
  }
}
