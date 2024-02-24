// Abstraction hides the implementation details and shows only functionality to the user. Abstract keyword is used for this purpose.Also we cannot use private methods and private variables. multiple inheritence is also not supported.

abstract class ab {
    abstract void run();
}
// implementation methods hidden to user

class child1 extends ab {
    void run() {
        System.out.println("running child1");
    }
}

class child2 extends ab {
    void run() {
        System.out.println("running child2");
    }

}
class test{
    public static void main(String[] args) {
        ab ob = new child2();
        ob.run();
    }
}
