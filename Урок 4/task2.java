import java.util.LinkedList;
import java.util.Random;

//
// Реализуйте очередь с помощью LinkedList
//
public class task2 {
    public static void main(String[] args) {
        var linkedList = GetRandomList(10, 0, 11);
        System.out.println(linkedList.toString());
        Enqueue(linkedList, 8);
        System.out.println(linkedList.toString());
        System.out.println(Dequeue(linkedList));
        System.out.println(linkedList.toString());
        System.out.println(First(linkedList));
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

    public static void Enqueue(LinkedList<Integer> list, Integer n) {
        list.addLast(n);
    }

    public static Integer Dequeue(LinkedList<Integer> list) {
        var n = First(list);
        list.removeFirst();
        return n;
    }

    public static Integer First(LinkedList<Integer> list) {
        return list.getFirst();
    }

}
