import java.util.Scanner;
class arrayUpdater {
    public static void main(String args[]) {
        int[] a = {};
        int num;
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while(running){
            System.out.println("Enter a number: ");
            try{
                num = sc.nextInt();
                switch(num){
                    case 0: 
                    System.out.println("Exitting, Thank You!");
                    break;
                    default:
                    a = addItem(a, num);
                    for(int el: a) System.out.printf("%d ", el);
                    System.out.println();
                }
            }
            catch(Exception E){
                System.out.println("This is not a number.");
                sc.nextLine();
            }
        }
    }

    static int[] addItem(int[] arr, int num){
        int[] b = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++) 
            b[i] = arr[i];
        b[arr.length] = num;
        return b;
    }
}
