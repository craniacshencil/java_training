// ABCD
// EFGH
// IJKL
// MNOP
class pattern12{
    public static void main(String args[]){
        int counter = 1;
        for(int i = 1; i <= 4; i++){
            int sum = 0;
            for(int j = 1; j <= 4; j++){
                sum += counter;
                System.out.print(counter + " ");
                counter++;
            }
            System.out.print(sum);
            System.out.println();
        }
    }
}
