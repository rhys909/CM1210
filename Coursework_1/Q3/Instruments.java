public class Instruments{
  private String Name;
  private Float Price;
  private Float Weight;
  private String countryOfOrigin;
  private String Owner;

  //Constructors

  public Instruments(String Name, Float Price, Float Weight, String countryOfOrigin, String Owner ){
    this.Name = Name;
    this.Price = Price;
    this.Weight = Weight;
    this.countryOfOrigin = countryOfOrigin;
    this.Owner = Owner;
  }

  //Methods

  public String getName(){
    return Name;
  }

  public Float getPrice(){
    return Price;
  }

  public Float getWeight(){
    return Weight;
  }

  public String getCountryOfOrigin(){
    return countryOfOrigin;
  }

  public String getOwner(){
    return Owner;
  }

  public void printString(){
    System.out.println("\nThe Instrument is called: " + Name + ". \nIt costs: " + Price + ". \nIt weighs: " + Weight + ". \nIt comes from: " + countryOfOrigin + ". \nIt is owned by: " + Owner + ".\n");
  }
}
