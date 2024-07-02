public class subThread extends Thread {
  public String name;

  public subThread(String name) {
    this.name = name;
  }

  int i = 10;

  public void run() {
    while (i > -1) {
      System.out.println(name + " thread says: " + i);
      try {
        Thread.sleep(2000);
      } catch (Exception e) {
        // TODO: handle exception
      }
      i--;
    }
    System.out.println(this.name + " thread Ends here!");
  }
}
