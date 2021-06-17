package com.cspark.play.algorithm.recursion;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class NQueensTest {

  @Test
  void putQueen() {
    NQueens nQueens = new NQueens(8);
    assertThat(nQueens.queens(0)).isTrue();
  }

}