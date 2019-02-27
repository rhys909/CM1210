public class Employee {
  private String name;
  private int idNumber;
  private String department;
  private String position;

  //Constructors
  public Employee( String name, int idNumber ) {
    this.name = name;
    this.idNumber = idNumber;
  }

  public Employee( String name, int idNumber, String department, String position ) {
    this.name = name;
    this.idNumber = idNumber;
    this.department = department;
    this.position = position;
  }
  public Employee() {
    name = "";
    idNumber = 0;
    department = "";
    position = "";
  }

  // methods
  public String getName() {
    return name;
  }
  public int getID() {
    return idNumber;
  }
  public String getDept() {
    return department;
  }
  public String getPos() {
    return position;
  }

  public String toString(){
    return name + " "  + idNumber + " " + department + " " + position;
  }
}
