import java.util.Scanner;
class LoopConcepts{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("0. Exit");
        System.out.println("1. Reverse Number");
        System.out.println("2. No. of digits in number");
        System.out.println("3. Sum of digits in number");
        System.out.println("4. Product of digits in number");
        System.out.println("5. Factorial");
        System.out.println("6. Armstrong?");
        System.out.println("7. Palindrome?");
        LoopConcepts driver = new LoopConcepts();
        while(true){
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 0: System.exit(0);
                case 1: driver.reverseNumber(); break;
                case 2: driver.findDigitsOfNumber(); break;
                case 3: driver.sumOfDigitsOfNumber(); break;
                case 4: driver.productOfDigitsOfNumber(); break;
                case 5: driver.factorial(); break;
                case 6: driver.isArmstrong(); break;
                case 7: driver.isPalindrome(); break;
            }
        }
    }

    public void reverseNumber(){
       System.out.println("Enter a number: ");
       int num = sc.nextInt();
       int rem, rev = 0;
       while(num > 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
       }
       System.out.println("The reversed number is: " + rev);
    }

    public void findDigitsOfNumber(){
       System.out.println("Enter a number: ");
       int num = sc.nextInt();
       int count = 0;
       if(num == 0)
            System.out.println("The number is 0 and no. of digits are: 1");     
            System.exit(0);
       while(num > 0){
            num /= 10;
            count++;
       }
       System.out.println("The number of digits in the number: " + count);
    }

    public void sumOfDigitsOfNumber(){
       System.out.println("Enter a number: ");
       int num = sc.nextInt();
       int sum = 0, digit;
       while(num > 0){
            digit = num % 10;
            num /= 10;
            sum += digit;
       }
       System.out.println("The sum of digits in the number: " + sum);
    }
        

    public void productOfDigitsOfNumber(){
       System.out.println("Enter a number: ");
       int num = sc.nextInt();
       int product = 1, digit;
       while(num > 0){
            digit = num % 10;
            num /= 10;
            product *= digit;
       }
       System.out.println("The product of digits in the number: " + product);
    }

    public void factorial(){
       System.out.println("Enter a number: ");
       int num = sc.nextInt();
       int factorial = 1;
       while(num > 0){
            factorial = num * factorial; 
            num = num - 1;
       }
       System.out.println("The factorial is: " + factorial);
    }

    public void isArmstrong(){
       System.out.println("Enter a number: ");
       int num = sc.nextInt();
       int num1 = num;
       int digit;
       int sum = 0, count = 0;
       //find the no. of digits
       while(num > 0){
            num /= 10;
            count++;
       }
       num = num1;
       //add to find 
       while(num > 0){
            digit = num % 10;
            num /= 10;
            sum += Math.pow(digit, count);
       }
       if(sum == num1)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }

    public void isPalindrome(){
       System.out.println("Enter a number: ");
       int num = sc.nextInt();
       int num1 = num;
       int rem, rev = 0;
       while(num > 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
       }
        if(num1 == rev)
           System.out.println("Palindrome");
        else
            System.out.println("No palindrome");
        
    }
}
