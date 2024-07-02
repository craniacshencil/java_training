import java.util.ArrayList;
import java.util.Scanner;

public class countriesAlChallenge {
  static ArrayList<String> countries = new ArrayList<String>();
  static Scanner sc = new Scanner(System.in);

  public static void main(String args[]) {
    countries.add("India");
    countries.add("Mongolia");
    countries.add("USA");
    countries.add("Uzbekistan");
    countries.add("Tajikistan");
    countries.add("Canada");
    countries.add("China");
    countries.add("Wakanda");
    countries.add("Brazil");
    countries.add("Greece");
    countries.add("Germany");
    while (true) {
      System.out.println("Change country name[0 to exit]:");
      int num = sc.nextInt();
      if (num != 0) {
        changeCountry();
      } else break;
      System.out.println(countries);
    }
  }

  static void changeCountry() {
    System.out.println("Enter existing color:");
    String old = sc.next();
    System.out.println("Enter new color:");
    String new_ = sc.next();
    countries.set(countries.indexOf(old), new_);
  }
}
