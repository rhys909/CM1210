public class Truck extends Vehicle{
  private double loadCapacity;
  private int towCapacity;

  public Truck( double loadCapacity, int towCapacity){
    this.towCapacity = towCapacity;
    this.loadCapacity = loadCapacity;
  }

  public getLoad(){
    return loadCapacity;
  }
  public getTow(){
    return towCapacity;
  }
  public toString(){
    return Owner + "'s truck is made by " + Manufacturer + " and has " + Cylinders + " Cylinders. It also has a load capacity of " + loadCapacity + " and a tow capacity of " + towCapacity + ".";
  }

}
