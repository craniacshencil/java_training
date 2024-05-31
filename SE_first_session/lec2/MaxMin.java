import java.util.Scanner;
class MaxMin{
    public static void main(String args[]){
        int n1, n2, n3, n4, n5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        n2 = sc.nextInt();
        System.out.println("Enter third number: ");
        n3 = sc.nextInt();
        System.out.println("Enter fourth number: ");
        n4 = sc.nextInt();
        System.out.println("Enter fifth number: ");
        n5 = sc.nextInt();
        int max = n1;
        if (max < n2) max = n2;
        if (max < n3) max = n3;
        if (max < n4) max = n4;
        if (max < n5) max = n5;
        System.out.println("Max among 5: " + max);
        
        int min = n1;
        if (min > n2) min = n2;
        if (min > n3) min = n3;
        if (min > n4) min = n4;
        System.out.println("Min among first 4: " + min);
    }
}
