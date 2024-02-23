public class staticblock {
    public static void main(String[] args) {
        Mobile sb = new Mobile();
        sb.show();
    }
}

class Mobile {
    String brand = "";
    int price = 0;
    static String name;

    //If you dont keep var name inside static block this name varibale will keep executing everytime a new object is created. But if you keep your name variable inside static block this block will load when the class loads and also static block gets executed first before constructor.

    static {
        name = "Phone";
    }

    public void show(){
        System.out.println(brand + ":" + price + ":" +name);
    }
}
