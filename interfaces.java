
interface A {
    void show();
    void doSomething();
};
class B implements A {
    public void show() {
        System.out.println("Inshide B");
    };

    public void doSomething(){
        System.out.println("do something");
    };
}

public class interfaces {
    static public void main(String[] args) {
        B obj = new B();
        obj.doSomething();
        obj.show();
        
    }
}
