import java.util.Scanner;
class swapWithoutThird{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");        
        int n1 = sc.nextInt();
        System.out.println("Enter the second number: ");        
        int n2 = sc.nextInt();
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("The first number is: " + n1);
        System.out.println("The second number is: " + n2);
    }
}
