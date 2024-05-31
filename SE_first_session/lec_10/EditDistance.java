class EditDistance{
// make changes in s to match t
    public static void main(String args[]){
        String s = "ycce";
        String s2 = "ycsce";
        char c1[] = s.toCharArray();
        char c2[] = s2.toCharArray();
        int modifications = 0;
  
        int longerLength = c1.length >= c2.length? c1.length : c2.length;
        int sameLength = c1.length == c2.length? true : false;
        for(int i = 0; i < longerLength; i++){
            if(c1[i] != c2[i]){
                //replace
                if((c1[i + 1] == c2[i]) && sameLength){
                    char temp = c1[i];
                    c1[i] = c1[i + 1];
                    c[i + 1] = c1[i];
                }




                

            }

        }
        System.out.println("The Number of modifications is: " + modifications);

    }
}
