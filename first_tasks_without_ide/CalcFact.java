import java.util.Scanner;

public class CalcFact{
 
	public static void main(String[]args) {
        System.out.println("Enter number to get factorial");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Integer num = Integer.parseInt(str);

        long startTime1 = System.nanoTime();
        printFactRec(num);
        long recTime = System.nanoTime() - startTime1;
        System.out.println("Recursion method time: " + recTime); //время рекурсии

        long startTime2 = System.nanoTime();
        printFactLoop(num);
        long loopTime = System.nanoTime() - startTime2;
        System.out.println("Loop method time: " + loopTime); //время цикла
    }

    public static void printFactRec(int num) { //метод вывода через рекурсию
        int result;
        result = calcFactRec(num);
        if (result != -1) {
            System.out.println(result);
        }
        else {
            System.out.println("Bad operand");
        }
    }

    public static int calcFactRec(int num){ //метод подсчёта через рекурсию
        if (num < 0) {
            return -1;
        }
        if (num < 1) {
            return 1;
        }
        return calcFactRec(num - 1) * num;
    }

    public static void printFactLoop(int num) { //метод вывода через цикл
        int result;
        result = calcFactLoop(num);
        if (result != -1) {
            System.out.println(result);
        }
        else {
            System.out.println("Bad operand");
        }
    }

    public static int calcFactLoop(int num) { //метод посчёта через цикл
        if (num < 0) {
            return -1;
        }
        else {
            int fact = 1;
            for (int i = 0; i <= num; i++) {
                if (i == 0) {
                    fact = 1;
                }
                if (i > 0) {
                fact = fact * i;
                }
            }
            return fact;
        }
    }
}