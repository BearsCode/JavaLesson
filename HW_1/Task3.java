// Реализовать простой калькулятор (+ - / *)

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        char operator;

        try {
            System.out.print("Введите первое число: ");
            num1 = scanner.nextInt();

            System.out.print("Введите второе число: ");
            num2 = scanner.nextInt();

            System.out.print("Введите оператор (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            switch (operator) {
                case '+':
                    System.out.println("Результат: " + add(num1, num2));
                    break;
                case '-':
                    System.out.println("Результат: " + subtract(num1, num2));
                    break;
                case '*':
                    System.out.println("Результат: " + multiply(num1, num2));
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Деление на ноль!");
                    }
                    System.out.println("Результат: " + divide(num1, num2));
                    break;
                default:
                    throw new IllegalArgumentException("Неверный оператор!");
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        scanner.close();
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
}

