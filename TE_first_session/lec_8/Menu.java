import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    private static HashMap<Integer, HashMap<String, String>> menuCard = new HashMap<Integer, HashMap<String, String>>();
    private static String name, price;
    private static int itemNo = 1;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Add Item");
        System.out.println("2. Display Menu");
        System.out.println("3. Exit");
        while(true) {
        System.out.println();
        System.out.println("Enter your choice");
            switch(sc.nextInt()) {
                case 1: createItem();
                break;
                case 2: displayMenu();
                break;
                case 3: return ; 
                default: System.out.println("Illegal argument brev");
            }
        }
    }

    static void createItem() {
        System.out.println("Name: ");
        name = sc.next();
        if ("quit".equals(name)) return ;
        System.out.println("Price: ");
        price = sc.next();
        if ("price".equals(name)) return ;
        HashMap<String, String> menuItem = new HashMap<String, String>();
        menuItem.put("name", name);
        menuItem.put("price", price);
        menuCard.put(itemNo, menuItem);
        itemNo++;
    }

    static void displayMenu() {
        menuCard.forEach(
            (key, value) -> {
                System.out.printf(key + "\t|");
                value.forEach(
                    (k, v) -> {
                        System.out.printf(v + "\t|");
                    }
                );  
                System.out.println();
            }
        );  
    }
}
