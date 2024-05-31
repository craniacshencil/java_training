import java.util.*;
class TwoDArray{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter the elements for the array: ");
        int arr[][] = new int[3][3];
        int arr1[] = {1, 2, 3};
        int arr2[] = {2, 3, 4};
        int arr3[] = {1, 2, 3};
        int arr4[7] = {3, 4, 2, 1, 5, 6, 2};
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.equals(arr1, arr3));
        System.out.println(Arrays.equals(arr2, arr3));
        Arrays.sort(arr4);
        System.out.println(arr4);
        Arrays.fill(arr4, 3, 6, 50);
        System.out.println(arr4);
    }
}
