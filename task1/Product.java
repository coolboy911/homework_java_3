package task1;

public class Product {
    String name;
    double price;
    int grade;

    public Product(String name, double price, int grade) {
        this.name = name;
        this.price = price;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", grade='" + grade + '\'' +
                '}';
    }
}
