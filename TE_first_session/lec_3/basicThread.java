package threads;

class basicThread extends Thread {
    public static void main(String args[]) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            i++;
        }
        System.out.println("Main Thread Ended!");
    }
}
