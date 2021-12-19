import java.util.ArrayList;

public class Driver {
    long start = System.currentTimeMillis();
    long end = System.currentTimeMillis();

    //computes time taken to search all values
    public void combinedSearchTime(Comparable[] b) {
        long timesLin = 0;
      for (int i = 0; i < b.length; i++) {
          start = System.currentTimeMillis();
          LinSearch.linSearch(b, i);
          end = System.currentTimeMillis();
          timesLin += end - start;
      }
      System.out.println("Time to find all values: " + timesLin);
      long timesBin = 0;
      for (int i = 0; i < b.length; i++) {
        start = System.currentTimeMillis();
        BinSearch.binSearch(b, i);
        end = System.currentTimeMillis();
        timesBin += end - start;
    }
    System.out.println("Time to find all values: " + timesBin);
    }

    //compares the search time for lin and bin given a value
    public void individualSearchTime(Comparable[] a, int target) {
        
        
            start = System.currentTimeMillis();
            LinSearch.linSearch(a, target);
            end = System.currentTimeMillis();
            System.out.println("Done, Lin took: " + (end - start));
            
            start = System.currentTimeMillis();
            BinSearch.binSearch(a, target);
            end = System.currentTimeMillis();
            System.out.println("Done, Bin took: " + (end - start));
            
          
    }

    public void averageSearchTime(Comparable[] a) {

    }

    public void medianSearchTime(Comparable[] a) {

    }

    public void meanDeviation(Comparable[] a) {

    }

    
    public void maxSearchTime(Comparable[] a) {

    }
    
    public static void main(String[] args) {
        Driver driver = new Driver();
      Comparable[] a = new Comparable[100000000];
      for (int i = 0; i < a.length; i++) {
        a[i] = i;
      }
      //Searching randomly generated numbers (twice)
   
      //next finds the average time to search for every element - shall do random ones too with different sizes
      Comparable[] b = new Comparable[200000];
      for (int i = 0; i < b.length; i++) {
        b[i] = i;
      }
      driver.combinedSearchTime(b);
    }
  }