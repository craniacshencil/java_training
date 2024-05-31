import java.util.Scanner;
class reverseNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int rem, rev = 0;
        while(number > 0){
            rem = number % 10;
            number /= 10;
            rev = rev * 10 + rem;
        }
        System.out.println("The reversed number is: " + rev);
    }
}
