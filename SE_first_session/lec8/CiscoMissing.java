import java.util.*;
class CiscoMissing{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        int arr[] = new int[n - 1];
        for(int j = 0; j < n - 1; j++){
            arr[j] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 1; i < arr.length; i++){
            if(arr[i - 1] != arr[i] - 1)
               System.out.println(arr[i] - 1 + " is not present");
        }
    }
}
