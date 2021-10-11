import java.util.Scanner;

public class Task26_PascalTriangle{
 

	public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for printing the Pascal's triangle");
        String str = sc.nextLine();
        Integer n = Integer.parseInt(str);
        if (n < 0) {
            System.out.println("There must be at least 1 line");
        }
        else{
            int length = (int)(Math.log10(n * n) + 1) + 2;
            for (int i = 0; i < n; i++) {
                int num = 1;
                System.out.printf("%" + (n - i) * 2 + "s", "");
                for (int j = 0; j <= i; j++) {
                    System.out.printf("%" + length + "d", num);
                    num = num * (i - j) / (j + 1);
                }
                System.out.println();
            }
        }
    }
}