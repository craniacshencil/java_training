import java.util.Scanner;
class SwitchCase{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Operations to perform: ");
        System.out.println("0. Exit");
        System.out.println("1. Vowel or Not");
        System.out.println("2. Minimum number of notes");
        System.out.println("3. Discount calculator");
        SwitchCase driver = new SwitchCase();
        int choice;
        while(true){
            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 0: System.exit(0);
                case 1: driver.isVowel(); break;
                case 2: driver.findNotes(); break;
                case 3: driver.findCostPrice(); break;
                default: System.out.println("Invalid Input"); break;
            }
        }
        
    }

    public void isVowel(){
        System.out.println("Enter a character: ");
        char c = sc.next().charAt(0);
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': System.out.println("The following character is a vowel"); break;
            default: System.out.println("The following character is a consonant"); break;
        }
    }

    public void findNotes(){
        System.out.println("Enter the amount that needs to be withdrawn: ");
        int amount = sc.nextInt();
        System.out.println("Enter the highest value: ");
        int range = sc.nextInt();
        int noteCount;
        switch(range){
            case 2000:  noteCount = amount / 2000;
                        amount = amount % 2000; 
                        System.out.println("The number of 2000 ruppee notes is " + noteCount);
            case 500:  noteCount = amount / 500;
                        amount = amount % 500; 
                        System.out.println("The number of 500 ruppee notes is " + noteCount);
            case 200:  noteCount = amount / 200;
                        amount = amount % 200; 
                        System.out.println("The number of 200 ruppee notes is " + noteCount);
            case 100:  noteCount = amount / 100;
                        amount = amount % 100; 
                        System.out.println("The number of 100 ruppee notes is " + noteCount);
            case 50:  noteCount = amount / 50;
                        amount = amount % 50; 
                        System.out.println("The number of 50 ruppee notes is " + noteCount);
            case 20:  noteCount = amount / 20;
                        amount = amount % 20; 
                        System.out.println("The number of 20 ruppee notes is " + noteCount);
            case 10:  noteCount = amount / 10;
                        amount = amount % 10; 
                        System.out.println("The number of 10 ruppee notes is " + noteCount);
            case 5:  noteCount = amount / 5;
                        amount = amount % 5; 
                        System.out.println("The number of 5 ruppee notes is " + noteCount);
            case 2:  noteCount = amount / 2;
                        amount = amount % 2; 
                        System.out.println("The number of 2 ruppee notes is " + noteCount);
            case 1:  noteCount = amount / 1;
                       amount = amount % 1; 
                        System.out.println("The number of 1 ruppee notes is " + noteCount);break;
        }
    }

    public void findCostPrice(){
        System.out.println("Is the user a student:(t/f)");
        char isStudent = sc.next().charAt(0);
        System.out.println("Enter the cost price: ");
        int cprice = sc.nextInt();
        double finalPrice;
        if(cprice > 500){
            if(isStudent == 't')
                finalPrice = 0.9 * cprice;
            else
                finalPrice = 0.92 * cprice;
        }
        else{
            if(isStudent == 't')
                finalPrice = 0.95 * cprice;
            else
                finalPrice  = 0.98 * cprice;
        }
        System.out.println("Discounted price: " + cprice);
    }
}
