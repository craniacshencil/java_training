class Test{
    public void show(){
        System.out.println("Hello");
    }
}

class Useme2{
    public static void main(String args[]){
        Test t = new Test();
        t.show();
    }
}
