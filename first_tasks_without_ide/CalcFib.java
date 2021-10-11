import java.util.Scanner;

public class CalcFib {
 
	public static void main(String[]args) {
        System.out.println("Enter number of Fibonacci numbers");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = Integer.parseInt(str);
        int [] numbers = new int[num];

        long startTime1 = System.nanoTime();
        printFibRec(num);
        long recTime = System.nanoTime() - startTime1;
        System.out.println("Recursion method time: " + recTime); //время рекурсии

        long startTime2 = System.nanoTime();
        printFibLoop(num, numbers);
        long loopTime = System.nanoTime() - startTime2;
        System.out.println("Loop method time: " + loopTime); //время цикла
    }

    public static void printFibRec(int num) { //метод вывода через рекурсию
        int result;
        result = calcFibRec(num);
        if (result != -1) {
            System.out.println(result);
        }
        else {
            System.out.println("Bad operand");
        }
    }

    public static void printFibLoop(int num, int [] numbers) { //метод вывода через цикл
        int result;
        result = calcFibLoop(num,numbers);
        if (result != -1) {
            System.out.println(result);
        }
        else {
            System.out.println("Bad operand");
        }
    }

    public static int calcFibRec(int num) { //метод подсчёта через рекурсию
        if (num < 1) {
            return -1;
        }
        if (num == 1 || num == 2) {
            return 1;
        }
        return calcFibRec(num - 1) + calcFibRec(num - 2);
    }

    public static int calcFibLoop(int num, int [] numbers) { //метод подсчёта через цикл
        if (num < 1) {
            return -1;
        }
        if (num == 1 || num == 2) {
            numbers [0] = 1;
            numbers [1] = 1;
            return 1; 
        }
        else {
            numbers [0] = 1;
            numbers [1] = 1;
            for (int i = 2; i < num; i++) {
                numbers [i]  = numbers [i - 1] + numbers [i - 2];
            }
            return numbers[num - 1];
        }
    }
}