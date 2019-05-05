import java.util.*;
import java.io.*;

// Rhys Connor C1821631

public class MyArrayQueue{

  static int mergeSortCount = 0;

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

    long startTime = System.currentTimeMillis();
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

        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;
        System.out.println("Time taken to sort " + count + " words was " + timeTaken + " milliseconds.");

      }

    }

    long endTime = System.currentTimeMillis();
    long timeTaken = endTime - startTime;
    System.out.println("Words Sorted = " + count + "\nTime Taken: " + timeTaken + " milliseconds.");
    return GPT2Array;

  }

  static ArrayList<String> mergeSort(ArrayList<String> GPT2Array) {

    long startTime = System.currentTimeMillis();

    ArrayList<String> startArray = new ArrayList<String>();
    ArrayList<String> endArray = new ArrayList<String>();

    int Start, midIndex, End, count;
    Start = count = 0;
    End = GPT2Array.size();

    if(GPT2Array.size() <= 1){
      return GPT2Array;
    } else {
      midIndex = (Start + End) / 2;
      for (int i=Start; i < midIndex; i++){
        startArray.add(GPT2Array.get(i));
      }
      for (int i=midIndex; i < End; i++){
        endArray.add(GPT2Array.get(i));
      }

      mergeSort(startArray);
      mergeSort(endArray);

      merge(GPT2Array, startArray, endArray);

    }

    long endTime = System.currentTimeMillis();
    long timeTaken = endTime - startTime;
    return GPT2Array;

  }

  static ArrayList<String> merge(ArrayList<String> GPT2Array, ArrayList<String> startArray, ArrayList<String> endArray){

    int startPointer, endPointer, i;
    startPointer = endPointer = i = 0;
    while(startPointer < startArray.size() || endPointer < endArray.size()){

      if (startPointer < startArray.size() && endPointer < endArray.size()){

        if (startArray.get(startPointer).compareTo(endArray.get(endPointer)) < 0){

          GPT2Array.set(i, startArray.get(startPointer));
          startPointer++;
          i++;

        } else {

          GPT2Array.set(i, endArray.get(endPointer));
          endPointer++;
          i++;

        }

    } else if (startPointer < startArray.size()) {

      GPT2Array.set(i, startArray.get(startPointer));
      startPointer++;
      i++;

    } else if (endPointer < endArray.size()) {

      GPT2Array.set(i, endArray.get(endPointer));
      endPointer++;
      i++;

    }
  }
  return GPT2Array;
  }

  public static void main(String[] args){

    ArrayList<String> GPT2Array = new ArrayList<String>(removeStopwords("GPT2.txt","stopwords.txt"));
    System.out.println(insertionSort(GPT2Array));
    System.out.println(mergeSort(GPT2Array));

  }

}
