import java.util.Scanner;
class menuHandler {
    public static void main(String args[]) {
        menuPoper mp = new menuPoper();
        System.out.println(mp.getMenu());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item id:");
        int id = sc.nextInt();
        mp.getNameAndPrice(id);
    }
}
