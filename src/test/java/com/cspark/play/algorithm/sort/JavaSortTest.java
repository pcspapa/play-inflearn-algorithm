package com.cspark.play.algorithm.sort;

import static java.util.stream.IntStream.range;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class JavaSortTest {

  private int[] data = new int[10];

  @Test
  void arraysSort() {
    List<Integer> list = range(1, 6)
        .boxed()
        .collect(Collectors.toList());

    Collections.shuffle(list);
    for (int i = 0; i < list.size(); i++) {
      data[i] = list.get(i);
    }
    System.out.println("data = " + Arrays.toString(data));
    Arrays.sort(data, 0, list.size());
    System.out.println("data = " + Arrays.toString(data));
  }


}
