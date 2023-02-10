package Homework;

import java.util.Scanner;

/**
 * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = sc.nextInt();
        System.out.printf("Cумма треугольного числа: %d\n", summa(i));
        System.out.printf("Произведение треугольного числа: %d\n", proizv(i));
        sc.close();
    }

    public static int summa(int a) {
        return (a * (a + 1)) / 2;
    }

    public static int proizv(int b) {
        return ((b * (b + 1)) / 2) * 2;
    }
}
