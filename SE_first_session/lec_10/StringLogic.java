import java.util.Scanner;
class StringLogic{
    public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the string: ");
//         String entry = sc.next();
        String entry = "abbbeeeefffggg";
        char entryArray[] = entry.toCharArray();
        String output = "";
        int count = 1;
        for(int i = 0; i < entryArray.length - 1; i++){
            if(entryArray[i] == entryArray[i + 1]){
                System.out.println("The character is: " + entryArray[i] + " " + i);
                count++;
                if((i + 1) == entryArray.length - 1){
                    System.out.println("Hello");
                    if(count != 1)
                        output = output + entryArray[i] + count;
                    else
                        output = output + entryArray[i];
                    count = 1;        
                }
            }

            else{
                if(count != 1)
                    output = output + entryArray[i] + count;
                else
                    output = output + entryArray[i];
                count = 1;        
            }

     
        }
        System.out.println("Original is: " + entry);
        System.out.println("The output is: " + output);
    }
}
