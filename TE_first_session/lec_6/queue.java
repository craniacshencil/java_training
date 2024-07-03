import java.util.LinkedList;
import java.util.Queue;

public class queue extends Thread {
  public static void main(String args[]) throws InterruptedException {
    Queue<animal> myQueue = new LinkedList<animal>();
    myQueue.offer(new animal("Dog", "bark"));
    myQueue.offer(new animal("Cat", "meow"));
    myQueue.offer(new animal("Duck", "quack"));
    myQueue.offer(new animal("Lion", "roar"));
    myQueue.offer(new animal("Horse", "neigh"));

    while (!myQueue.isEmpty()) {
      animal a = myQueue.poll();
      Thread.sleep(2000);
      a.makeSound();
    }
  }
}

class animal {
  String name;
  String sound;

  public animal(String name, String sound) {
    this.name = name;
    this.sound = sound;
  }

  public void makeSound() {
    System.out.println(this.name + " says " + this.sound);
  }
}

// custom class, 2 prop -> string name, double price
// main class, scanner i/p, accept name and price
// push into stack, queue
// calculate total
