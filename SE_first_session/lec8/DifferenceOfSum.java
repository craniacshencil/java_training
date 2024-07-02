import java.util.*;

class DifferenceOfSum {
  static Scanner sc = new Scanner(System.in);

  public static void main(String args[]) {
    System.out.println("Enter the range till which numbers: ");
    int n = sc.nextInt();
    System.out.println("Enter the number by which it is divisible by: ");
    int m = sc.nextInt();

    int indivisibleSum = 0;
    int divisibleSum = 0;
    for (int i = 1; i <= n; i++) {
      if (i % m != 0) indivisibleSum += i;
      else divisibleSum += i;
    }

    System.out.println("The final output is: " + (indivisibleSum - divisibleSum));
  }
}
