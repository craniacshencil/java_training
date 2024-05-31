import java.util.Scanner;
class addDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int sum = 0, rem;
        while(number > 0){
            rem = number % 10;
            sum += rem;
            number /= 10;
        }
        System.out.println("The sum of the digits of the number is: " + sum);
        
    }
}
