package app.recursion;

import java.util.Scanner;

public class FibonacciApp {
  private static int fibonacci(int n) {
    if (n == 1) return 1;
    if (n == 2) return 1;
    return fibonacci(n-1) + fibonacci(n-2);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    for(int i=1; i<=number; i++){ System.out.print(fibonacci(i) +" "); }

  }
}
