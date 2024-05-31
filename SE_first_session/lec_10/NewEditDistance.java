class NewEditDistance{
    public static void main(String args[]){
        String s = "ycce";
        String t = "yctce";
        int output = 0;
        int count = 0;
        int sLength = s.length();
        int tLength = t.length();
        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();
        if(sLength < tLength)
            output = tLength - sLength;
        else if(sLength > tLength)
            output = sLength - tLength;
        else{
            for(int i = 0; i < sLength; i++){
                if(ch1[i] != ch2[i])
                    output++;
            }
        }
        System.out.println("The minimum number of changes is: " + output);
    }
}
