import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * DequeRemover
 */
public class DequeRemover {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dq = new LinkedList<>();
        dq.offer(1);
        dq.offer(342);
        dq.offer(342);
        dq.offer(2324);
        dq.offer(56);
        dq.offer(81);
        dq.offer(193);
        dq.offer(14897);
        dq.offer(981);
        dq.offer(193);
        dq.offer(2324);
        dq.offer(81);
        System.out.println(dq);
        int target;
        boolean running = true;
        System.out.println("1. Remove from beginning");
        System.out.println("2. Remove from end");
        System.out.println("3. Exit");
        while(running) {
            System.out.println("Enter choice");
            switch(sc.nextInt()) {
                case 1:
                System.out.println("Enter number to be replaced");
                target = sc.nextInt();
                dq.removeFirstOccurrence(target);
                break;
                case 2:
                System.out.println("Enter number to be replaced");
                target = sc.nextInt();
                dq.removeLastOccurrence(target);
                break;
                case 3: 
                System.out.println("Exiting, Thank you!");
                running = false;
                break;
                default: System.out.println("Illegal option");
            }
            System.out.println(dq);
        }
    }
    
}