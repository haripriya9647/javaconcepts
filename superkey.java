// Usually when we have methods with same name in parent and child class soo the child class overrides the parent method and in this method the variables , methods and constructors also gets hidden of parent class. But you still have a way to access them i.e by using super keyword.


class superkeyparent {
    void run() {
        System.out.println("This is parentclass");
    }
 }

 class superkey extends superkeyparent {
    void run()
    {
        System.out.println("This is childclass");
        super.run();

    }
    
    public static void main(String[] args) {
        superkey ob = new superkey();
        ob.run();
        
    }
}
