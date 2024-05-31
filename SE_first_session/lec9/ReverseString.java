import java.util.*;
class ReverseString{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter string to be reversed: ");
        String s1 = sc.next();
        char stringArray[] = s1.toCharArray();
        char reversedStringArray[] = new char[stringArray.length];
        for(int i = 0, j = stringArray.length - 1; i < stringArray.length; i++, j--){
            reversedStringArray[i] = stringArray[j];
        }

        String reverse = new String(reversedStringArray);
        System.out.println("Reversed: " + reverse);
    }
}
