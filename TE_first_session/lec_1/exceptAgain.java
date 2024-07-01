import java.util.Scanner;
class exceptAgain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while(running) {
            try{
                System.out.println("Enter a number: ");
                int num = sc.nextInt();
                System.out.println(num);
                running = false;
            }
            catch(Exception E){
                System.out.println("Entered value is not a number");
                sc.nextLine();
            }
        }
    }
}
