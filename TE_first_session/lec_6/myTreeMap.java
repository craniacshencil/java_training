import java.util.Comparator;
import java.util.TreeMap;

public class myTreeMap {
  static TreeMap<String, Integer> ages = new TreeMap<String, Integer>(Comparator.reverseOrder());

  public static void main(String args[]) {
    ages.put("John", 40);
    ages.put("Jane", 38);
    ages.put("Steve", 22);
    ages.put("Bill", 78);
    ages.put("Hailey", 20);
    ages.put("Amitabh", 80);
    ages.put("Zeel", 3);

    System.out.println(ages);
  }
}
