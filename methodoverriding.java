class methodoverridingparent {
    void run() {
        System.out.println("This is parent class");
    }
}




class methodoverriding extends methodoverridingparent{
    
    void run() {
        System.out.println("This is child class");
    }
    public static void main(String[] args) {
        methodoverriding ob = new methodoverriding();
        ob.run();
    }
}


