import java.util.Scanner;
import java.util.Arrays;

public class Task27_SubarraySearch{
 

	public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];  
        int k;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2 + (int)(Math.random()*(30-2)); 
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--)
                if (arr[j-1] > arr[j]) {
                    k = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = k;
                }
        }
        System.out.println(Arrays.toString(arr));
        Long a = 1L;
        for (int j = 0; j < arr.length; j++) {
            a = a * arr[j];
        }
        Double geo = Math.pow(a, 1.0/10);
        System.out.println(Math.round(geo*100.00)/100.00);
    }
}