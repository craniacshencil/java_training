import java.util.Scanner;
class if_else{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        if_else driver = new if_else();
        System.out.println("0. Exit");
        System.out.println("1. Fail or Pass");
        System.out.println("2. Find Percentage of marks scored");
        System.out.println("3. Weekday or Weekend");
        System.out.println("4. Vowel or Not");
        int choice;
        while(true){
            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 0: System.exit(0);break;
                case 1: driver.failOrPass();break;
                case 2: driver.findPercentage();break;
                case 3: driver.weekendOrWeekday();break;
                case 4: driver.vowelOrNot();break;
            }
        }
    }

    public void failOrPass(){
        System.out.println("Enter marks: ");
        int marks = sc.nextInt();
        if(marks >= 45) 
            System.out.println("The student has passed");
        else
            System.out.println("The student has failed");
    }

    public void findPercentage(){
        System.out.println("Enter Physics marks: ");
        int phy = sc.nextInt();
        System.out.println("Enter Chemistry marks: ");
        int chem = sc.nextInt();
        System.out.println("Enter Math marks: ");
        int math = sc.nextInt();
        System.out.println("Enter gender(m/f): ");
        char gender = sc.next().charAt(0);
        int percentage = (phy + chem + math) / 3; 
        if(gender == 'f' && percentage >= 62)
            System.out.println("Admission can be taken");
        else
            System.out.println("Admission cannot be taken.");
    }

    public void weekendOrWeekday(){
        System.out.println("Enter Day: ");
        String day = sc.next();
        day = day.toLowerCase();
        if(day.equals("sunday")|| day.equals("saturday"))
            System.out.println("Tis' a weekend");
        else
            System.out.println("Get to work! Its a weekday");
    }

    public void vowelOrNot(){
        System.out.println("Enter character: ");
        char c = sc.next().charAt(0);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            System.out.println("The character is a vowel");
        else
            System.out.println("The character is a consonant");
    }
}
