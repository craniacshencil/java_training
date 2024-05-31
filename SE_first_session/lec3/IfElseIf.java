import java.util.Scanner;
class IfElseIf{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        IfElseIf driver = new IfElseIf();
        System.out.println("0. Exit");
        System.out.println("1. Find Grade");
        System.out.println("2. Check character");
        int choice;
        while(true){
            System.out.println("Enter a choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 0: System.exit(0); break;
                case 1: driver.getGrade(); break;
                case 2: driver.uppercase_lowercase_spl_number(); break;
                default: System.out.println("The input is invalid.");
            }
        }
        
    }
    public void getGrade(){
        System.out.println("Enter percentage: ");
        int percentage = sc.nextInt();
        if(percentage >= 90)
            System.out.println("Grade A");
        else if(percentage >= 80)
            System.out.println("Grade B");
        else if(percentage >= 70)
            System.out.println("Grade C");
        else if(percentage >= 60)
            System.out.println("Grade D");
        else if(percentage >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Fail");
    }

    public void uppercase_lowercase_spl_number(){
        System.out.println("Enter character: ");
        char c = sc.next().charAt(0);
        if (c >= 48 && c <= 57)
            System.out.println("It is a number");
        else if (c >= 97 && c <= 122)
            System.out.println("It is a lowercase letter");
        else if (c >= 65 && c <= 91)
            System.out.println("It is an uppercase letter");
        else
            System.out.println("It is a special character");
    }
}
