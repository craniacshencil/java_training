class mainReader extends Thread {
  public String printString;
  public boolean running = true;

  mainReader(String name) {
    this.printString = name;
  }

  public void run() {
    while (running) {
      if ("quit".equals(this.printString)) System.out.println(this.printString);
      try {
        this.sleep(1000);
      } catch (Exception E) {
      }
    }
  }

  public void changeString(String name) {
    this.printString = name;
  }
}
