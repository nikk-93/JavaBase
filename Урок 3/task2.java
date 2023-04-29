
//
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
//

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Integer sumElement = 0;
        Integer maxElement = 0;
        Integer minElement = 0;
        var list = GetRandomList(10, 0, 10);
        System.out.println(list.toString());
        for (Integer i = 0; i < list.size(); i++) {
            if (maxElement < list.get(i))
                maxElement = list.get(i);
            if (minElement > list.get(i))
                minElement = list.get(i);
            sumElement += list.get(i);
        }

        System.out.printf("Минимальное: %d", minElement);
        System.out.println();
        System.out.printf("Среднее: %d", sumElement / list.size());
        System.out.println();
        System.out.printf("Максимальное: %d", maxElement);
        System.out.println();
    }

    public static List<Integer> GetRandomList(Integer n, Integer from, Integer to) {

        List<Integer> list = new ArrayList<Integer>();

        Random r = new Random();

        for (int i = 0; i < n; i++) {
            list.add(r.nextInt(from, to + 1));
        }

        return list;

    }

}
