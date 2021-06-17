package com.cspark.play.algorithm.recursion;

import org.junit.jupiter.api.Test;

class PowersetTest {

  @Test
  void powersetCase1() {
    Powerset powerset = new Powerset(new char[]{'a', 'b', 'c', 'd', 'e', 'f'});
    powerset.powerset(0);
  }

  @Test
  void powersetCase2() {
    Powerset powerset = new Powerset(new char[]{'a', 'b'});
    powerset.powerset(0);
  }
}