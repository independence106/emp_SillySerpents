import java.util.ArrayList;

public class SearchDriver {
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

    public void individualSearchTime(Comparable[] a, int target, int trials) {
        start = System.currentTimeMillis();
          for (int i = 0; i < trials; i++) {
            LinSearch.linSearch(a, target);
          }


            end = System.currentTimeMillis();
            System.out.println("Done, Lin took: " + (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < trials; i++) {
              BinSearch.binSearch(a, target);
            }
            end = System.currentTimeMillis();
            System.out.println("Done, Bin took: " + (end - start));


    }

    public int indexWhereLinFaster(Comparable[] a, int target, int trials) {
        long linSearch = 0;
        long binSearch = 0;
        start = System.currentTimeMillis();
        for (int i = 0; i < trials; i++) {
          LinSearch.linSearch(a, target);
        }
        end = System.currentTimeMillis();
        linSearch = end - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < trials; i++) {
          BinSearch.binSearch(a, target);
        }
        end = System.currentTimeMillis();
        binSearch = end - start;
        if (binSearch > linSearch) {
          return BinSearch.binSearch(a, target);
        }
        return -2;

    }


    public static void main(String[] args) {
      SearchDriver driver = new SearchDriver();
      // int size = 100000000;
      // ArrayList<Comparable[]> e  = new ArrayList<Comparable[]>();
      Comparable[] a = new Comparable[80000000];
      Comparable[] b = new Comparable[10000000];
      Comparable[] c = new Comparable[1000000];
      Comparable[] d = new Comparable[100000];
      Comparable[] e = new Comparable[10000];
      Comparable[] f = new Comparable[1000];
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




        // int randomNum = (int) (Math.random() * 10000000);
           /* System.out.println("Searching a " + size + " sized array.");
          driver.individualSearchTime(b, randomNum);
        System.out.println("Searching a " + size / 10 + " sized array.");
        driver.individualSearchTime(b, randomNum / 10);
        System.out.println("Searching a " + size / 100 + " sized array.");
        driver.individualSearchTime(c, randomNum / 100);
        System.out.println("Searching a " + size / 1000 + " sized array.");
        driver.individualSearchTime(d, randomNum / 10000);
        */
        
        // Time required to find a a randomly selected element (1000 trials) (Do this 10 times)
        for (int i = 0; i < 15; i++) {
          System.out.println("Searching a " + b.length + " sized array, 1000 times");
            driver.individualSearchTime(b, (int) (Math.random() * b.length), 1000 );
          
          System.out.println("Searching a " + c.length + " sized array, 1000 times");
          driver.individualSearchTime(c, (int) (Math.random() * c.length), 1000 );
          
          System.out.println("Searching a " + d.length + " sized array, 1000 times");
          driver.individualSearchTime(d, (int) (Math.random() * d.length), 1000 );
          
          System.out.println("Searching a " + e.length + " sized array, 1000 times");
          driver.individualSearchTime(e, (int) (Math.random() * e.length) , 1000);
        }


      //Searching worst case scenarios (Last + First)
      System.out.println("Searching last elements (x100):");
      System.out.println("Searching in a");
      driver.individualSearchTime(a, 80000000, 100);
      System.out.println("Searching in b");
      driver.individualSearchTime(b, 10000000, 100);
      System.out.println("Searching in c");
      driver.individualSearchTime(c, 1000000, 100);
      System.out.println("Searching in d");
      driver.individualSearchTime(d, 100000, 100);
      System.out.println("Searching in e");
      driver.individualSearchTime(e, 10000, 100);
      System.out.println("Searching in f");
      driver.individualSearchTime(f, 1000, 100);
      System.out.println("Searching in g");
      driver.individualSearchTime(g, 100, 100);
      System.out.println("Searching in h");
      driver.individualSearchTime(h, 10, 100);
      

      //Searching in the middleee
      System.out.println("Searching middle elements (x100):");
      System.out.println("Searching in a");
      driver.individualSearchTime(a, 40000000, 100);
      System.out.println("Searching in b");
      driver.individualSearchTime(b, 5000000, 100);
      System.out.println("Searching in c");
      driver.individualSearchTime(c, 500000, 100);
      System.out.println("Searching in d");
      driver.individualSearchTime(d, 50000, 100);
      System.out.println("Searching in e");
      driver.individualSearchTime(e, 5000, 100);
      System.out.println("Searching in f");
      driver.individualSearchTime(f, 500, 100);
      System.out.println("Searching in g");
      driver.individualSearchTime(g, 50, 100);
      System.out.println("Searching in h");
      driver.individualSearchTime(h, 5, 100);

      //Checking if lin search ever faster than bin search (small arrs)
      //NOT IMPORTANT JUST INTERESTING
      System.out.println("Seaching for favorable elements that will make lin faster than bin");
      System.out.println("Searching in g (100 length) 1000000 times");
      driver.individualSearchTime(g, 1, 1000000);
      System.out.println("Searching in g (10 length) 1000000 times");
      driver.individualSearchTime(h, 1, 1000000);


      System.out.println(driver.end - driver.start);
      // //next finds the average time to search for every element - shall do random ones too with different sizes
      Comparable[] m = new Comparable[200000];
      for (int i = 0; i < m.length; i++) {
        m[i] = i;
      }

      System.out.println("Combined Search Times: (Time to search EVERY element in an array");

      System.out.println("Searching a " + b.length + " element array");
      driver.combinedSearchTime(b);
        
      System.out.println("Searching a " + m.length + " element array");
      driver.combinedSearchTime(m);
        
      System.out.println("Searching a " + d.length + " element array");
      driver.combinedSearchTime(d);
        
      System.out.println("Searching a " + e.length + " element array");
      driver.combinedSearchTime(e);

      System.out.println("Searching a " + f.length + " element array");
      driver.combinedSearchTime(f);
        
      System.out.println("Searching a " + g.length + " element array");
      driver.combinedSearchTime(g);
        
      System.out.println("Searching a " + h.length + " element array");
      
      driver.combinedSearchTime(h);


      // TAKES A LONG TIME TO RUN!!!
      System.out.println("Searching a 200000 element array to find where lin > bin; WILL TAKE A LONG TIME, TERMINATE PROGRAM HERE I ADVISE YOU");
      for (int i = 0; i < m.length; i++) {
        int o = driver.indexWhereLinFaster(m, i, 100);
        if (o != -2) {
          System.out.println("Index where lin faster than bin: " + o);
        }
      }
    }

    //Last part: Searching through an entire array and checking if there are any points where bin search faster than lin search

    
   

  }
