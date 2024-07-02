import java.util.ArrayList;
import java.util.Collections;

public class colorAl {
  public static void main(String args[]) {
    ArrayList<String> colors = new ArrayList<String>();
    colors.add("Red");
    colors.add("Yellow");
    colors.add("Green");
    colors.add("Blue");
    colors.add("Magenta");
    colors.add("Violet");
    System.out.println(colors);
    Collections.sort(colors);
    System.out.println(colors);
    colors.add(2, "Turqouise");
    System.out.println(colors);
    System.out.println(colors.get(3));
    System.out.println(colors.subList(3, 6));
    ArrayList<String> smolColors = (ArrayList) colors.clone();
    Iterator<String> colorItr = colors.iterator();
    while (colorItr.hasNext()) {
      System.out.println(colorItr.next());
    }
  }
}
// create arrayList string
// 10 entries
// scanner -> which value to change(name value), new value
// change the al
