package task3;

public class Book {
    String name;
    String secondName;
    double price;
    int year;
    int pages;

    public Book(String name, String secondName, double price, int year, int pages) {
        this.name = name;
        this.secondName = secondName;
        this.price = price;
        this.year = year;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", pages=" + pages +
                '}';
    }
}
