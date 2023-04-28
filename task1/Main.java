package task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
 * название которых содержит «высший».
 */
public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("хлеб", 25, 2));
        products.add(new Product("высший хлеб", 35, 1));
        products.add(new Product("высший сорт муки", 55, 1));
        products.add(new Product("высший пончик", 35, 2));
        products.add(new Product("пончик", 30, 3));

        System.out.println("MaxPrice(products) = " + MaxPrice(products));
    }

    public static double MaxPrice(List<Product> products) {
        double maxPrice = 0;
        for (Product product : products) {
            if ((product.name.contains("высший")) && (product.grade == 1 || product.grade == 2)) {
                if (product.price > maxPrice) maxPrice = product.price;
            }
        }
        return maxPrice;
    }
}
