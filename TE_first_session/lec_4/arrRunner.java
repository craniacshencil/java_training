import java.util.Scanner;

public class arrRunner {
  public static void main(String args[]) {
    arrayThread at = new arrayThread();
    Scanner sc = new Scanner(System.in);
    at.start();
    String el;
    while (true) {
      el = sc.next();
      at.addValue(el);
    }
  }
}
