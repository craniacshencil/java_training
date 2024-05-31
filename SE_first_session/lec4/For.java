import java.util.Scanner;
class For{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        For driver = new For();
        System.out.println("0. Exit");
        System.out.println("1. factorial");
        System.out.println("2. fibonacci");
        System.out.println("3. Series1");
        System.out.println("4. Series2");
        System.out.println("5. Reverse with diff 2");
        System.out.println("6. Positive number without *");

        int choice;
        while(true){
            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 0: System.exit(0);
                case 1: driver.factorial(); break;
                case 2: driver.fibo(); break;
                case 3: driver.seriesOne(); break;
                case 4: driver.seriesTwo(); break;
                case 5: driver.differenceBetweenTwo(); break;
                case 6: driver.multiplyWithout(); break;
                default: System.out.println("Invalid Input");
            }
        }
         
    }

    public void factorial(){
        System.out.println("Enter the number to find the factorial of: ");
        int n = sc.nextInt();
        int factorial = 1;
        for(int i = 1; i <= n; i++){
           factorial = factorial * i; 
        }
        System.out.println("The factorial is: " + factorial);
    }
    
    public void fibo(){
        System.out.println("Enter the length of series: ");
        int n = sc.nextInt();
        int n1 = 0, n2 = 1, n3;
        System.out.println(n1 + "\t" + n2);
        for(int i = 3; i <= n; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print("\t" + n3);
        }
    }

    public void seriesOne(){
        System.out.println("Enter no. of terms: ");
        int n = sc.nextInt();
        System.out.println("Enter the digit: ");
        int digit = sc.nextInt();
        int sum = 1;
        for(int i = 2; i <= n; i++){
           sum += (Math.pow(digit, i) / i);
        }
        System.out.println("The series: " + sum);
    }
    
    public void seriesTwo(){
        System.out.println("Enter no. of terms: ");
        int n = sc.nextInt();
        System.out.println("Enter the digit: ");
        For factorialMaker = new For();
        int digit = sc.nextInt();
        int sum = 1;
        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial = 1 * i;
           sum += (Math.pow(digit, i) / factorial);
        }
        System.out.println("The series: " + sum);
    }

    public void differenceBetweenTwo(){
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i = n; i >= 2; i = i - 2)
            System.out.println(i);
    }

    public void multiplyWithout(){
        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();
        int answer = 0;
        for(int i = 1; i <= n2; i++)
            answer += n1;
        System.out.println("Multiplication: " + answer);
    }
}
