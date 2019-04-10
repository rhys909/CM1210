package q1java;

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
    try{
      if Name.matches("^[A-Z]{1}[a-z]+[A-Z]{1}[a-z]+$"){
        this.Name = Name;
      }
    }
    catch(Exception e){
      System.out.println("Invalid Name for the player!\n")
    }
    }
    this.playerID = playerID;
    this.triesScored = triesScored;
    this.teamName = teamName;
    this.teamID = teamID;
    this.stdmName = stdmName;
    this.stdmTown = stdmTown;
    try{
      if stdmPstCde.matches("^[A-Z]{1,2}[0-9]{1,2}[A-Z]? [0-9][A-Z]{2}$")
        this.stdmPstCde = stdmPstCde;
    }
    catch(Exception e){
      System.out.println("Invalid post code for the Stadium!\n")
    }
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

  public void readFile(String filename){
    try {
      File file =new File(filename);
      BufferedReader br = new BufferedReader(new FileReader(file));
      String line;
      while ((line = br.readLine()) != null){
        System.out.println(line);
      }
      catch(IOException e){
        System.out.println("Filename error!")
      }
    }
  }

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
    return stdmPstCde
  }

  public String playerToString(){
    return ( "\nPlayer Name: " + Name + " \nPlayer ID: " + playerID + " \nTries Scored: " + triesScored + " \nTeam Name: " + teamName + " \nTeam ID: " + teamID + " \nStadium Name: " + stdmName + " \nStadium Street: " + stdmStreet + " \nStadium Town: " + stdmTown + " \nStadium Postcode: " + stdmPstCde)
  }
}
