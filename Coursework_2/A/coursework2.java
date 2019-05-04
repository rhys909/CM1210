import java.util.*;
import java.io.*;

public class coursework2{
  public static void main(String[] args){
    ArrayList<String> GPT2Array = new ArrayList<String>(removeStopwords("GPT2.txt","stopwords.txt"));
    System.out.println(insertionSort(GPT2Array));
  }

  static ArrayList<String> removeStopwords(String GPT2, String Stopwords){

      ArrayList<String> StopwordsArray = new ArrayList<String>();
      ArrayList<String> GPT2Array = new ArrayList<String>();

      try {
        Scanner stopFile = new Scanner(new File(Stopwords));
        Scanner GPT2File = new Scanner(new File(GPT2));
        while(stopFile.hasNext()){
          StopwordsArray.add(stopFile.next());
        }
        stopFile.close();
        while(GPT2File.hasNext()){
          GPT2Array.add(GPT2File.next());
        }
        GPT2File.close();
      }catch( IOException e ){
        System.out.println("File Error!");
      }

      GPT2Array.removeAll(StopwordsArray);
      return GPT2Array;
  }

  static ArrayList<String> insertionSort(ArrayList<String> GPT2Array){
    int i, j, count;
    String key, temp;
    count = 0;

    for (i=1; i< GPT2Array.size(); i++){
      key = GPT2Array.get(i);
      j = i - 1;

      while( j >= 0 ){
        if (key.compareTo(GPT2Array.get(j)) > 0) {
          break;
        }
        temp = GPT2Array.get(j);
        GPT2Array.set(j, GPT2Array.get(j+1));
        GPT2Array.set(j + 1, temp);
        j--;
      }
      count += 1;
      if (count % 100 == 0){
        System.out.println("Time taken to sort " + count + " words was " );
      }

    }
    System.out.println("Words Sorted = " + count);
    return GPT2Array;
  }

//  static ArrayList<String> mergeSort(ArrayList<String> GPT2Array)
}
