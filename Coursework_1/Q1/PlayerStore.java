import java.util.*;
import java.io.*;


public class PlayerStore{
  public static void main(String args[]){
    Scanner textGet = new Scanner(System.in);
    Scanner numGet = new Scanner(System.in);

    RugbyPlayer player = new RugbyPlayer();
    Hashtable<String, String> RugbyPlayersTable = new Hashtable<String, String>();
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
      System.out.println("6) Delete an entry from the dictionary");
      System.out.println("7) Enter the range of players you wish to view i.e. 2-6");
      System.out.println("8) EXIT");
      System.out.println("Please enter your choice: ");

      int userChoice = numGet.nextInt();
      String invalidInput;


        switch (userChoice) {


          case 1:
            try {
              Hashtable<String, String> RugbyPlayersTableDummy = new Hashtable<String, String>();
            }
            catch(Exception e){
              System.out.println("Error generating dictionary.");
            }
            break;


          case 2:
            try {
              System.out.println("Please enter the players first and last names seperated by a space.\n");
              String Name = textGet.next();
              System.out.println("Please enter the player ID in the format RFU***** where * is a digit.\n");
              String playerID = textGet.next();
              System.out.println("Please enter the number of tries scored by the player.\n");
              int triesScored = numGet.nextInt();
              System.out.println("Please enter the name of the team the player plays for.");
              String teamName = textGet.next();
              System.out.println("Please enter the team ID in the format...");
              String teamID = textGet.next();
              System.out.println("Please enter the teams stadium name.");
              String stdmName = textGet.next();
              System.out.println("Please enter the street which the stadium is situated.");
              String stdmStreet = textGet.next();
              System.out.println("Please enter the town which the stadium is situated.");
              String stdmTown = textGet.next();
              System.out.println("Please enter the postcode for the stadium.");
              String stdmPstCde = textGet.next();
              //generate a player
              RugbyPlayer newPlayer = new RugbyPlayer(Name,playerID,triesScored,teamName,teamID,stdmName,stdmTown,stdmPstCde,stdmStreet);
              //add the player to the hash map
              RugbyPlayersTable.put(playerID, newPlayer.playerToString());
            }
            catch(Exception e){
              System.out.println("Error adding the player to dictionary");
            }
            break;


          case 3:
            try {
              System.out.println("Please enter the name of the file you wish to read:\n");
              String filename = textGet.next();
              filename = filename + ".txt";
              File file = new File(filename);
              FileReader fr = new FileReader(file);
              BufferedReader br = new BufferedReader(fr);
              String line;
              while((line = br.readLine()) != null){
                System.out.println(line);
              }
            }
            catch(Exception e){
              System.out.println("Unable to load .txt file");
            }
            break;


          case 4:
            try {
              System.out.println("Please enter a name for your new file:\n");
              String newFile = textGet.next() + ".txt";
              //generate the new file for the user
              File file = new File("/" + newFile);
              file.createNewFile();
              System.out.println("New blank file created! It is called: " + newFile);
            }
            catch(IOException e){
              e.printStackTrace();
              System.out.println("Error creating a blank .txt file");
            }
            break;


          case 5:
            try {
              System.out.println("Would you like to view the players in the .txt file or the dictionary? \nPlease enter 1 for .txt and 2 for dictionary.");
              int choice = numGet.nextInt();
              if(choice == 1){
                System.out.println("Please enter the name of the file which you wish to read:");
                String filenameRead = textGet.next();
                File file = new File(filenameRead);
                int i = 0;
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                int len = 0;
                while((line = br.readLine()) != null) {
                  System.out.println(line);}
              }else if (choice == 2){
                if (RugbyPlayersTable.size() == 0){
                  System.out.println("Please add some players to the dictionary");
                } else if(RugbyPlayersTable.size() >= 1){
                    for (Map.Entry<String , String> entry : RugbyPlayersTable.entrySet() ) {
                      System.out.println(RugbyPlayersTable.get(entry));}
                } else{
                    System.out.println("Please create the dictionary of rugby players!");
                  }
              } else{
                System.out.println("Error please enter a valid option!");
                continue;
              }
            }
            catch(Exception e){
              System.out.println("Unexpected error with case 5! Check code");
            }
            break;


          case 6:
            try {
              if(RugbyPlayersTable.size() > 0){
                System.out.println("Please enter the ID of the player that you want to delete: \n");
                String IDtoGet = textGet.next();
                for (Map.Entry<String , String> entry : RugbyPlayersTable.entrySet()){
                  if (entry.getKey() == IDtoGet){
                    RugbyPlayersTable.remove(IDtoGet);
                  }
                }
                System.out.println("Your new dictionary is:\n");
                for (Map.Entry<String , String> entry : RugbyPlayersTable.entrySet()){
                  System.out.println(RugbyPlayersTable.get(entry) + "\n");
                }
              } else {
                System.out.println("Please add players to the dictionary first.");
              }
            }
            catch(Exception e){
              System.out.println("Please create a dictionary of players first");
            }
            break;


          case 7:
            try {
              System.out.println("Please enter the first number in the range 0 to " + RugbyPlayersTable.size() + ":\n");
              int firstNumber = numGet.nextInt();
              System.out.println("Please enter the second number in the range: \n");
              int secondNumber = numGet.nextInt();
              if(secondNumber <= firstNumber){
                System.out.println("Please enter a valid second number: \n");
                secondNumber = numGet.nextInt();
              }else{
                continue;
              }
              if(firstNumber >= RugbyPlayersTable.size() || firstNumber < 0 || secondNumber > RugbyPlayersTable.size()){
                System.out.println("Number error please try again!");
              }else{
                for( int i = firstNumber; i <= secondNumber; i++ ){
                  System.out.println(RugbyPlayersTable.get(i));
                }
              }
            }
            catch(Exception e){
              System.out.println("Error with the range input please try again.");
            }
            break;


          case 8:
            try {
              open = false;
            }
            catch(Exception e){

            }
            break;


        }
    }


}
}
