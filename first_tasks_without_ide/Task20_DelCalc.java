import java.util.Scanner;

public class Task20_DelCalc {

	public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number. The program will display the number of divisors of the entered number.");
        String str = sc.nextLine();
        Integer a = Integer.parseInt(str);
        System.out.println();
        for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                System.out.println(i);
            }
        }
    }
}