enum Status {
    Running, Pending, Reached;
}

enum Laptop {
    MacBook(2000),
    XPS(1800),
    Surface(1500),
    Thinkpad(1200);

    private int price;

    // Constructor for enum
    private Laptop(int price) {
        this.price = price;
    }

    // Getter method
    public int getPrice() {
        return price;
    }

    // Example static methods (optional)
    public static Laptop getMacBook() {
        return MacBook;
    }

    public static Laptop getXPS() {
        return XPS;
    }

    public static Laptop getSurface() {
        return Surface;
    }

    public static Laptop getThinkpad() {
        return Thinkpad;
    }
}

public class enim {
    public static void main(String[] args) {
        Status s = Status.Pending;
        System.out.println("Status: " + s);

        // Example usage of Laptop enum
        for (Laptop l : Laptop.values()) {
            System.out.println(l + " : $" + l.getPrice());
        }

        // Access a specific one
        System.out.println("MacBook Price: " + Laptop.MacBook.getPrice());
    }
}
