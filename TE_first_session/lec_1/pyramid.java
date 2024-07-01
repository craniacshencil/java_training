import java.util.Scanner;
class pyramid {
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter number: ");
        int length = sc.nextInt();
        for(int i = 1; i <= length; i++) {
            for(int space = 0; space < length - i; space++) {
                System.out.print(" ");
            }
            for(int star = 1; star < 2 * i; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
