import java.util.*;
class StockSpanProblem{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter the number of stocks: ");
        int noOfStocks = sc.nextInt();
        int stocks[] = new int[noOfStocks];
        int span[] = new int[noOfStocks];
        span[0] = 1;
        for(int i = 0; i < noOfStocks; i++){
            stocks[i] = sc.nextInt();
        }
        for(int j = 1; j < noOfStocks; j++){
            if(stocks[j] <= stocks[j - 1])
                span[j] = 1;
            else
                span[j] = 8;
        }
        System.out.println(Arrays.toString(span));
// = operator -> int a = 1000; assignment operator
// == operatior -> a == 1000; true -> a == 500; false
// userName == "parth" => true
// if(true){
// }

    }
}
