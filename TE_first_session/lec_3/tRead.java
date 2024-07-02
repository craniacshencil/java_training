class tRead extends Thread {
    public int i = 0;
    public String name;
    public boolean keepAlive = true;

    public tRead(String name) {
        this.name = name;
    }

    public void run() {
        while (keepAlive) {
            System.out.println(name + " Counting: " + i);
            i++;
            try {
                this.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            if (i > 9) {
                keepAlive = false;
                System.out.println(name + " thread executed!");
            }
        }
    }
}
