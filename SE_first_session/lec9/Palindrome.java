class Palindrome{
    public static void main(String args[]){
        String s1 = "malayalam";
        char ch[] = s1.toCharArray();
        for(int i = 0, j = ch.length - 1; i < j; i++, j--){
           if(ch[i] != ch[j]){
                System.out.println("Not a palindrome");
                System.exit(0);
           }
        }
        System.out.println("Palindrome");
    }
}
