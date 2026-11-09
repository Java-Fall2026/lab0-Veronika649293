package ua.university;

public class BasicOperators {

    /**
     * Додавання двох чисел із перевіркою переповнення.
     */
    public static int add(int a, int b) {
        try {
            return Math.addExact(a, b);
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Переповнення при додаванні", e);
        }
    }

    /**
     * Ділення a на b.
     */
    public static double divide(double a, double b) {
        if (b == 0.0) {
            throw new IllegalArgumentException("Ділення на нуль неможливе");
        }
        return a / b;
    }

    /**
     * Обчислення факторіалу (n!).
     */
    public static long factorial(int n) {
        if (n < 0 || n > 20) { 
            throw new IllegalArgumentException("Параметр n має бути в межах від 0 до 20");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Перевірка числа на парність.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Пошук максимального елемента в масиві.
     */
    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Масив не може бути null або порожнім");
        }
        int max = array[0];
        for (int val : array) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    /**
     * Середнє арифметичне елементів масиву.
     */
    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Масив не може бути null або порожнім");
        }
        double sum = 0;
        for (int val : array) {
            sum += val;
        }
        return sum / array.length;
    }
}