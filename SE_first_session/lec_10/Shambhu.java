import java.util.*;
class Shambhu{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 numbers: ");
        int numbers[] = new int[4];
        for(int i = 0; i < 4; i++){
            numbers[i] = sc.nextInt();
        }
        for(int i = 0; i < 4; i++){
            System.out.print(numbers[i] + "-" + (char)numbers[i] + " ");
        }
        
    }
}
