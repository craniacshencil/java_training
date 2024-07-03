import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class secTreeMap {
  public static void main(String args[]) {
    TreeMap<Integer, String> alsoAges = new TreeMap<Integer, String>(Comparator.reverseOrder());
    Scanner sc = new Scanner(System.in);
    int age;
    String name;
    while (true) {
      System.out.println("Enter age:");
      age = sc.nextInt();
      System.out.println("Enter name:");
      name = sc.next();
      if ("quit".equals(name)) break;
      alsoAges.put(age, name);
    }
    System.out.println(alsoAges);
  }
}
