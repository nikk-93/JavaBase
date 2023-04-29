import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//
// Пусть дан произвольный список целых чисел, удалить из него чётные числа
//
public class task1 {
    public static void main(String[] args) {
        var list = GetRandomList(10, 0, 10);
        System.out.println(list.toString());
        list.removeIf((item) -> {
            return item % 2 == 0;
        });
        System.out.println(list.toString());
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
