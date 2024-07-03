import java.util.HashMap;
import java.util.Scanner;

public class menuPopHash {
  boolean itemFound = false;
  HashMap<Integer, conciseMenuItem> items = new HashMap<Integer, conciseMenuItem>();

  menuPopHash() {
    items.put(1, new conciseMenuItem("Dosa", 20.2f));
    items.put(2, new conciseMenuItem("Vada", 30.5f));
    items.put(3, new conciseMenuItem("Momo", 65.8f));
    items.put(4, new conciseMenuItem("Pizza", 150f));
  }
  ;

  Scanner sc = new Scanner(System.in);

  public void getMenu() {
    items.forEach((key, value) -> System.out.println(key + ": " + value.name + " " + value.price));
  }

  public void getNameAndPrice(int id) {
    items.forEach(
        (key, value) -> {
          if (key == id) {
            System.out.println("Name: " + key + "\nPrice:" + value.price);
            itemFound = true;
          }
        });
    if (!itemFound) {
      System.out.println("id not present");
    }
  }

  public void addItem() {
    System.out.println("Enter name of id:");
    int id = sc.nextInt();
    System.out.println("Enter name of item:");
    String name = sc.next();
    System.out.println("Enter price of item:");
    float price = sc.nextFloat();

    if (items.putIfAbsent(id, new conciseMenuItem(name, price)) == null) {
      System.out.println("Item Added Succesfully");
    } else {
      System.out.println("Item couldn't be added");
    }
  }
}

class conciseMenuItem {
  public String name;
  public float price;

  conciseMenuItem(String name, float price) {
    this.name = name;
    this.price = price;
  }
}
