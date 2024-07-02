import java.util.ArrayList;
import java.util.Scanner;

public class alProblem {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    ArrayList<Integer> al = new ArrayList<Integer>();
    ArrayList<Integer> bl = new ArrayList<Integer>();

    while (true) {
      System.out.println("Enter number:[0 to exit]:");
      int num = sc.nextInt();
      if (num != 0) {
        al.add(num);
        count++;
      } else break;
    }

    al.sort(
        (a, b) -> {
          return -1 * a.compareTo(b);
        });
    bl = al.subList(2, count);
  }
}
