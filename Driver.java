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
      int size = 100000000;
      Comparable[] a = new Comparable[100000000];
      Comparable[] b = new Comparable[10000000];
      Comparable[] c = new Comparable[1000000];
      Comparable[] d = new Comparable[100000];
      Comparable[] f = new Comparable[10000];
      Comparable[] e = new Comparable[1000];
      Comparable[] g = new Comparable[100];
      Comparable[] h = new Comparable[10];


      for (int i = 0; i < a.length; i++) {
        a[i] = i;
      }
      for (int i = 0; i < b.length; i++) {
        b[i] = i;
      }
      for (int i = 0; i < c.length; i++) {
        c[i] = i;
      }
      for (int i = 0; i < d.length; i++) {
        d[i] = i;
      }
      
      //Searching randomly generated numbers (twice)
      for (int i = 0; i < 2; i++) {
        int randomNum = (int) (Math.random() * 100000000);
        System.out.println("Searching a " + size + " sized array.");
        driver.individualSearchTime(a, randomNum);
        System.out.println("Searching a " + size / 10 + " sized array.");
        driver.individualSearchTime(b, randomNum / 10);
        System.out.println("Searching a " + size / 100 + " sized array.");
        driver.individualSearchTime(c, randomNum / 100);
        System.out.println("Searching a " + size / 1000 + " sized array.");
        driver.individualSearchTime(d, randomNum / 10000);

      }

      //Searching Worst case scenarios (Last + First)
      driver.start = System.currentTimeMillis();
      BinSearch.binSearch(a, 100000000);
      driver.end = System.currentTimeMillis();

      System.out.println(driver.end - driver.start);
      //next finds the average time to search for every element - shall do random ones too with different sizes
      Comparable[] m = new Comparable[200000];
      for (int i = 0; i < m.length; i++) {
        m[i] = i;
      }
      driver.combinedSearchTime(m);
    }
  }