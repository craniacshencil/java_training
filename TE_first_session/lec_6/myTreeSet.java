import java.util.Scanner;
import java.util.TreeSet;

public class myTreeSet {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    TreeSet<String> ts = new TreeSet<String>();
    String entry;
    while (true) {
      System.out.println("Add value to set: ");
      entry = sc.next();
      if ("quit".equals(entry)) break;
      ts.add(entry);
    }
    System.out.println(ts);

    System.out.println("1. lower");
    System.out.println("2. higher");
    int choice = sc.nextInt();
    System.out.println("Enter String:");
    String pivot = sc.next();
    if (choice == 1) {
      System.out.println(ts.lower(pivot));
    } else {
      System.out.println(ts.higher(pivot));
    }
  }
}
