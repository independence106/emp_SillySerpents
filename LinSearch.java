import java.util.Arrays;

public class LinSearch{
 public static long guessTimer(int[] list, int target){
     // Determines time required (in ms) to locate target (using linear search)
     
     long initialTime = System.currentTimeMillis();
     for(int i = 0; i < list.length; i++){
         if(list[i] == target) break;
     }
     
    long finalTime = System.currentTimeMillis();
    
    return (finalTime - initialTime);   
 }
 
 
 
 public static String maxTimeGuesses(int numElements){
    // Determine the maximum amount of time required to find any certain element in a sorted list of a given amount of elements (w/ linear search)    
     
     // Create a list with numElements as many elements, and populate it with index = elements to ensure ascending order 
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
      
      System.out.println(maxTimeGuesses(200000));
      
      
  
 }
}
