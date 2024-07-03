import java.util.HashSet;
import java.util.Scanner;

public class myHashSet {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String entry;
    HashSet<String> set = new HashSet<String>();
    while (true) {
      System.out.println("Enter a string:");
      entry = sc.nextLine();
      if ("quit".equals(entry.toLowerCase().trim())) break;

      if (!set.add(entry)) {
        System.out.println("Already exists in set");
      } else {
        System.out.println("Successfully added to set");
      }
      System.out.println(set);
    }
  }
}
