import java.util.Scanner;
class evenOddArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Enter element " + i + ":");
            arr[i] = sc.nextInt();
        }
        int max, min, sum = 0;
        max = min = arr[0];

        for(int number : arr){
            if(number % 2 == 0)
                System.out.println(number + " is Even");
            else
                System.out.println(number + " is Odd");
            sum += number;
            if(number > max) 
                max = number;
            if(number < min)
                min = number;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Sum: " + sum);
    }
}
