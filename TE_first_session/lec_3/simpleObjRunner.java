class simpleObjRunner {
  public static void main(String args[]) {
    simpleObj first = new simpleObj();
    simpleObj second = new simpleObj("Custom constructor");
    System.out.println("First class:");
    first.greet();
    System.out.println("Second class:");
    second.greet();
  }
}
