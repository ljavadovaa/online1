package app.algorithms;

import java.util.Arrays;
import java.util.Random;

public class Merge {
  public static void main(String[] args) {
    int[] data1 = new Random().ints(10, 30).limit(20).sorted().toArray();
    int[] data2 = new Random().ints(10, 30).limit(20).sorted().toArray();
    int[] data3 = merge(data1, data2);
    System.out.println(Arrays.toString(data1));
    System.out.println(Arrays.toString(data2));
    System.out.println(Arrays.toString(data3));
  }

  private static int[] merge(int[] data1, int[] data2) {
    int[] data3 = new int[data1.length+data2.length];
    int i=0, j =0 ,k = 0;
    while (i < data1.length && j < data2.length) {
      if (data1[i] < data2[j])
        data3[k++] = data1[i++];
      else
        data3[k++] = data2[j++];
    }
    while (i < data1.length)
      data3[k++] = data1[i++];
    while (j < data2.length)
      data3[k++] = data2[j++];
    return data3;
  }
}
