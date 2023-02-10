package Homework;
import java.util.Scanner;
/**
 * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! 
 */
public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int i = sc.nextInt();
        System.out.printf("Треугольное число: %d\n", giveMeNumber(i));
        sc.close();
    }
    public static int giveMeNumber(int a) {
        return (a * (a + 1)) / 2;
    }
}
