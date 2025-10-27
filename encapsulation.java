public class encapsulation {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 80000, "Dell");
        p1.show();

        Product p2 = new Product("Smartphone", 50000, "Samsung");
        p2.show();

        // Modifying product details using setter methods
        p1.setPrice(75000);
        Product.setBrand("HP"); // Changing brand for all products
        System.out.println("\nAfter updating product details:");
        p1.show();
        p2.show();
       
    }
}

class Product {
    private String name;
    private int price;
    public String address;
    private static String brand;

    // Constructor
    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }
    // this keyword is used to refer to the current object instance variable implementation
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static String getBrand() {
        return brand;
    }

    public static void setBrand(String brand) {
        Product.brand = brand;
    }

    // Method to display product details
    public void show() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
        System.out.println("Product Brand: " + brand);
    }
}