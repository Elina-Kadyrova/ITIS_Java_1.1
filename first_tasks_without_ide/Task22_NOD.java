import java.util.Scanner;

public class Task22_NOD{


	public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 2 numbers. The program will display the Greatest Common Divisor of entered numbers by enumeration method and by Euclid's method.");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println();
        Integer a = Integer.parseInt(str1);
        Integer b = Integer.parseInt(str2);
        int k;
        long startTime1 = System.currentTimeMillis();//Нахождение НОД методом перебора
        System.out.println("Enumeration method start time: " + startTime1);
        if (a > b) {
            k = a;
            a = b;
            b = a;
        }
        for (int i = a; i > 0; i--) {
            if (a % i == 0) {
                if (b % i == 0) {
                    System.out.println("GCD = " + i);
                    break;
                }
            }
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Enumeration method end time: " + endTime1);
        System.out.println("Finding the GCD by enumeration method took " + (endTime1 - startTime1) + " milliseconds");
        long startTime2 = System.currentTimeMillis();//Нахождение НОД методом Евклида
        System.out.println("Euclid's method start time: " + startTime2);
        while ((a != 0) & (b != 0)) {
            if (a > b) {
            a = a % b;
            }
            else {
                b = b % a;
            }
        }
        System.out.println("GCD = " + (a+b));
        long endTime2 = System.currentTimeMillis();
        System.out.println("Euclid's method end time: " + endTime2);
        System.out.println("Finding the GCD by Euclid's method took " + (endTime2 - startTime2) + " milliseconds");
        if ((endTime2 - startTime2) < (endTime1 - startTime1)) {
            System.out.println("Euclid's method is faster for " + (((endTime1 - startTime1) - (endTime2 - startTime2)) + " milisseconds"));
        }
        else {
            if ((endTime2 - startTime2) > (endTime1 - startTime1)) {
                System.out.println("Enumeration method is faster for " + ((endTime2 - startTime2) - (endTime1 - startTime1)) + " milisseconds");
            }
            else {
                System.out.println("The methods take the same amount of time"); 
            }
        }
    }
}