//
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
//

import java.util.LinkedList;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        var linkedList = GetRandomList(10, 0, 11);
        System.out.println(linkedList.toString());
        linkedList = reverseLinkedList(linkedList);
        System.out.println(linkedList.toString());
    }

    public static LinkedList<Integer> GetRandomList(Integer n, Integer from, Integer to) {

        LinkedList<Integer> list = new LinkedList<Integer>();

        Random r = new Random();

        for (int i = 0; i < n; i++) {
            list.add(r.nextInt(from, to + 1));
        }

        return list;

    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

}
