import java.util.*;
class Anagram{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first string: ");
       String s1 = sc.next();
       System.out.println("Enter second string: ");
       String s2 = sc.next();

       char[] s1Array = s1.toCharArray();
       char[] s2Array = s2.toCharArray();
       Arrays.sort(s1Array);
       Arrays.sort(s2Array);

       String s3 = new String(s1Array);
       String s4 = new String(s2Array);
       System.out.println("Verdict whether anagram: ");
       System.out.println(s3.equals(s4));
    }
}
