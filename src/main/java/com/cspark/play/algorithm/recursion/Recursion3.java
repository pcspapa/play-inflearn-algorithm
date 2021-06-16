package com.cspark.play.algorithm.recursion;

public class Recursion3 {

  public static int search(int[] data, int begin, int end, int target) {
    if (begin > end)
      return -1;
    else if (target == data[begin])
      return begin;
    else
      return search(data, begin + 1, end, target);
  }

  public static int searchReverse(int[] data, int begin, int end, int target) {
    if (begin > end)
      return -1;
    else if (target == data[end])
      return end;
    else
      return search(data, begin, end - 1, target);
  }

  public static int searchSimilarBinary(int[] data, int begin, int end, int target) {
    if (begin > end)
      return -1;
    else {
      int middle = (begin + end) / 2;

      if (target == data[middle])
        return middle;

      int index = search(data, begin, middle - 1, target);
      if (index != -1)
        return index;
      else
        return search(data, middle + 1, end, target);
    }
  }

  public static int findMax(int[] data, int begin, int end) {
    if (begin == end)
      return data[begin];
    else
      return Math.max(data[begin], findMax(data, begin + 1, end));
  }

  public static int findMaxSimilarBinary(int[] data, int begin, int end) {
    if (begin == end)
      return data[begin];
    else {
      int middle = (begin + end) / 2;
      int max1 = findMax(data, begin, middle);
      int max2 = findMax(data, middle + 1, end);
      return Math.max(max1, max2);
    }
  }

  public static int binarySearch(String[] data, int begin, int end, String target) {
    if (begin > end)
      return -1;
    else {
      int middle = (begin + end) / 2;
      int result = target.compareTo(data[middle]);

      if (result == 0)
        return middle;
      else if (result < 0)
        return binarySearch(data, middle + 1, end, target);
      else
        return binarySearch(data, begin, middle - 1, target);
    }
  }
}
