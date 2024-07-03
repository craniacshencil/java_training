import java.util.LinkedList;
import java.util.Queue;

public class shoppingQueue {
  public static void main(String args[]) {
    Queue<clothing> myQueue = new LinkedList<clothing>();
    myQueue.offer(new clothing("Jacket", 2599.99));
    myQueue.offer(new clothing("Pants", 599.99));
    myQueue.offer(new clothing("Shirt", 1499.99));
    myQueue.offer(new clothing("Scarf", 299.99));
    myQueue.offer(new clothing("Beanie", 499.99));
    myQueue.offer(new clothing("Blazer", 7299.99));

    double total = 0.00;
    while (!myQueue.isEmpty()) {
      clothing c = myQueue.poll();
      System.out.println(c.name + "\t| " + c.price);
      total += c.price;
    }
    System.out.println("total bill: " + total);
  }
}

class clothing {
  String name;
  double price;

  public clothing(String name, double price) {
    this.name = name;
    this.price = price;
  }
}

// custom class, 2 prop -> string name, double price
// main class, scanner i/p, accept name and price
// push into stack, queue
// calculate total
