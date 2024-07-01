class myGeneric <A>{
    private A data;

    public myGeneric(A value) {
        data = value;
    }

    public A getData(){
        return data;
    }

    public String mulitply(int t){
        retStr = "";
        for(int i = 0; i < t; i++) {
            retStr += data + "\n";
        }
        return retStr;
    }
    
    public int mulitply(int t){
}
