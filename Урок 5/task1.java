import java.util.*;

public class task1 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("Введите:\n1 - Добавление номера\n2 - Вывод всего");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.println("Введите фамилию:");
                String name = scanner.nextLine();
                System.out.println("Введите номер:");
                String number = scanner.nextLine();
                if (phoneBook.containsKey(name)) {
                    ArrayList<String> numbers = phoneBook.get(name);
                    numbers.add(number);
                    phoneBook.put(name, numbers);
                } else {
                    ArrayList<String> numbers = new ArrayList<>();
                    numbers.add(number);
                    phoneBook.put(name, numbers);
                }
            } else if (choice == 2) {
                for (Map.Entry<String, ArrayList<String>> entry : phoneBook.entrySet()) {
                    String name = entry.getKey();
                    ArrayList<String> numbers = entry.getValue();
                    System.out.println(name + ": " + String.join(", ", numbers));
                }
            } else {
                System.out.println("Некорректный ввод. Попробуйте еще раз.");
            }
        }
    }
}