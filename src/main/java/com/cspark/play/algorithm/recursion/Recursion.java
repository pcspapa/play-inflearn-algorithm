package com.cspark.play.algorithm.recursion;

public class Recursion {

  /**
   * 0부터 n까지의 합
   * @param n
   * @return
   */
  public static int func(int n) {
    if (n == 0)
      return 0;

    return n + func(n - 1);
  }

  /**
   * 0! = 1
   * n! = n * (n - 1)!
   *
   * @param n
   * @return
   */
  public static int factorial(int n) {
    if (n == 0)
      return 1;

    return n * factorial(n - 1);
  }

  /**
   *  x^0 = 1
   *  x^n = x * x^n-1
   *
   * @param base
   * @param exponent
   * @return
   */
  public static int power(int base, int exponent) {
    if (exponent == 0) {
      return 1;
    }

    return base * power(base, exponent - 1);
  }

  /**
   * F0 = 0
   * F1 = 1
   * Fn = Fn-1 + Fn-2
   * @param n
   * @return
   */
  public static int fibonacci(int n) {
    if (n < 2)
      return n;

    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  /**
   * Euclid Method
   * if m>=n & m%n = 0, gcd(m, n) = n
   *                    gcd(m, n) = gcd(n, m%n)
   *
   * @param m
   * @param n
   * @return
   */
  public static int gcd(int m, int n) {
    if (m < n) {
      int tmp = m;
      m = n;
      n = tmp;
    }

    if (m % n == 0)
      return n;

    return gcd(n, m % n);
  }
  /**
   * if n = 0, m
   *          gcd(n, m%n)
   *
   * @param m
   * @param n
   * @return
   */
  public static int gcdSimplify(int m, int n) {
    if (n == 0) {
      return m;
    }

    return gcdSimplify(n, m % n);
  }

}
