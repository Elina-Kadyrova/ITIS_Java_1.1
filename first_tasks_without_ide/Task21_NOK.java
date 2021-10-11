import java.util.Scanner;
import java.util.Arrays;

public class Task21_NOK{

	public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Integer a = Integer.parseInt(str1);
        Integer b = Integer.parseInt(str2);
        int[] arr1 = new int[a];
        int[] arr2 = new int[b];
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
            arr1[i] = i;
            }
        }
        for (int j = 1; j <= b; j++) {
            if (b % j == 0) {
            arr2[j] = j;
            }
        }
        Integer max = a;
        if (b > max) {
            max = b;
        }
        for (int k = 1; k <= m; k++) {
            if
        }
    }
}