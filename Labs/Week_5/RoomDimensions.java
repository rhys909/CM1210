public class RoomDimensions {
  private double width;
  private double length;

  public RoomDimensions() {
    width = width;
    length = length;
  }
  public RoomDimensions(double width, double length){
    this.width = width;
    this.length = length;
  }
  public RoomDimensions(){
    width = 0;
    length = 0;
  }

  public double getWidth() {
    return width;
  }
  public double getLength() {
    return length;
  }
  public double getArea() {
    return length*width;
  }
}
