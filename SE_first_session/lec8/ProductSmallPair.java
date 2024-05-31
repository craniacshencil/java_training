import java.util.*;
class ProductSmallPair{
    public static void main(String args[]){
        int arr[] = {9, 8, -7, 3, 9, 3};
        int sum = 4;
        Arrays.sort(arr);
        int n1 = arr[0];
        int n2 = arr[1];
        if ((n1 + n2) <= sum)
            System.out.println("Product of the smallest 2 numbers is: " + (n1 * n2));
        else
            System.out.println("The additon of the smallest 2 number is lesser than sum: " + 0);
        System.out.println(Arrays.toString(arr));
    }
}
