import java.util.Stack;

public class stack {
  public static void main(String args[]) {
    Stack<String> ms = new Stack<String>();
    String[] colors = {"Red", "Orange", "Yellow", "Green", "Blue", "Yellow", "Indigo", "Violet"};
    for (String color : colors) {
      ms.push(color);
    }
    String forbidden = "Yellow", popped;
    while (!ms.empty()) {
      popped = ms.pop();
      if (!popped.equals(forbidden)) System.out.println(popped);
      else System.out.println("Forbidden word");
    }
    System.out.println(ms);
  }
}
