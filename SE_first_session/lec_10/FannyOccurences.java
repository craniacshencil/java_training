import java.util.*;
class FannyOccurences{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter a string: ");
        String fanny = sc.next();
        int len = fanny.length();
        char ch[] = fanny.toCharArray();
        System.out.println("Enter occurence: ");
        char occurence = sc.next().charAt(0);
        String output = "";
        for (int i = 0; i < len; i++){
            if(ch[i] != occurence)
                output = output + ch[i];
        }
        System.out.println("Output is: " + output);

    }
}
