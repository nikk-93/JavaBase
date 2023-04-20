//
// Вычислить n-ое треугольного число (сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n)
//

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
        int n = 0;
        System.out.println(GetTriangularNumber(n));
        System.out.println(GetFactorial(n));
    }

    public static int GetTriangularNumber(int n) {
        return (int) (0.5 * n * (n + 1));
    }

    public static int GetFactorial(int n) {
        int factorial = 1;

        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}