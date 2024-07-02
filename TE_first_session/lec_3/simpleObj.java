public class simpleObj {
  public static String myName;

  public simpleObj(String name) {
    this.myName = name;
  }

  // static block
  static {
    System.out.println("simpleObj class has been imported succesfully!");
  }

  // mulitple static blocks allowed
  static {
    System.out.println("From the second static block.");
  }

  public void greet() {
    System.out.println("My name is " + myName);
  }
}
