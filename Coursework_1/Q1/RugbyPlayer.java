import java.util.regex;

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
  public RugbyPlayer(String Name, int playerID, int triesScored, String teamName, int teamID){
    this.Name = Name;
    this.playerID = playerID;
    this.triesScored = triesScored;
    this.teamName = teamName;
    this.teamID = teamID;
  }

  public RugbyPlayer(String Name, int playerID, int triesScored, String teamName, int teamID, String stdmName, String stdmTown, String stdmPstCde, String stdmStreet){
    this.Name = Name;
    this.playerID = playerID;
    this.triesScored = triesScored;
    this.teamName = teamName;
    this.teamID = teamID;
    this.stdmName = stdmName;
    this.stdmTown = stdmTown;
    this.stdmPstCde = stdmPstCde;
    this.stdmStreet = stdmStreet;
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

  //Methods
  public String getName(){
    if Name.matches("\D"){
      return Name;
    }
    else{

    }
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
    if
  }

  public String playerToString(){
    return ( "Player Name: " + Name + " \nPlayer ID: " + playerID + " \nTries Scored: " + triesScored + " \nTeam Name: " + teamName + " \nTeam ID: " + teamID + " \nStadium Name: " + stdmName + " \nStadium Street: " + stdmStreet + " \nStadium Town: " + stdmTown + " \nStadium Postcode: " + stdmPstCde)
  }
}
