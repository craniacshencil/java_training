class StringInit{
    public static void main(String args[]){
        String str = "craniacshencil";
        System.out.println(str);

        String str1 = new String("craniacshencil");
        System.out.println(str1);

        char ch[] = {'c', 'r', 'a', 'n', 'i', 'a', 'c', 's', 'h', 'e', 'n', 'c', 'i', 'l'};
        String str2 = new String(ch);
        System.out.println(str2);

        String str3 = new String(ch, 0, 7);
        System.out.println(str3);
        
        byte ascii[] = {67, 65, 66, 69, 75};
        String str4 = new String(ascii);
        System.out.println(str4);
        

    }
}
