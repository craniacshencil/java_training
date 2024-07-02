class subCaller extends Thread {
  public static void main(String args[]) throws InterruptedException {
    subThread a = new subThread("a");
    subThread b = new subThread("b");
    a.start();
    b.start();

    boolean running = true;
    int i = 0;
    while (running) {
      System.out.println("Main thread says: " + i);
      i++;
      Thread.sleep(3000);
      if (i > 9) running = false;
    }
    a.join();
    b.join();
    System.out.println("Main thread finished");
  }
}
