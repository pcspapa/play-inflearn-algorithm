package com.cspark.play.algorithm.sort;

public class Sorts {

  public static void selection(int[] data) {
    for (int i = data.length - 1; i > 0; i--) {
      int largest = i;

      int k = i - 1;
      for (int j = k; j >= 0; j--) {
        if (data[largest] < data[j]) {
          largest = j;
        }
      }

      if (largest != i)
        swap(data, largest, i);
    }
  }

  private static void swap(int[] data, int largest, int i) {
    int tmp = data[i];
    data[i] = data[largest];
    data[largest] = tmp;
  }

}
