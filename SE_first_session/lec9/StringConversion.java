class StringConversion{
    public static void main(String args[]){
        String str1 = "craniacshencil";
        StringBuffer sb = new StringBuffer(str1);
        System.out.println(str1);

        StringBuffer sb2 = new StringBuffer("craniacshencil");
        String str2 = sb2.toString();
    }
}
