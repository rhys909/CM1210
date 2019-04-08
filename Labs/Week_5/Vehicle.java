public class Vehicle{
  private String Manufacturer;
  private int Cylinders;
  private String Owner;

  public Vehicle( String Manufacturer, int Cylinders, String Owner){
    this.Manufacturer = Manufacturer;
    this.Cylinders = Cylinders;
    this.Owner = Owner;
  }
  public Vehicle( String Manufacturer, int Cylinders ){
    this.Manufacturer = Manufacturer;
    this.Cylinders = Cylinders;
    Owner = "";
  }
  public Vehicle(){
    Manufacturer = "";
    Cylinders = 0;
    Owner = "";
  }

  public getManufacturer() {
    return Manufacturer;
  }
  public getCylinders(){
    return Cylinders;
  }
  public getOwner(){
    return Owner;
  }
  public toString(){
    return Owner + "'s vehicle is made by " + Manufacturer + " and has " + Cylinders + " Cylinders.";
  }
}
