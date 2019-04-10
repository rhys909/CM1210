package q1java;

import java.util.Scanner;

public class PlayerStore{
  public static void main(String args[]){
    Scanner textGet = new Scanner(System.in);
    Scanner numGet = new Scanner(System.in);

    RugbyPlayer player = new RugbyPlayer();

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

        }
        break;
      case 2:
        try {
            System.out.println("Please enter the players first and last names seperated by a space.\n");
            String Name = textGet.nextString();
            System.out.println();
            String playerID = textGet.nextString();
            System.out.println();
            int triesScored = numGet.nextInt();
            System.out.println();
            String teamName = textGet.nextString();
            System.out.println();
            String teamID = textGet.nextString();
            System.out.println();
            String stdmName = textGet.nextString();
            System.out.println();
            String stdmStreet = textGet.nextString();
            System.out.println();
            String stdmTown = textGet.nextString();
            System.out.println();
            String stdmPstCde = textGet.nextString();

            RugbyPlayer player = new RugbyPlayer(String Name, int playerID, int triesScored, String teamName, int teamID, String stdmName, String stdmTown, String stdmPstCde, String stdmStreet);

            RugbyPlayersTable.put(playerID, RugbyPlayer.playerToString())
        }
        catch(Exception e){

        }
        break;
      case 3:
        try {

        }
        catch(Exception e){

        }
        break;
      case 4:
        try {

        }
        catch(Exception e){

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
      }
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
