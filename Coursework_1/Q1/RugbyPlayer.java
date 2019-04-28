import java.util.*;

public class RugbyPlayer {
  private String Name;
  private String playerID;
  private int triesScored;
  private String teamName;
  private String teamID;
  private String stdmName;
  private String stdmStreet;
  private String stdmTown;
  private String stdmPstCde;

  //Constructors

  public RugbyPlayer( String Name, String playerID, int triesScored, String teamName, String teamID, String stdmName, String stdmTown, String stdmPstCde, String stdmStreet ){
    this.setName(Name);
    this.setID(playerID);
    this.triesScored = triesScored;
    this.setTeamName(teamName);
    this.setTeamID(teamID);
    this.setStadiumName(stdmName);
    this.setStadiumTown(stdmTown);
    this.setStadiumPostCode(stdmPstCde);
    this.setStadiumStreet(stdmStreet);
  }

  public RugbyPlayer(){
    Name = "";
    playerID = "";
    triesScored = 0;
    teamName = "";
    teamID = "";
    stdmName = "";
    stdmTown = "";
    stdmPstCde = "";
    stdmStreet = "";
  }

//  public void readFile(String filename){
  //  try {
//      File file =new File(filename);
//      BufferedReader br = new BufferedReader(new FileReader(file));
//      String line;
//      while ((line = br.readLine()) != null){
//        System.out.println(line);
//      }
//    }catch(IOException e){
//        System.out.println("Filename error!");
//    }
//  }

  public void setName(String Name){
    try{
      if (Name.matches("^[A-Z]{1}[a-z]+[\\s]{1}[A-Z]{1}[a-z]+$")){
        this.Name = Name;
      }
    }catch(Exception e){
      System.out.println("Please make sure your input is in the form of First name whitespace Last name \nwith the first letter of each name having a capital letter.");
    }
  }

  public void setID(String playerID){
    try{
      if (playerID.matches("^RFU[0-9]{5}$")){
        this.playerID = playerID;
      }
    }catch(Exception e){
      System.out.println("Please ensure that your input is in the format RFU followed by five digits \nunique to that player.");
    }
  }

  public void setTeamName(String teamName){
    try{
      if (teamName.matches("^[A-Za-z\\s]+$")){
        this.teamName = teamName;
      }
    }catch (Exception e){
      System.out.println("Please enter a valid team name.");
    }
  }

  public void setTeamID(String teamID){
    try{
      if (teamID.matches("^[A-Z]{3}[0-9]{4}$")){
        this.teamID = teamID;
      }
    }catch (Exception e) {
      System.out.println("Please enter a valid team ID in the format 3 capital letters followed by 4 digits");
    }
  }

  public void setStadiumName(String stdmName){
    try{
      if (stdmName.matches("^[A-Za-z\\s]+$")){
        this.stdmName = stdmName;
      }
    }catch (Exception e){
      System.out.println("Please enter a valid stadium name.");
    }
  }

  public void setStadiumTown(String stdmTown){
    try{
      if (stdmTown.matches("^[A-Za-z\\s]+$")){
        this.stdmTown = stdmTown;
      }
    }catch (Exception e){
      System.out.println("Please enter a valid town name.");
    }
  }

  public void setStadiumPostCode(String stdmPstCde){
    try{
      if (stdmPstCde.matches("^[A-Z]{1,2}[0-9]{1,2}[A-Z]? [0-9]{1}[A-Z]{2}$")){
        this.stdmPstCde = stdmPstCde;
      }
    }catch(Exception e){
        System.out.println("Invalid post code for the Stadium!\n");
    }
  }

    public void setStadiumStreet(String stdmStreet){
      try{
        if (stdmTown.matches("^[A-Za-z\\s]+$")){
          this.stdmStreet = stdmStreet;
        }
      }catch (Exception e){
        System.out.println("Please enter a valid street name.");
      }
    }

//    public void regexChecker(String theRegex, String stringToCheck){
//      Pattern checkRegex = Pattern.compile(theRegex);
//      Matcher regexMatcher = checkRegex.matcher(stringToCheck);
//    }

  //Methods

  public String getName(){
      return Name;
  }

  public String getPlyrID(){
    return playerID;
  }

  public int getTries(){
    return triesScored;
  }

  public String getTeamName(){
    return teamName;
  }

  public String getTeamID(){
    return teamID;
  }

  public String getStdmName(){
    return stdmName;
  }

  public String getStdmTown(){
    return stdmTown;
  }

  public String getStdmStreet(){
    return stdmStreet;
  }

  public String getStdmPstCde(){
    return stdmPstCde;
  }

  public String playerToString(){
    return ( "\nPlayer Name: " + Name + " \nPlayer ID: " + playerID + " \nTries Scored: " + triesScored + " \nTeam Name: " + teamName + " \nTeam ID: " + teamID + " \nStadium Name: " + stdmName + " \nStadium Street: " + stdmStreet + " \nStadium Town: " + stdmTown + " \nStadium Postcode: " + stdmPstCde);
  }
}
