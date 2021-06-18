package com.cspark.play.algorithm.sort;

public class Sorts {

  public static void selection(int[] data, int n) {
    for (int i = n; i > 0; i--) {
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

  public static void bubble(int[] data, int n) {
    for (int last = n; last > 0; last--) {
      for (int j = 0; j < last; j++) {
        if (data[j] > data[j + 1]) {
          swap(data, j, j + 1);
        }
      }
    }
  }

  private static void swap(int[] data, int i, int j) {
    int tmp = data[i];
    data[i] = data[j];
    data[j] = tmp;
  }

  public static void insertion(int[] data, int n) {
    int i, j, tmp;
    for (i = 1; i <= n; i++) {
      tmp = data[i];

      for (j = i - 1; j >= 0 && data[j] > tmp; j--) {
        data[j + 1] = data[j];
      }
      data[j + 1] = tmp;
    }
  }

}
