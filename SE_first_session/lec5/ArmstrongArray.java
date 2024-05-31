import java.util.*;
class ArmstrongArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        ArmstrongArray driver = new ArmstrongArray();
        for(int i = 0; i < 10; i++) 
            arr[i] = sc.nextInt();
        for(int number : arr){
            if(driver.findArmstrong(number))
                System.out.println(number + " is an Armstrong number");
        }
    }

    public boolean findArmstrong(int num){
        //find digits
        int noOfDigits = 0;
        int temp = num;
        while(num > 0){
           num /= 10;
           noOfDigits++;
        }
        num = temp;

        //find sum for each digit
        int digit, sum = 0;
        while(num > 0){
            digit = num % 10;
            sum += Math.pow(digit, noOfDigits);
            num /= 10;
        }

        if(temp == sum)
            return true;
        else
            return false;
    }
}
