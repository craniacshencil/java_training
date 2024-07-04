/**
 * recur
 */
public class recur extends Thread{

    public static void main(String[] args) throws InterruptedException{
        
    }

    static void doReduce(int num) throws InterruptedException{
        Thread.sleep(1000);
        System.out.println("Reducing" + num--);
        if(num > 0) doReduce(num);
        System.out.println("dunzo" + num);
    }
}