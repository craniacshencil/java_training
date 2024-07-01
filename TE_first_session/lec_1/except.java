import java.util.Scanner;
class except {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
        }
        catch(Exception E){
            System.out.println("Entered value is not a number\nEnter a number next time.");
        }
    }
}
