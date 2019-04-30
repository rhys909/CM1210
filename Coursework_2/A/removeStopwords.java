import java.util.*;
import java.io.*;

public class removeStopwords{
  public static void main (String[] args ){

    ArrayList<String> StopwordsArray = new ArrayList<String>();
    ArrayList<String> GPT2Array = new ArrayList<String>();
    String stopwordsFile = "stopwords.txt";
    String GPT2Filename = "GPT2.txt";

    try {
      Scanner stopFile = new Scanner(new File(stopwordsFile));
      Scanner GPT2File = new Scanner(new File(GPT2Filename));
      while(stopFile.hasNext()){
        StopwordsArray.add(stopFile.next());
      }
      stopFile.close();
      while(GPT2File.hasNext()){
        GPT2Array.add(GPT2File.next());
      }
      GPT2File.close();
    } catch( IOException e ){
      System.out.println("File Error!");
    }

    GPT2Array.removeAll(StopwordsArray);
    System.out.println(GPT2Array);
  }
}
