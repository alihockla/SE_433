package edu.depaul.se433;

/**
 * SE 433 JUNIT Example.
 *
 * Performs the standard binary search using two comparisons per level.
 *
 * @author Tomislav S. Mitic
 */
public class BinarySearch {
  public static final int NOT_FOUND = -1;

  /**
   * Performs the standard binary search
   * using two comparisons per level.
   * @return index where item is found, or NOT_FOUND.
   */
  public static <T extends Comparable<T>> int binarySearch(T[] a,
          T x) {
    int low = 0;
    int high = a.length - 1;
    int mid;

    while(low <= high) {
      mid = (low + high) / 2;

      if(a[mid].compareTo(x) < 0) {
        low = mid + 1;
      } else if(a[mid].compareTo(x) > 0 ) {
        high = mid - 1;
      } else {
        return mid;
      }
    }
    return NOT_FOUND;     // NOT_FOUND = -1
  }

  public static <T extends Comparable<T>> int binarySearch2(
          T[] a, T x) {
    if (x == null || a == null || a.length == 0) {
      throw new IllegalArgumentException();
    }

    int low = 0;
    int high = a.length - 1;
    int mid;

    while(low <= high) {
      mid = (low + high) / 2;

      if(a[mid].compareTo(x) < 0) {
        low = mid + 1;
      } else if(a[mid].compareTo(x) > 0) {
        high = mid - 1;
      } else {
        return mid;
      }
    }

    return NOT_FOUND;     // NOT_FOUND = -1
  }

  // Test program
  public static void main(String [] args) {
    int SIZE = 8;
    Integer[] a = new Integer [SIZE];
    for(int i = 0; i < SIZE; i++) {
      a[i] = new Integer(i * 2);
    }

    for(int i = 0; i < SIZE * 2; i++) {
      System.out.println("Found " + i + " at " +
        binarySearch2(a, new Integer(i)));
    }
  }
}
