import java.util.Scanner;

class menuHandlerHash {
  public static void main(String args[]) {
    menuPopHash mp = new menuPopHash();
    mp.getMenu();
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter item id to find:");
    int id = sc.nextInt();
    mp.getNameAndPrice(id);

    boolean running = true;
    int choice;
    while (running) {
      System.out.println("Create new item:");
      System.out.println("[1]-Yes / [0]-No");
      choice = sc.nextInt();
      switch (choice) {
        case 1:
          mp.addItem();
          mp.getMenu();
          break;
        case 0:
          mp.getMenu();
          System.out.println("Exiting, Thank You!");
          System.exit(0);
          break;
      }
    }
  }
}
