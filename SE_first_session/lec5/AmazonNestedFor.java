import java.util.*;
class AmazonNestedFor{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n + 1];
        int res[] = new int[n];
        System.out.println("Enter array: ");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        arr[n] = -1;
        for(int j = 0; j < n; j++){
            for(int k = j + 1; k <= n; k++){
                if(arr[k] > arr[j]){
                    res[j] = arr[k];
                    break; 
                }
                if(arr[k] == -1)
                    res[j] = -1;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
