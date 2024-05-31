import java.util.Scanner;
class Student{
    static Scanner sc = new Scanner(System.in);
    int i = 0;
    int sid[] = new int[100];
    String sname[] = new String[100];
    long sphone[] = new long[100];
    char sdiv[] = new char[100];
    public void create(){
        System.out.println("For student No. " + i);
        System.out.println("Enter id: ");
        sid[i] = sc.nextInt();
        System.out.println("Enter Name: ");
        sname[i] = sc.next();
        System.out.println("Enter Phonenumber: ");
        sphone[i] = sc.nextLong();
        System.out.println("Enter Division: ");
        sdiv[i] = sc.next().charAt(0);
        i++;
        System.out.println(i);
    }

    public void read(){
       System.out.println("Data of Students");
       System.out.println("|Id\t|Name\t|Phonenumber\t|Division|");
       System.out.println("--------------------------------------------------");
       for(int j = 0; j < i; j++){
        System.out.println(sid[j] + "\t" + sname[j] + "\t" + sphone[j] + "\t" + sdiv[j]);
       }
    }

    public void update(){
        System.out.println("Enter id of student to be updated: ");
        int id = sc.nextInt();
        System.out.println("i: " + i);
        for(int k = 0; k <= i; k++){
            System.out.println(sid[k]);
            if(sid[k] == id){
                System.out.println("name: " + sname[k] + "\tPhonenumber: " + sphone[k] + "\tDivision" + sdiv[k]);
                System.out.println("What do you want to change");
                System.out.println("1. Change name: ");
                System.out.println("2. Change Phonenumber: ");
                System.out.println("3. Change Division: ");
                int choice;
                System.out.println("Enter your choice: ");
                choice = sc.nextInt();
                switch(choice){
                    case 1: 
                    System.out.println("Enter new name: ");
                    sname[k] = sc.next();
                    break;

                    case 2:
                    System.out.println("Enter new phone");
                    sphone[k] = sc.nextLong();
                    break;

                    case 3:
                    System.out.println("Enter new division: ");
                    sphone[k] = sc.next().charAt(0);
                    break;
                }
            }
        }
    }

    public void delete(){
        System.out.println("Enter id of student to be deleted: ");
        int id = sc.nextInt();
        for(int k = 0; k < i; k++){
            if(sid[k] == id){
                for(int l = k + 1; l < i; l++){
                    sid[l - 1] = sid[l];
                    sname[l - 1] = sname[l];
                    sphone[l - 1] = sphone[l];
                    sdiv[l - 1] = sdiv[l];
                }
                i--;
            }
        }
    }
}
class StudentCRUD{
    public static void main(String args[]){
        System.out.println("-=-= Student =-=-");
        System.out.println("0. Exit");
        System.out.println("1. Create");
        System.out.println("2. Read");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        int choice;
        Scanner sc = new Scanner(System.in);
        Student driver = new Student();
        while(true){
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 0: System.exit(0); 
                case 1: driver.create(); break;
                case 2: driver.read(); break;
                case 3: driver.update(); break;
                case 4: driver.delete(); break;
            }
        }
    }
}
