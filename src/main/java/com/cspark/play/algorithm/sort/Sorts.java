package com.cspark.play.algorithm.sort;

public class Sorts {

  public static void selection(int[] data, int n) {
    for (int i = n - 1; i > 0; i--) {
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
    for (int last = n - 1; last > 0; last--) {
      for (int j = 0; j < last; j++) {
        if (data[j] > data[j + 1]) {
          swap(data, j, j + 1);
        }
      }
    }
  }

  public static void insertion(int[] data, int n) {
    int i, j, tmp;
    for (i = 1; i < n; i++) {
      tmp = data[i];

      for (j = i - 1; j >= 0 && data[j] > tmp; j--) {
        data[j + 1] = data[j];
      }
      data[j + 1] = tmp;
    }
  }

  public static void mergeSort(int[] data, int p, int r) {
    int q;
    if (p < r) {
      q = (p + r) / 2;
      mergeSort(data, p, q);
      mergeSort(data, q + 1, r);
      merge(data, p, q, r);
    }
  }

  private static void merge(int[] data, int p, int q, int r) {
    int i = p, j = q + 1, k = p;
    int[] tmp = new int[data.length];

    while (i <= q && j <= r) {
      if (data[i] <= data[j])
        tmp[k++] = data[i++];
      else
        tmp[k++] = data[j++];
    }

    while (i <= q) {
      tmp[k++] = data[i++];
    }

    while (j <= r) {
      tmp[k++] = data[j++];
    }

    for (int l = p; l <= r; l++)
      data[l] = tmp[l];
  }

  public static void quickSort(int[] data, int p, int r) {
    if (p < r) {
      int q = partition(data, p, r);
      quickSort(data, p, q - 1);
      quickSort(data, q + 1, r);
    }
  }

  private static int partition(int[] data, int p, int r) {
    int i = p - 1, j = p, pivot = data[r];

    while (j < r) {
      if (data[j] > pivot)
        j++;
      else {
        i++;
        swap(data, i, j);
        j++;
      }
    }
    swap(data, i + 1, r);

    return i + 1;
  }

  private static void swap(int[] data, int i, int j) {
    int tmp = data[i];
    data[i] = data[j];
    data[j] = tmp;
  }
}
