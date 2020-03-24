package app.bin;

public class IntToBin {
  public static void main(String[] args) {
    int value = 18;
    StringBuilder bin = new StringBuilder();
    for (int i = 0; i < 8; i++) {
      bin.append(value & 1);
      value = value >> 1;
    }
    System.out.println(bin.toString()); // "00010010"
  }
}
