import java.util.Scanner;

class subThreadCaller extends Thread {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the name of first thread:");
    String first_thread = sc.next();
    subThread first = new subThread(first_thread);

    System.out.println("Enter the name of second thread:");
    String second_thread = sc.next();
    subThread second = new subThread(second_thread);
    first.start();
    second.start();

    System.out.println("Main thread Ends here!");
  }
}
