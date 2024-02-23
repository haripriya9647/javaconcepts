public class con {
    String name;
    int age;
    
    con(String myname, int myage) {
        this.name = myname;
        this.age = myage;
    }
    
    void display() {
        System.out.println(name  + " " + age);
    }
    public static void main(String[] args) {
        con ob = new con("hari", 22);
        con ob1 = new con("hari", 22);
        ob.display();
        ob1.display();
    }
}
