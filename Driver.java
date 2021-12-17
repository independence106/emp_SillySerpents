
public class Driver {
  public static void main(String[] args) {
    Comparable[] a = new Comparable[100000000];
    for (int i = 0; i < a.length; i++) {
      a[i] = i * 2;
    }
    long x = System.currentTimeMillis();
    LinSearch.linSearch(a, 6868686);
    long z = System.currentTimeMillis();
    System.out.println("Done, took: " + (z - x));
  }
}
