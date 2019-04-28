public class Trumpet extends Brass{
  private String Type;

  //Constructors

  public Trumpet(String Type, String brassFamily, String Name, Float Price, Float Weight, String countryOfOrigin, String Owner ){
    super(brassFamily, Name, Price, Weight, countryOfOrigin, Owner );
    this.Type = Type;
  }

  //Methods

  public String getType(){
    return Type;
  }

  public void printString(){
    super.printString();
    System.out.println("This trumpet is a " + Type + ".\n");
  }

}
