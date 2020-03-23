package app.recursion;

import java.util.Scanner;

public class CalculateSequence {
  private static int sum(int n) {
    if (n == 0) return 0;
    return n + sum(n-1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    System.out.println(sum(number));

  }
}
