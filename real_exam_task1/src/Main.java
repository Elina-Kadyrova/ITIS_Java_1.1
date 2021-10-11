import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int [] numbers = new int [n];
        int [][] digits = new int [m][l];
        int num;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < l; k++) {
                    if (digits[j][k] == numbers[i]){
                        num = j;

                        }
                    }
                }

        }
    }
}
