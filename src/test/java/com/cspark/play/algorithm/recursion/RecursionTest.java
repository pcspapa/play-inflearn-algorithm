package com.cspark.play.algorithm.recursion;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RecursionTest {

  @Test
  @DisplayName("0 ~ n까지의 합")
  void func() {
    assertThat(Recursion.func(0)).isEqualTo(0);
    assertThat(Recursion.func(1)).isEqualTo(1);
    assertThat(Recursion.func(2)).isEqualTo(3);
    assertThat(Recursion.func(3)).isEqualTo(6);
  }

  @Test
  @DisplayName("factorial")
  void factorial() {
    assertThat(Recursion.factorial(0)).isEqualTo(1);
    assertThat(Recursion.factorial(1)).isEqualTo(1);
    assertThat(Recursion.factorial(2)).isEqualTo(2);
    assertThat(Recursion.factorial(3)).isEqualTo(6);
  }

  @Test
  @DisplayName("power")
  void power() {
    assertThat(Recursion.power(2, 1)).isEqualTo(2);
    assertThat(Recursion.power(2, 2)).isEqualTo(4);
    assertThat(Recursion.power(3, 3)).isEqualTo(27);
  }

  @Test
  @DisplayName("fibonacci")
  void fibonacci() {
    assertThat(Recursion.fibonacci(0)).isEqualTo(0);
    assertThat(Recursion.fibonacci(1)).isEqualTo(1);
    assertThat(Recursion.fibonacci(2)).isEqualTo(1);
    assertThat(Recursion.fibonacci(3)).isEqualTo(2);
    assertThat(Recursion.fibonacci(4)).isEqualTo(3);
  }

  @Test
  @DisplayName("Greatest Common Divisor: Euclid")
  void gcd() {
    assertThat(Recursion.gcd(1, 2)).isEqualTo(1);
    assertThat(Recursion.gcd(3, 2)).isEqualTo(1);
    assertThat(Recursion.gcd(33, 21)).isEqualTo(3);
    assertThat(Recursion.gcd(63, 99)).isEqualTo(9);
  }

  @Test
  @DisplayName("Greatest Common Divisor: Simplify - Euclid")
  void gcdSimplify() {
    assertThat(Recursion.gcdSimplify(1, 2)).isEqualTo(1);
    assertThat(Recursion.gcdSimplify(3, 2)).isEqualTo(1);
    assertThat(Recursion.gcdSimplify(33, 21)).isEqualTo(3);
    assertThat(Recursion.gcdSimplify(63, 99)).isEqualTo(9);
  }

}
