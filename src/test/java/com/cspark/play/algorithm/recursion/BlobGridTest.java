package com.cspark.play.algorithm.recursion;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BlobGridTest {

  @Test
  void countCellsInOneBlob() {
    BlobGrid blobGrid = new BlobGrid();
    assertThat(blobGrid.countCells(0, 0)).isEqualTo(5);
    assertThat(blobGrid.countCells(0, 7)).isEqualTo(1);
    assertThat(blobGrid.countCells(3, 5)).isEqualTo(13);
    assertThat(blobGrid.countCells(6, 0)).isEqualTo(5);
  }

}