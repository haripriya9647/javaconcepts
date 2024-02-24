// when you have multiple methods with same name but diff parameters it called method overloading.

class methodoverloading {
    static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }
    
    static int add(int x, int y,int z) {
        int sum = x + y +z;
        return sum;
    }

}

class Test {
    public static void main(String[] args) {
        System.out.println(methodoverloading.add(1, 1));
        System.out.println(methodoverloading.add(1, 1,1));
    }
}
