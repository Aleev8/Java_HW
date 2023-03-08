package sem1;
//Вычислить n-ое треугольного число(сумма чисел от 1 до n),
// а так же n! (произведение чисел от 1 до n)
//        Ввод:5
//        Треугольное число 1 + 2 + 3 + 4 + 5 = 15
//        n! 1 * 2 * 3 * 4 * 5 = 120
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", giveMeThreeNumber(num));
        System.out.printf("n!: %d\n", giveMeFactNumber(num));
        iScanner.close();
    }

    public static int giveMeThreeNumber(int three) {
        return (three * (three + 1)) / 2;
    }
    public static int giveMeFactNumber(int fact) {
        if (fact <= 2) {
            return fact;
        }
        return fact * giveMeFactNumber(fact - 1);
    }
}
