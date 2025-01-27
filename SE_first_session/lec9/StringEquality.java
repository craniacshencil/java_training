class StringEquality{
    public static void main(String args[]){
        String s1 = "hello";
        String s2 = "hello";

        String s3 = new String("hello");
        String s4 = new String("hello");

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s3 == s4: " + (s3 == s4));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println(" '==' checks by reference ");

        System.out.println("s1.equals(s2) : " + s1.equals(s2));
        System.out.println("s3.equals(s4) : " + s3.equals(s4));
        System.out.println("s1.equals(s3) : " + s1.equals(s3));
        System.out.println(" 'equals' checks by value");
    }
}
