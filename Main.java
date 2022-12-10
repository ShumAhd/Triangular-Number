/**
 * Программа вычисления n-ого треугольного числа.
 */
public class Main {
    public static void main(String[] args) {
        // Введите n для вычесления треугольного числа
        int n = 7;
        int result = model.triangularNumber(n);
        System.out.printf("Треугольное число от " + n + " = " + result + "\n");
    }
    class model {
        // высчитываем формулу
        static int triangularNumber(int n) {
            int resultNum = ((n + 1) * n) / 2;
            return resultNum;
        }
    }
}
