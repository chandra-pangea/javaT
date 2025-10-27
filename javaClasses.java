class Calculator {
    public int add(int num1, int num2) {
        System.out.println("inshide add");
        return num1 + num2;

    };
}

class Computer {
    public void playMusic() {
        System.out.println("music plying");
    }
}

public class javaClasses {
    public static void main(String a[]) {
        int num1 = 10;
        int num2 = 20;
        Calculator calc = new Calculator();
        Computer com = new Computer();
        com.playMusic();
        int result = calc.add(num1,num2);
        System.out.println(result);
    }
}
