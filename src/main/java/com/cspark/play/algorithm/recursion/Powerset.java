package com.cspark.play.algorithm.recursion;

public class Powerset {

  private final char[] data;
  private final int N;
  private final boolean[] include;

  public Powerset(char[] data) {
    this.data = data;
    this.N = data.length;
    this.include = new boolean[N];
  }

  public void powerset(int k) {
    if (k == N) {
      for (int i = 0; i < N; i++)
        if (include[i]) System.out.print(data[i] + " ");

      System.out.println();
      return;
    }

    include[k] = false;
    powerset(k + 1);
    include[k] = true;
    powerset(k + 1);
  }

}
