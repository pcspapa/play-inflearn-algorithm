package com.cspark.play.algorithm.sort;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SortsTest {

  private int[] data;

  @BeforeEach
  void setUp() {
    data = new int[]{5, 1, 4, 2, 6, 3};
  }

  @Test
  void selection() {
    Sorts.selection(data, 6);

    assertThat(data).isEqualTo(new int[]{1, 2, 3, 4, 5, 6});
  }

  @Test
  void bubble() {
    Sorts.bubble(data, 6);

    assertThat(data).isEqualTo(new int[]{1, 2, 3, 4, 5, 6});
  }

  @Test
  void insertion() {
    Sorts.insertion(data, 6);

    assertThat(data).isEqualTo(new int[]{1, 2, 3, 4, 5, 6});
  }

  @Test
  void mergeSort() {
    Sorts.mergeSort(data, 0, 5);

    assertThat(data).isEqualTo(new int[]{1, 2, 3, 4, 5, 6});
  }

  @Test
  void quickSort() {
    Sorts.quickSort(data, 0, 5);

    assertThat(data).isEqualTo(new int[]{1, 2, 3, 4, 5, 6});
  }

  @Test
  void heap() {
    Sorts.heap(data, 6);

    assertThat(data).isEqualTo(new int[]{1, 2, 3, 4, 5, 6});
  }

  @Test
  void countingSort() {
    int[] scores = {2, 5, 3, 0, 2, 3, 0, 3};
    int[] bucket = new int[8];

    Sorts.countingSort(scores, bucket, 6);

    assertThat(bucket).isEqualTo(new int[]{0, 0, 2, 2, 3, 3, 3, 5});
  }
}