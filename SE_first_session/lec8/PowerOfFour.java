import java.util.Scanner;
class PowerOfFour{
    public static void main(String args[]){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((Math.pow(n, 0.25) - (int)Math.pow(n, 0.25)) == (double)0)
            System.out.println("The number is a power of four");
        else
            System.out.println("The number is not a power of four");
    }
}
