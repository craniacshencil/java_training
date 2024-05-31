class VarArgOverload{
    public void m1(String name, int... n){
        for(int num : n){
            System.out.println(name);
        }
    }

    public void m1(String name){
        System.out.println(name);
    }

    public static void main(String args[]){
         VarArgOverload driver = new VarArgOverload();
         driver.m1("Raj");
         driver.m1("Raj", 2, 7, 8);
    }
}
