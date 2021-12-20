import java.util.Arrays;

public class LinSearch{
      public static int linSearch ( Comparable[] a, int target )
  {
    int tPos = -1;
    int i = 0;

    while ( i < a.length ) {
      if ( a[i].equals(target) ) {
        tPos = i;
        break;
      }
      i++;
    }
    return tPos;
  }
}
