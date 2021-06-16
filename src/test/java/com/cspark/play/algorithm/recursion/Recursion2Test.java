package com.cspark.play.algorithm.recursion;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Recursion2Test {

  @Test
  @DisplayName("문자열의 길이 계산")
  void length() {
    assertThat(Recursion2.length("")).isEqualTo(0);
    assertThat(Recursion2.length("A")).isEqualTo(1);
    assertThat(Recursion2.length("ABC")).isEqualTo(3);
  }

  @Test
  @DisplayName("문자열 프린트")
  void printChars() throws Exception {
    assertThat(tapSystemOut(() -> Recursion2.printChars(""))).isEqualTo("");
    assertThat(tapSystemOut(() -> Recursion2.printChars("A"))).isEqualTo("A");
    assertThat(tapSystemOut(() -> Recursion2.printChars("ABC"))).isEqualTo("ABC");
  }

  @Test
  @DisplayName("문자열을 뒤집어 프린트 ")
  void printCharsReverse() throws Exception {
    assertThat(tapSystemOut(() -> Recursion2.printCharsReverse(""))).isEqualTo("");
    assertThat(tapSystemOut(() -> Recursion2.printCharsReverse("A"))).isEqualTo("A");
    assertThat(tapSystemOut(() -> Recursion2.printCharsReverse("ABC"))).isEqualTo("CBA");
  }

  @Test
  @DisplayName("2진수로 변환하여 출력")
  void printInBinary() throws Exception {
    assertThat(tapSystemOut(() -> Recursion2.printInBinary(0))).isEqualTo("0");
    assertThat(tapSystemOut(() -> Recursion2.printInBinary(1))).isEqualTo("1");
    assertThat(tapSystemOut(() -> Recursion2.printInBinary(2))).isEqualTo("10");
    assertThat(tapSystemOut(() -> Recursion2.printInBinary(3))).isEqualTo("11");
    assertThat(tapSystemOut(() -> Recursion2.printInBinary(4))).isEqualTo("100");
  }

  @Test
  @DisplayName("배열의 합 구하기")
  void sum() {
    assertThat(Recursion2.sum(0, new int[]{})).isZero();
    assertThat(Recursion2.sum(3, new int[]{1, 2, 3})).isEqualTo(6);
    assertThat(Recursion2.sum(5, new int[]{1, 2, 3, 4, 5})).isEqualTo(15);
  }
}