import java.util.HashMap;

public class firstHash {
  public static void main(String args[]) {
    HashMap<Integer, String> hm = new HashMap<Integer, String>();
    hm.put(1, "Option 1");
    hm.put(2, "Option 2");
    hm.put(3, "Option 3");
    hm.put(4, "Option 4");
    hm.put(5, "Option 5");

    hm.forEach(
        (k, v) -> {
          hm.compute(k, (key, val) -> val.toUpperCase());
        });
    System.out.println(hm);
  }
}
