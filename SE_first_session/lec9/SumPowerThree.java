import java.util.Scanner;
class SumPowerThree{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();
        int pattern = 0;
        for (int i = 1; i <= a / 3; i++){
            System.out.println(pattern);
            pattern += Math.pow(3, i);
            if(pattern == a){
                System.out.println("It is a Sum of Power of Three");
                System.exit(0);
            }
        }
        System.out.println("It is not a sum of power of three");

    }
}
