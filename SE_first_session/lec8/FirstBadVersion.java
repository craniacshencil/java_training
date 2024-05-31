import java.util.Scanner;
class FirstBadVersion{
    static int badVersion;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of systems: ");
        int total = sc.nextInt();
        System.out.println("Enter the bad version: ");
        badVersion = sc.nextInt();
        for(int i = 1; i <= 5; i++){
            System.out.println("For version " + i + ": " + isBadVersion(i));
        }
    }

    static boolean isBadVersion(int version){
        if(version >= badVersion)
            return true;
        else
            return false;
    }
}
