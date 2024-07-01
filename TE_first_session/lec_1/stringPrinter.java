class stringPrinter {
    public static void main(String args[]) {
        String[] stringArr = {"hello", "how", "are", "you", "rishi", "will", "you", "even", "notice", "this", "while", "copying"};
        for(String element: stringArr) {
            if(element.length() < 5) continue;
            System.out.println(element);
        }
    }
}
