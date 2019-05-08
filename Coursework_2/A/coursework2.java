import java.util.*;
import java.io.*;

// Rhys Connor C1821631

public class coursework2{

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

    if (mergeSortCount % 100 == 0){
      System.out.println("The time taken to sort " + mergeSortCount + " words was " + timeTaken + " milliseconds.");
    }

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

    mergeSortCount++;

  }

  return GPT2Array;

  }

  public static void main(String[] args){

    boolean open = true;

    while(open){
      Scanner numGet = new Scanner(System.in);
      Scanner textGet = new Scanner(System.in);

      System.out.println("\n  Please select what you wish to do from the below disk: ");
      System.out.println("1) Insertion Sort the GPT2 file");
      System.out.println("2) Merge Sort the GPT2 File");
      System.out.println("3) Exit system");
      System.out.println("\n  Please enter your choice:");

      int usrInput = numGet.nextInt();

      ArrayList<String> GPT2Array = new ArrayList<String>(removeStopwords("GPT2.txt","stopwords.txt"));

        if (usrInput == 1){
          try {

            insertionSort(GPT2Array);

          } catch ( Exception e ){

            System.out.println("Insertion sort error!");

          }
        }
        else if (usrInput == 2){
          try{

            mergeSort(GPT2Array);

          }catch ( Exception e ){

            System.out.println("Merge sort error!");

          }
        }


      else if (usrInput == 3){
        try{

          open = false;

        } catch ( Exception e ) {

          System.out.println("Error exiting the system!");

        }

      }

      else {
        System.out.println("Please enter a valid input!");
      }

    }
  }

}
