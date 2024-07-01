class genericCall {
    public static void main(String args[]) {
        myGeneric<String> a = new myGeneric<>("This is a generic");
        myGeneric<Integer> b = new myGeneric<>(35);
        System.out.println(a.getData());
        System.out.println(b.getData());
    }
}
