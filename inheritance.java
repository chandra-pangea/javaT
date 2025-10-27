class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

// Single Inheritance
class AdvancedCalculator extends Calculator {
    public AdvancedCalculator() {
        System.err.println("AdvancedCalculator initialized");
    }

    public AdvancedCalculator(int initialValue) {
        System.err.println("Initial value: " + initialValue);
    }
    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }
}

// Multi-level Inheritance
class SuperCalculator extends AdvancedCalculator {
    public SuperCalculator() {
        System.err.println("SuperCalculator initialized");
    }

    public SuperCalculator(int initialValue) {
        this();
        System.err.println("SuperCalculator initial value: " + initialValue);
    }


    public int power(int a, int b) {
        return (int) Math.pow(a, b);
    }
}

public class inheritance {
    public static void main(String[] args) {

        SuperCalculator obj1 = new SuperCalculator(5);
        double d = obj1.divide(5, 6);
        int m = obj1.multiply(4, 4);
        int s = obj1.add(1, 1);
        int sub = obj1.subtract(4, 2);
        int pow = obj1.power(2, 3);
        System.out.println("division: " + d);
        System.out.println("multiplication: " + m);
        System.out.println("addition: " + s);
        System.out.println("subtraction: " + sub);
        System.out.println("power: " + pow);
        System.out.println("All inheritance types demonstrated.");
    }
}
