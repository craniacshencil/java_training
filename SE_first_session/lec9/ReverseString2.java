class ReverseString2{
    public static void main(String args[]){ 
        String str = "hello";
        char ch[] = str.toCharArray();
        String rev = "";
        for(char character : ch){
            rev = character + rev;
        }
        System.out.println("Reversed string: " + rev);
    }
}
