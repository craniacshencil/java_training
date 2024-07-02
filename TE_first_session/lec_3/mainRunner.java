import java.util.Scanner;

class mainRunner extends Thread {
  public static void main(String args[]) {
    mainReader t = new mainReader("init");
    t.start();
    Scanner sc = new Scanner(System.in);
    String name;
    while (true) {
      name = sc.next();
      t.changeString(name);
    }
  }
}
