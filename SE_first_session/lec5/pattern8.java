// ABCD
// EFGH
// IJKL
// MNOP
class pattern7{
    public static void main(String args[]){
        int counter = 65;
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4; j++){
                System.out.print((char)counter);
                counter++;
            }
            System.out.println();
        }
    }
}
