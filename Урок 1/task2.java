import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//
// Вывести все простые числа от 1 до 1000
//
public class task2 {
    public static void main(String[] args) {
        int n = 1000;
        System.out.println(Arrays.toString(sieveOfEratosthenes(n)));
    }

    public static Integer[] sieveOfEratosthenes(int n) {
        List<Integer> primesList = new ArrayList<Integer>();
        boolean[] primesBool = new boolean[n];

        Arrays.fill(primesBool, true);
        primesBool[0] = false;
        primesBool[1] = false;

        for (int i = 2; i < n; i++)
            if (primesBool[i] != false)
                for (int j = i; j * i < n; j++)
                    primesBool[i * j] = false;

        for (int i = 0; i < n; i++) {
            if (primesBool[i])
                primesList.add(i);
        }

        return primesList.toArray(new Integer[0]);
    }
}