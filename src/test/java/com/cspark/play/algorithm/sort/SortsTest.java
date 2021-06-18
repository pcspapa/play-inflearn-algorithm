package com.cspark.play.algorithm.sort;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SortsTest {

  private int[] data;

  @BeforeEach
  void setUp() {
    data = new int[]{5, 1, 4, 2, 3};
  }

  @Test
  void selection() {
    Sorts.selection(data, 5);

    assertThat(data).isEqualTo(new int[]{1, 2, 3, 4, 5});
  }

  @Test
  void bubble() {
    Sorts.bubble(data, 5);

    assertThat(data).isEqualTo(new int[]{1, 2, 3, 4, 5});
  }

  @Test
  void insertion() {
    Sorts.insertion(data, 5);

    assertThat(data).isEqualTo(new int[]{1, 2, 3, 4, 5});
  }

  @Test
  void mergeSort() {
    Sorts.mergeSort(data, 0, 4);

    assertThat(data).isEqualTo(new int[]{1, 2, 3, 4, 5});
  }

}