package Homework;
import java.util.Scanner;
/*калькулятор есть 2 числа и кейсы + - * / */
public class hw_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int i = scan.nextInt();
        System.out.println("Введите второ число ");
        int j = scan.nextInt();
        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scan.next().charAt(0);
        scan.close();
        int output;
        switch (operator) {
            case '+':
                output = i + j;
                break;
            case '-':
                output = i - j;
                break;
            case '*':
                output = i * j;
                break;
            case '/':
                output = i / j;
                break;
            /*
             * Если пользователь вводит любой другой оператор или символ, кроме
             * +, -, * и /, затем отобразит сообщение об ошибке пользователю
             *
             */
            default:
                System.out.printf("Вы ввели неверного оператораr");
                return;
        }
        System.out.println(i + " " + operator + " " + j + " = " + output);
    }
}