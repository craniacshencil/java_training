import java.util.*;
class reverseArray{
    public static void main(String args[]){
        int arr[] = {46, 2, 5, 4, 6, 9, 56, 45, 1};
        int temp, i, j;
        for(i = 0, j = (arr.length - 1); i < j; i++, j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
