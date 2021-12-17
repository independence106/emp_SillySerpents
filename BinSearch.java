import java.util.Arrays;

public class BinSearch{
 public static long guessTimer(int[] list, int target){
     // Determines time required (in ms) to locate target (using binary search)
     
     long initialTime = System.currentTimeMillis();
     int low = 0;
     int high = list.length - 1; 
     int mid = (low + high) / 2;
     
     while(true){
         if(list[mid] == target)      break; // terminate 
         if (list[mid] < target)      low = mid + 1; // update the lower bound 
         else if (list[mid] > target) high = mid - 1; // update the lower bound
         
        // Adjust mid         
         mid = (low + high) / 2;
    }
    long finalTime = System.currentTimeMillis();
      
    return finalTime - initialTime;   
 }
 
 
 
 public static String maxTimeGuesses(int numElements){
    // Determine the maximum amount of time required to find any certain element in a sorted list of a given amount of elements (w/ binary search)    
     
     // Create a list with numElements as many elements, and populate it with index = elements (ensures ascending order)
     int[] list = new int[numElements];
     for (int i = 0; i < numElements; i++)  list[i] = i;
     
    long guessTime;
    long maxTime = 0;
     
     for(int i = 0; i < numElements; i++){
         guessTime = guessTimer(list, i);
         if (guessTime > maxTime)    maxTime = guessTime; 
     }
     
     //  Return the maximum time to determine an element
     return numElements + ") " + maxTime + " ms.";
 }
 
 public static void main(String[] args) {
      
      System.out.println(maxTimeGuesses(10000000));
      
      
  
 }
}
