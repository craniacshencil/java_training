//    *
//   ***
//  *****
// *******
class pattern5{
    public static void main(String args[]){
        for(int i = 1; i <= 4; i++){
            for(int k = i; k < 4; k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2 * i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
