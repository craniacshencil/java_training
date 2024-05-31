import java.util.Scanner;
class lastDigit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number, last_digit;
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        last_digit = number % 10;
        System.out.println("Last digit is: " + last_digit);
    }
}
