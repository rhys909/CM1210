package q1java;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class PlayerStore{
  public static void main(String args[]){
    Scanner textGet = new Scanner(System.in);
    Scanner numGet = new Scanner(System.in);

    RugbyPlayer player = new RugbyPlayer();
    //True whilst user wants to add or remove players is set to false when user choice == 10
    boolean open = true;
    String fileLoader = "";

    while(open){
      System.out.println("Please choose what you wish to do. \n \n");
      System.out.println("1) Create a new blank rugby player dictionary");
      System.out.println("2) Add a player to the dictionary");
      System.out.println("3) Read a .txt file");
      System.out.println("4) Create a blank .txt file");
      System.out.println("5) Display all rugby players details");
      System.out.println("6) Delete an entry from the .txt file");
      System.out.println("7) Delete an entry from the dictionary");
      System.out.println("8) Search for a Stadium");
      System.out.println("9) Enter the range of players you wish to view i.e. 2-6");
      System.out.println("10) EXIT")
      System.out.println("Please enter your choice: ");

      int userChoice = numGet.nextInt();
      String invalidInput;


        switch (userChoice) {

          case 1:
            try {
              Hashtable<String, String> RugbyPlayersTable = new Hashtable<String, String>();
            }
            catch(Exception e){
              System.out.println("Error generating dictionary.")
            }
            break;

          case 2:
            try {
              System.out.println("Please enter the players first and last names seperated by a space.\n");
              String Name = textGet.nextString();
              System.out.println("Please enter the player ID in the format RFU***** where * is a digit.\n");
              String playerID = textGet.nextString();
              System.out.println("Please enter the number of tries scored by the player.\n");
              int triesScored = numGet.nextInt();
              System.out.println("Please enter the name of the team the player plays for.");
              String teamName = textGet.nextString();
              System.out.println("Please enter the team ID in the format...");
              String teamID = textGet.nextString();
              System.out.println("Please enter the teams stadium name.");
              String stdmName = textGet.nextString();
              System.out.println("Please enter the street which the stadium is situated.");
              String stdmStreet = textGet.nextString();
              System.out.println("Please enter the town which the stadium is situated.");
              String stdmTown = textGet.nextString();
              System.out.println("Please enter the postcode for the stadium.");
              String stdmPstCde = textGet.nextString();
              //generate a player
              try{
                RugbyPlayer player = new RugbyPlayer(Name,playerID,triesScored,teamName,teamID,stdmName,stdmTown,stdmPstCde,stdmStreet);
              }
              catch(Exception e){
                System.out.println("Player was not successfully created")
              }
              //add the player to the hash map
              RugbyPlayersTable.put(playerID, player.playerToString())
            }
            catch(Exception e){
              System.out.println("Error adding the player to dictionary")
            }
            break;

          case 3:
            try {
              System.out.println("Please enter the name of the file you wish to read:\n")
              String filename = textGet.nextString() + ".txt"
              file = load(true, filename);
            }
            catch(Exception e){
              System.out.println("Unable to load .txt file")
            }
            break;

          case 4:
            try {
              System.out.println("Please enter a name for your new file:\n")
              String newFile = textGet.nextString() + ".txt";
              //generate the new file for the user
              File file = new File("/" + newFile);
              file.createNewFile();
              System.out.println("New blank file created! It is called: " + newFile);
            }
            catch(IOException e){
              e.printStackTrace();
              System.out.println("Error creating a blank .txt file")
            }
            break;
          case 5:
            try {

            }
            catch(Exception e){

            }
            break;
          case 6:
            try {

            }
            catch(Exception e){

            }
            break;
          case 7:
            try {

            }
            catch(Exception e){

            }
            break;
          case 8:
            try {

            }
            catch(Exception e){

            }
            break;
          case 9:
            try {

            }
            catch(Exception e){

            }
            break;
          case 10:
            try {
              open = false;
            }
            catch(Exception e){

            }
            break;
    }
}}
