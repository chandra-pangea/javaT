
class A {
    public void console() {
        System.out.println("Print");
    }

    class B {
        public void console() {
            System.out.println("inshide b");
        }
    }
}

public class innerClass {
    public static void main(String[] args) {
        
        A obj = new A();
        obj.console();
        A.B obj2 = obj.new B();
        obj2.console();

    }    
}
