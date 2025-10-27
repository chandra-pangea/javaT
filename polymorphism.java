class A {

    public void show() {
        System.out.println("in A show function");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show function");
    }
}

// Final class can't inherited
final class C extends A {
    //final method can't be overited in any inherited class
    public final void show() {
        System.out.println("in C show function");
    } 
}


public class polymorphism {
    public static void main(String[] Args) {

        final int num = 10;// final variable value you can't change
        System.out.println(num);
        A objA = new A();
        objA.show();

        B objB = new B();
        objB.show();

        C objC = new C();
        objC.show();
  }
    
}
