package com.cspark.play.algorithm.recursion;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Recursion3Test {

  @Test
  @DisplayName("순차 탐색")
  void search() {
    assertThat(Recursion3.search(new int[]{2, 1, 3}, 0, 2, 1)).isEqualTo(1);
    assertThat(Recursion3.search(new int[]{3, 2, 1}, 0, 2, 1)).isEqualTo(2);
  }

  @Test
  @DisplayName("순차 탐색 - Reverse")
  void searchReverse() {
    assertThat(Recursion3.searchReverse(new int[]{2, 1, 3}, 0, 2, 1)).isEqualTo(1);
    assertThat(Recursion3.searchReverse(new int[]{3, 2, 1}, 0, 2, 1)).isEqualTo(2);
  }

  @Test
  @DisplayName("순차 탐색 - 유사한 바이너리")
  void searchSimilarToBinary() {
    assertThat(Recursion3.searchSimilarBinary(new int[]{2, 1, 3}, 0, 2, 1)).isEqualTo(1);
    assertThat(Recursion3.searchSimilarBinary(new int[]{3, 2, 1}, 0, 2, 1)).isEqualTo(2);
  }

  @Test
  @DisplayName("최대값 찾기")
  void findMax() {
    assertThat(Recursion3.findMax(new int[]{2, 1, 3}, 0, 2)).isEqualTo(3);
    assertThat(Recursion3.findMax(new int[]{6, 9, 1}, 0, 2)).isEqualTo(9);
  }

  @Test
  @DisplayName("최대값 찾기 - 유사한 바이너리")
  void findMaxSimilarBinary() {
    assertThat(Recursion3.findMaxSimilarBinary(new int[]{2, 1, 3}, 0, 2)).isEqualTo(3);
    assertThat(Recursion3.findMaxSimilarBinary(new int[]{6, 9, 1}, 0, 2)).isEqualTo(9);
  }

  @Test
  @DisplayName("Binary Search")
  void binarySearch() {
    assertThat(Recursion3.binarySearch(new String[]{"B", "A", "C"}, 0, 2, "A")).isEqualTo(1);
    assertThat(Recursion3.binarySearch(new String[]{"C", "B", "A"}, 0, 2, "A")).isEqualTo(2);
  }
}
