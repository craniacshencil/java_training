class personClass {
    public String name;
    public int age; 

    public personClass(String name, int age) {
        this.name = name;
        this.age= age;
    }

    public void greet() {
        System.out.println("My name is " + name + " and my age is " + age);
    }
}
