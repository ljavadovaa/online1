package app;

public class BinToInt {
  public static void main(String[] args) {
    String binary = "00010011";
    char[] numbers = binary.toCharArray();
    int result = 0;
    for(int i=7; i>=0; i--)
      if(numbers[i]=='1')
        result += Math.pow(2, (7-i));
    System.out.println(result);
  }
}
