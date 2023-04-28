package task3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А»
 * и год издания после 2010 г, включительно.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("автостопом по галактике", "Дуглас", 149, 2022, 640));
        books.add(new Book("война и мир", "Толстой", 280, 2022, 960));
        books.add(new Book("волхв", "Фаулз", 399, 2022, 733));
        System.out.println("FindBook(books) = " + FindBook(books));
    }

    public static ArrayList<String> FindBook (ArrayList<Book> books) {
        ArrayList<String> booksFound = new ArrayList<>();
        for (Book book : books) {
            if((book.secondName.contains("а")) && (book.year >= 2010) && (IsPrime(book.pages))) {
                booksFound.add(book.name);
            }
        }
        return booksFound;
    }
    public static boolean IsPrime(int n) {
        if (n <= 1) {
            return false;
        }
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                    if (j == n) return prime[j];
                }
            }
        }
        return prime[n];
    }
}
