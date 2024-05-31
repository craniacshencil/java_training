class VarArg{
    public void m1(int... n){
        for(int num : n){
            System.out.println(num);
        }
    }

    public static void main(String args[]){
        VarArg driver = new VarArg();
        driver.m1(10, 20, 30);
        driver.m1(10);
    }
}
