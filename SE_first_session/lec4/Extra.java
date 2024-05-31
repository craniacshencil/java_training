import java.util.Scanner;
class Extra{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        Extra driver = new Extra();
        driver.palindromes();
//         driver.series();
    }
    public void palindromes(){
        int rem,rev, temp;
        for(int i = 1; i <= 9999; i++){
            temp = i;
            rev = 0;
            while(temp > 0){
                 rem = temp % 10;
                 rev = rev * 10 + rem;
                temp = temp / 10;
            }
            if(i == rev)
                System.out.print(i + "\t");
        }
    }
    public void series(){
        System.out.println("Enter term no: ");
        int n = sc.nextInt();
        int num = 2;
        int term;
        for(int i = 1; i <= n; i++){
            System.out.println(num);
            num = i * num + i;
        }
    }
}
