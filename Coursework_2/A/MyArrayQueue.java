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

  // data members
  int front;          // one counterclockwise from first element
  int back;           // position of back element of queue
  Object [] queue;    // element array

  // constructors
  /** create a queue with the given initial capacity */
  public MyArrayQueue(int initialCapacity)
  {
     if (initialCapacity < 1)
        throw new IllegalArgumentException
              ("initialCapacity must be >= 1");
     queue = new Object [initialCapacity + 1];

  }

  /** create a queue with initial capacity 5 */
  public MyArrayQueue()
  {// use default capacity of 5
     this(5);
  }

  // methods
  /** @return true iff queue is empty */
  public boolean isEmpty()
     {return front == back;}


  /** @return front element of queue
    * @return null if queue is empty */
  public Object getFrontElement()
  {
     if (isEmpty())
        return null;
     else
        return queue[(front + 1) % queue.length];
  }

  /** @return back element of queue
    * @return null if the queue is empty */
  public Object getBackElement()
  {
     if (isEmpty())
        return null;
     else
        return queue[back];
  }

  /** insert theElement at the back of the queue */
  public void enqueue(Object theElement)
  {
   boolean isFull = true;

   for(int i =0; i < queue.length; i++){
     if (queue[i] == null){
       isFull = false;
       break;
     }
   }

   if ((queue[queue.length - 1] != null) && !isFull){
     for (int i = 0; i < queue.length; i++){
   if (queue[i] != null){
      queue[i - 1] = queue[i];
   }
  }
  back = (back - 1);
  front = (front - 1);
  }

  if(isFull){

    Object newQueue = new Object[queue.length * 2];
    newQueue[back] = theElement;

    for (int i = 0; i < queue.length; i++){
      newQueue[i] = queue[i];
    }

    queue = newQueue;

    System.out.println("The new queue is:\n");
    for (Object i:queue){
      System.out.println(i);
    }

  } else {

    queue[back] = theElement;
    System.out.println("The new queue is:\n");
    for (Object i : queue){
      System.out.println(i);
    }

  }

  back++;

  }

  /** remove an element from the front of the queue
    * @return removed element */
  public Object dequeue()
  {
    try {
      if (isEmpty()){
        return null;
      } else {

        Object toRemove = queue[front];
        queue[front] = null;
        front++;
        System.out.println(toRemove + " has beem removed from the queue!");

        return toRemove;

      }
    } catch( Exception e ){
      System.out.println("Error in dequeue!");
    }
  }


  public static void main(String[] args){

    boolean open = true;

    while(open){
      Scanner numGet = new Scanner(System.in);
      Scanner textGet = new Scanner(System.in);

      System.out.println("\n  Please select what you wish to do from the below disk: ");
      System.out.println("1) Insertion Sort the GPT2 file");
      System.out.println("2) Merge Sort the GPT2 File");
      System.out.println("3) Create a queue");
      System.out.println("4) Enqueue");
      System.out.println("5) Dequeue");
      System.out.println("6) Clear the queue");
      System.out.println("7) Exit system");
      System.out.println("\n  Please enter your choice:");

      int usrInput = numGet.nextInt();

      ArrayList<String> GPT2Array = new ArrayList<String>(removeStopwords("GPT2.txt","stopwords.txt"));

      switch (usrInput) {

        case 1:

          try {

            insertionSort(GPT2Array);

          } catch ( Exception e ){

            System.out.println("Insertion sort error!");

          }

        case 2:

          try{

            mergeSort(GPT2Array);

          }catch ( Exception e ){

            System.out.println("Merge sort error!");

          }

        case 3:

          try{

            System.out.println("Please enter the size of the queue you wish to create: ");

            int queueSize = in.nextInt();

            createdQueue = new MyArrayQueue(queueSize - 1);

            return createdQueue;

          } catch ( Exception e ) {

            System.out.println("Queue creation error!");

          }

        case 4:

          try{

            System.out.println("Item to add to the queue: \n");

            String newItem = textGet.nextLine();

            createdQueue.enqueue(newItem);

          }catch ( Exception e ) {

            System.out.println("Enqueue error!");

          }

        case 5:

          try{

            if (createdQueue.isEmpty()){

              System.out.println("Queue is empty! \nPlease create a queue first!");

            }
            else {

              createdQueue.dequeue();

            }

          } catch ( Exception e ){

            System.out.println("Dequeue error!");

          }

        case 6:

          try{

            while ( createdQueue.length != 0 ){
              createdQueue.dequeue();
            }

          } catch ( Exception e ){

            System.out.println("Error clearing the queue!");

          }

        case 7:

          try{

            open = false;

          } catch ( Exception e ) {

            System.out.println("Error exiting the system!");

          }

        default:

          System.out.println("Please enter a valid option!");
          break;

      }
    }
  }

}
