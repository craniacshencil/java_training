import java.util.*;
class positiveNegative{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int pos[] = new int[10];
        int neg[] = new int[10];
        System.out.println("Enter elements of the array: ");
        int negcounter = 0;
        int poscounter = 0;
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            if(arr[i] >= 0)
                pos[poscounter++] = arr[i];
            else
                neg[negcounter++] = arr[i];
        }
        System.out.println(Arrays.toString(pos));
        System.out.println(Arrays.toString(neg));
        int length, smallerLength;
        if(poscounter >= negcounter){
            length = poscounter;
            smallerLength = negcounter;
        }
        else{
            length = negcounter;
            smallerLength = poscounter;
        }
        for(int i = 0; i < length; i++){
            if(i < smallerLength){
                System.out.print(pos[i] + " ");
                System.out.print(neg[i] + " ");
            }
            else if (length == poscounter){
                System.out.print(pos[i] + " ");
            }

            else if(length == negcounter)
                System.out.print(neg[i] + " ");
        }
    }
}
