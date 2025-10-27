class Mobile {
    String name;
    int price;
    static String brand;
    static {
        brand = "Unknown";// static block to initialize static variable it will run only once when class is loaded in memory
    }

    public void show() {
        System.out.println(name);
        System.out.println(price);
        System.out.println(brand);
    }
}

public class string {
    public static void main(String[] args) {
        // String name = "Harry";
        // System.out.println(name.charAt(0));
        // int value = name.length();
        // System.out.println(value);

        // String s1="NAME";
        // String s2="NAME";



        // // String methods
        // String s = "   Hello World   ";
        // System.out.println(s.trim()); // "Hello World"  
        // System.out.println(s.substring(3, 7)); // "lo W"
        // System.out.println(s.replace('H', 'J')); // "Jello World"
        // System.out.println(s1.compareTo(s2));// 0
        // System.out.println(s1+s2); // "NAME NAME"
        // System.out.println(s1.concat(s2)); // "NAME NAME"
        // System.out.println(s1.contains("ME")); // true
        // System.out.println(s1.indexOf("ME")); // 2
        // System.out.println(s1.lastIndexOf("M")); // 2
        // System.out.println(s1.startsWith("NA")); // true
        // System.out.println(s1.endsWith("ME")); // true
        // System.out.println(s1.isEmpty()); // false
        // System.out.println(s1.toLowerCase());// "name"
        // System.out.println(s1.toUpperCase());// "NAME"
        // System.out.println(s1.equals(s2));// true
        // System.out.println(s1.equalsIgnoreCase(s2));// true 


        // // Escape sequences in strings        System.out.println("Hello\nWorld"); // New line
        // System.out.println("Hello\tWorld"); // Tab
        // System.out.println("Hello\\World"); // Backslash
        // System.out.println("Hello\"World\""); // Double quote


        //  String buffer
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        // System.out.println(sb); // "Hello World"
        // System.out.println(sb.length()); // 11
        // System.out.println(sb.capacity()); // 16
        // sb.insert(5, ",");// "Hello, World"
        // System.out.println(sb); // "Hello, World"
        // sb.replace(5, 6, "!");// "Hello! World"
        // System.out.println(sb); // "Hello! World"
        // sb.delete(5, 6);
        // System.out.println(sb); // "Hello World"
        // sb.reverse();
        // System.out.println(sb); // "dlroW olleH"
        Mobile m1 = new Mobile();
        m1.name = "iPhone";
        m1.price = 999;
        Mobile.brand = "Apple";

        Mobile m2Mobile = new Mobile();
        m2Mobile.name = "Samsung Galaxy";
        m2Mobile.price = 899;
        Mobile.brand = "Samsung";

        m1.show();
        m2Mobile.show();

    }
}
