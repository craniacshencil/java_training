class personCollection {
    public static void main(String args[]) {
        String wantedName = "Kate";
        personClass[] personArr = {
            new personClass("John", 23),
            new personClass("Jane", 25),
            new personClass("Steve", 33),
            new personClass("Martin", 23),
            new personClass("Alex", 13),
            new personClass("Kate", 37),
            new personClass("Will", 23),
            new personClass("James", 31),
        };

        int recCount = 0;
        for (personClass person: personArr) {
            if (person.name == wantedName) {
                person.greet();
                recCount++;
            }
        }
        System.out.println(recCount + "record(s) found");
    }
}
