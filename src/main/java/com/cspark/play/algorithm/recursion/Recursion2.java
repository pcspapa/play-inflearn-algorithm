package com.cspark.play.algorithm.recursion;

import java.util.Scanner;

public class Recursion2 {


  public static int length(String str) {
    if (str.equals(""))
      return 0;
    else
      return 1 + length(str.substring(1));
  }

  public static void printChars(String str) {
    if (str.equals("")) {
      return;
    } else {
      System.out.print(str.charAt(0));
      printChars(str.substring(1));
    }
  }

  public static void printCharsReverse(String str) {
    if (str.equals("")) {
      return;
    } else {
      printCharsReverse(str.substring(1));
      System.out.print(str.charAt(0));
    }
  }

  public static void printInBinary(int n) {
    if (n < 2) {
      System.out.print(n);
    } else {
      printInBinary(n / 2);
      System.out.print(n % 2);
    }
  }

  public static int sum(int n, int[] data) {
    if (n <= 0)
      return 0;
    else
      return sum(n - 1, data) + data[n - 1];
  }

  public static void readForm(int n, int[] data, Scanner in) {
    if (n == 0) {
      return;
    } else {
      readForm(n - 1, data, in);
      data[n - 1] = in.nextInt();
    }
  }
}
