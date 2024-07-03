import java.util.ArrayList;

public class personArrayList {
  static ArrayList<person> pal = new ArrayList<person>();

  public static void main(String args[]) {
    pal.add(new person("Jane", 22, 5.3));
    pal.add(new person("John", 29, 5.9));
    pal.add(new person("Steve", 24, 5.8));
    pal.add(new person("Hailey", 26, 5.6));
    pal.add(new person("Beth", 25, 5.1));

    System.out.println(pal);
    // sort by name
    pal.sort((el1, el2) -> el1.name.compareTo(el2.name));
    printList();
    System.out.println("------------------------------");
    pal.sort((el1, el2) -> Integer.compare(el1.age, el2.age));
    printList();
    System.out.println("------------------------------");
    pal.sort((el1, el2) -> Double.compare(el1.height, el2.height));
    printList();
    System.out.println("------------------------------");
  }

  static void printList() {
    for (person p : pal) {
      System.out.println(p.name + " | " + p.age + " | " + p.height);
    }
  }
}
