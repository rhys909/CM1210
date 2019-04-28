public class Violin extends String{
  private String violinType;

  //Constructors

  public Violin(String celloSize, String Construction, String Name, Float Price, Float Weight, String countryOfOrigin, String Owner){
    super(Construction, Name, Price, Weight, countryOfOrigin, Owner);
    this.violinType = violinType;
  }

  //Methods

  public String getViolinType(){
    return violinType;
  }


  public void printString(){
    super.printString();
    System.out.println("This is a " + violinType + " type of violin.\n");
  }
}
