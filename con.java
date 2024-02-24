// if you want to call one constructor inside another you need to make use of this() keyword. There are 2 rules, first is the method should start with this() keyword also and we also cannot use more than one this() keyword in the same method.

public class con {
    con(int parentage) {
        int age = parentage;
        System.out.println(age);
    }
    
    con(String myname, int myage) {
        this(20);
       String name = myname;
       int age = myage;
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        con ob = new con("hari", 22);
    }
}
