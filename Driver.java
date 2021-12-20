import java.util.ArrayList;

public class Driver {
    long start = System.currentTimeMillis();
    long end = System.currentTimeMillis();

    //computes time taken to search all values
    public void combinedSearchTime(Comparable[] b) {
        long timesLin = 0;
        start = System.currentTimeMillis();
      for (int i = 0; i < b.length; i++) {
          LinSearch.linSearch(b, i);
      }
      end = System.currentTimeMillis();
      timesLin = end - start;

      System.out.println("Time to find all values: " + timesLin);
      long timesBin = 0;

      start = System.currentTimeMillis();
      for (int i = 0; i < b.length; i++) {
        BinSearch.binSearch(b, i);
      }
    end = System.currentTimeMillis();
    timesBin = end - start;
    System.out.println("Time to find all values: " + timesBin);
    }

    //compares the search time for lin and bin given a value
    //1000 Trials per call
    public void individualSearchTime(Comparable[] a, int target) {
        start = System.currentTimeMillis();
          for (int i = 0; i < 1000; i++) {
            LinSearch.linSearch(a, target);
          }


            end = System.currentTimeMillis();
            System.out.println("Done, Lin took: " + (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < 1000; i++) {
              BinSearch.binSearch(a, target);
            }
            end = System.currentTimeMillis();
            System.out.println("Done, Bin took: " + (end - start));


    }




    public void maxSearchTime(Comparable[] a) {

    }

    public static void main(String[] args) {
      Driver driver = new Driver();
      int size = 100000000;
      Comparable[] a = new Comparable[80000000];
      Comparable[] b = new Comparable[10000000];
      Comparable[] c = new Comparable[1000000];
      Comparable[] d = new Comparable[100000];
      Comparable[] f = new Comparable[10000];
      Comparable[] e = new Comparable[1000];
      Comparable[] g = new Comparable[100];
      Comparable[] h = new Comparable[10];

      System.out.println("initing arrays 1/8");
      for (int i = 0; i < a.length; i++) {
        a[i] = i;
      }
      System.out.println("initing arrays 2/8");
      for (int i = 0; i < b.length; i++) {
        b[i] = i;
      }
      System.out.println("initing arrays 3/8");
      for (int i = 0; i < c.length; i++) {
        c[i] = i;
      }
      System.out.println("initing arrays 4/8");
      for (int i = 0; i < d.length; i++) {
        d[i] = i;
      }
      System.out.println("initing arrays 5/8");
      for (int i = 0; i < e.length; i++) {
        e[i] = i;
      }
      System.out.println("initing arrays 6/8");
      for (int i = 0; i < f.length; i++) {
        f[i] = i;
      }
      System.out.println("initing arrays 7/8");
      for (int i = 0; i < g.length; i++) {
        g[i] = i;
      }
      System.out.println("initing arrays 8/8");
      for (int i = 0; i < h.length; i++) {
        h[i] = i;
      }




        int randomNum = (int) (Math.random() * 80000000);
          System.out.println("Searching a " + size + " sized array.");
          driver.individualSearchTime(b, randomNum);
        System.out.println("Searching a " + size / 10 + " sized array.");
        driver.individualSearchTime(b, randomNum / 10);
        System.out.println("Searching a " + size / 100 + " sized array.");
        driver.individualSearchTime(c, randomNum / 100);
        System.out.println("Searching a " + size / 1000 + " sized array.");
        driver.individualSearchTime(d, randomNum / 10000);



      //Searching Worst case scenarios (Last + First)
      System.out.println("Searching Worst + best case scenarios");
      driver.start = System.currentTimeMillis();
      BinSearch.binSearch(a, 100000000);
      driver.end = System.currentTimeMillis();

      System.out.println(driver.end - driver.start);
      //next finds the average time to search for every element - shall do random ones too with different sizes
      Comparable[] m = new Comparable[200000];
      for (int i = 0; i < m.length; i++) {
        m[i] = i;
      }
      System.out.println("Searching a " + m.length + " element array");
      driver.combinedSearchTime(m);
      System.out.println("Searching a 10000 element array");
      driver.combinedSearchTime(f);
      System.out.println("Searching a 1000 element array");
      driver.combinedSearchTime(e);
      System.out.println("Searching a 100 element array");
      driver.combinedSearchTime(g);
      System.out.println("Searching a 10 element array");
      driver.combinedSearchTime(h);
    }


  }
