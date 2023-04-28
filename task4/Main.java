package task4;
/**
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = RandomList(-10, 10, 5);
        System.out.println(list);
        FindMinMaxEven(list);
    }

    public static void FindMinMaxEven(ArrayList<Integer> list) {
        int min = list.get(0);
        int max = list.get(0);
        int sum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            sum += list.get(i);
            if (list.get(i) < min) min = list.get(i);
            else if (list.get(i) > max) max = list.get(i);
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("even = " + (double)sum / list.size());

    }
    public static int RandomNum(int min, int max) {
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        return randomNum;
    }
    public static ArrayList<Integer> RandomList(int min, int max, int lenght) {
        ArrayList<Integer> list = new ArrayList<>(lenght);
        for (int i = 0; i < lenght; i++) {
            list.add(RandomNum(min, max));
        }
        return list;
    }
}
