package ru.kpfu.itis.tasks.task_V;

public class App {
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        if (n < 1) {
            System.out.println("Error: invalid value of variable n");
        }
        else {
            System.out.println("The number " + n + " in the Fibonacci series is " + calculateFibNum(n)); //вывод числа ряда Фибоначчи
        }
    }

    public static int calculateFibNum(int n) { //метод подсчёта через рекурсию
        if (n == 1 || n == 2) {
            return 1;
        }
        return calculateFibNum(n - 1) + calculateFibNum(n - 2);
    }
}
