import java.util.Scanner;

//
// Реализовать простой калькулятор
//
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1-е число: ");
        int n1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите операцию: ");
        String operation = scanner.nextLine();
        System.out.print("Введите 2-е число: ");
        int n2 = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.print("Ответ: ");
        System.out.println(ExecOperation(n1, n2, operation));
    }

    public static double ExecOperation(int n1, int n2, String operation) {
        switch (operation) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                return (double) n1 / n2;
            default:
                return 0d;
        }
    }
}