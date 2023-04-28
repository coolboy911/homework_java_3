package task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("coffee", "africa", 0.7, 349, 1));
        list.add(new Product("tea", "africa", 0.5, 79, 2));
        list.add(new Product("chocolate", "belgium", 0.5, 150, 1));
        list.add(new Product("cola", "usa", 1.5, 150, 1));
        list.add(new Product("baikal", "russia", 1.5, 110, 3));
        list.add(new Product("cookies", "russia", 1, 69, 3));

        System.out.println("Cheapest(list, 3) = " + Cheapest(list, 3));
    }
    public static String Cheapest(List<Product> list, int grade) {
        Double lowestPrice = null;
        String lowestPriceName = null;

        for (Product product : list) {
            if (product.grade == grade) {
                if ((lowestPrice == null) || (product.price < lowestPrice)) {
                    lowestPrice = product.price;
                    lowestPriceName = product.name;
                }
            }
        }
        return lowestPriceName;
    }
}
