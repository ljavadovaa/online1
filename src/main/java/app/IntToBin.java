package app;

public class IntToBin {
  public static void main(String[] args) {
    int value = 18;
    int num = 0;
    StringBuilder bin = new StringBuilder();
    while (value > 0) {
      num = value % 2;
      bin.append(num);
      value /= 2;
    }
    System.out.println(bin.toString()); // "00010010"
  }
}
