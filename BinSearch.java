public class BinSearch {
  public static int binSearch ( Comparable[] a, Comparable target ) {
  //uncomment exactly 1 of the 2 stmts below:

  return binSearchRec( a, target, 0, a.length-1 );
  //return binSearchRec( a, target, 0, a.length-1 );
}
  public static int binSearchRec( Comparable[] a, Comparable target,
                                  int lo, int hi )
  {
    int tPos = -1; //init return var to flag value -1

    int m = (lo + hi) / 2; //init mid pos var

    //exit case. If lo & hi have crossed, target not present
    if (lo > hi)
      return tPos; //-1

    // target found
    if ( a[m].compareTo(target) == 0 )
      tPos = m;
    // value at mid index higher than target
    else if ( a[m].compareTo(target) > 0 )
      tPos = binSearchRec( a, target, 0, m-1 );
    // value at mid index lower than target
    else if ( a[m].compareTo(target) < 0 )
      tPos = binSearchRec( a, target, m+1, hi );

    return tPos;
  }

}
