import java.util.Scanner;

class tWrite extends Thread {
    public static void main(String args[]) {
        tRead thread1 = new tRead("thread1");
        thread1.start();

        Scanner sc = new Scanner(System.in);
        boolean running = true;
        String threadName = null;
        while (running) {
            threadName = sc.next();
            new tRead(threadName).start();
            if ("quit".equals(threadName.toLowerCase().trim())) {
                running = false;
            }
        }
        System.out.println("Main executed!");
    }
}
