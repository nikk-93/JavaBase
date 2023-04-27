import java.util.Arrays;
import java.util.Scanner;

//
// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.
//
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите элементы через пробел: ");
        var arr_str = scanner.nextLine().split(" ");
        scanner.close();
        int[] arr = new int[arr_str.length];
        for (int i = 0; i < arr_str.length; i++) {
            arr[i] = Integer.parseInt(arr_str[i]);
        }
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int n = 1;
        while (n < arr.length) {
            for (int i = 0; i < arr.length - n; i++) {
                if (arr[i] > arr[i + 1]) {
                    var tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
            n++;
        }
    }
}
