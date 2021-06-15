package com.cspark.play.algorithm.recursion;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Recursion1Test {

  @Test
  @DisplayName("0 ~ n까지의 합")
  void func() {
    assertThat(Recursion1.func(0)).isEqualTo(0);
    assertThat(Recursion1.func(1)).isEqualTo(1);
    assertThat(Recursion1.func(2)).isEqualTo(3);
    assertThat(Recursion1.func(3)).isEqualTo(6);
  }

  @Test
  @DisplayName("factorial")
  void factorial() {
    assertThat(Recursion1.factorial(0)).isEqualTo(1);
    assertThat(Recursion1.factorial(1)).isEqualTo(1);
    assertThat(Recursion1.factorial(2)).isEqualTo(2);
    assertThat(Recursion1.factorial(3)).isEqualTo(6);
  }

  @Test
  @DisplayName("power")
  void power() {
    assertThat(Recursion1.power(2, 1)).isEqualTo(2);
    assertThat(Recursion1.power(2, 2)).isEqualTo(4);
    assertThat(Recursion1.power(3, 3)).isEqualTo(27);
  }

  @Test
  @DisplayName("fibonacci")
  void fibonacci() {
    assertThat(Recursion1.fibonacci(0)).isEqualTo(0);
    assertThat(Recursion1.fibonacci(1)).isEqualTo(1);
    assertThat(Recursion1.fibonacci(2)).isEqualTo(1);
    assertThat(Recursion1.fibonacci(3)).isEqualTo(2);
    assertThat(Recursion1.fibonacci(4)).isEqualTo(3);
  }

  @Test
  @DisplayName("Greatest Common Divisor: Euclid")
  void gcd() {
    assertThat(Recursion1.gcd(1, 2)).isEqualTo(1);
    assertThat(Recursion1.gcd(3, 2)).isEqualTo(1);
    assertThat(Recursion1.gcd(33, 21)).isEqualTo(3);
    assertThat(Recursion1.gcd(63, 99)).isEqualTo(9);
  }

  @Test
  @DisplayName("Greatest Common Divisor: Simplify - Euclid")
  void gcdSimplify() {
    assertThat(Recursion1.gcdSimplify(1, 2)).isEqualTo(1);
    assertThat(Recursion1.gcdSimplify(3, 2)).isEqualTo(1);
    assertThat(Recursion1.gcdSimplify(33, 21)).isEqualTo(3);
    assertThat(Recursion1.gcdSimplify(63, 99)).isEqualTo(9);
  }

}
