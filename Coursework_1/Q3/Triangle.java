public class Triangle extends Percussion{
  private String Note;

  //Constructors

  public Triangle(String Note,String Pitched, String Name, Float Price, Float Weight, String countryOfOrigin, String Owner){
    super(Pitched, Name, Price, Weight, countryOfOrigin, Owner);
    this.Note = Note;
  }

  //Methods

  public String getNote(){
    return Note;
  }

  public void printString(){
    super.printString();
    System.out.println("This triangle is tuned in the " + Note + " note.\n");
  }

}
