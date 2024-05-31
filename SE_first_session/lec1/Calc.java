class Calc{
    public static void main(String args[]){
        int a = 22345;
        int n1 = a % 10;
        int n2 = a / 10000;
        int result = n1 + n2;
        System.out.println(a);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println("Addtion of first and last digit is: " + result);
    }
}
