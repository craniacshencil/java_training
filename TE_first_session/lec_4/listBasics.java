import java.util.ArrayList;

class listBasics {
  public static void main(String args[]) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> doubled = new ArrayList<Integer>();
    list.add(342);
    list.add(23);
    list.add(1);
    list.add(35);
    list.forEach(
        (v) -> {
          doubled.add(v * 2);
        });
    System.out.println(doubled);
  }
}
