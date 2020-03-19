package app;

public class BinToInt {
  public static void main(String[] args) {
    String binary = "00010011";
    char[] numbers = binary.toCharArray();
    int result = 0;
    for(int i=numbers.length-1; i>=0; i--)
      if(numbers[i]=='1')
        result += Math.pow(2, (numbers.length-i-1));
    System.out.println(result);
  }
}
