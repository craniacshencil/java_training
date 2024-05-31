import java.util.Scanner;
class leapYear{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        String result;
        result = year % 4 == 0? (year % 100 == 0? (year % 400 == 0? "It is a leap year": "It is not a leap year"): "It is a leap year") : "It is not a leap year";  
        System.out.println(result);
    }
}
