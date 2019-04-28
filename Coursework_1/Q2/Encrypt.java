import java.io.*;
public class Encrypt{
public static void main(String [] args){
  if (args.length != 1){
    System.err.println("One argument expected!");
    System.exit(1);
  }
  // TODO: Complete the program

  try{

    String Name = args[0];
    FileReader Read = new FileReader(Name);
    BufferedReader br = new BufferedReader(Read);

    String line;

      while ((line = br.readLine()) != null) {
        for (char c: line.toCharArray()) {

          if (Character.isLowerCase(c)) {
            int i = (int) c;

            if (i == 97) {
              i = 122;
            } else {
              i -= 1;
            }

            c = (char) i;
          }

          System.out.println(c);
        }

        System.out.println();
      }

    }

    catch(FileNotFoundException e){
      System.out.println("Error finding the top secret file :/");
    }

    catch(IOException e) {
        System.out.println("Error reading the top secret file!");
  }

}}
