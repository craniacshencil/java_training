class temp{
    public static void main(String args[]){
       int a, c;
       hellothere b = new hellothere();
       a = b.show();
       c = 8;
       System.out.println("the value of b accessed directy is: " + hellothere.b);
       System.out.println("The value of c is: " + c);
       System.out.println("The value of b + c is: " + (a + c));
       System.out.println("The value of b is: " + a + c);
    }
}

class hellothere{
    static int b = 9;
    public int show(){
        return b;
    }
}
