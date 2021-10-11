import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (k <= 2) {
                int num = sc.nextInt();
                if (evenNumCount(num) % 2 == 0) {
                    int v = numCount(factorial(num));
                    if ((numCount(v) == evenNumCount(v)) | (evenNumCount(v) == 0)){
                        k+=1;
                    }
                }
            }
            else break;
        }
        if (k == 2){
            System.out.println("2");
        }
        else {
            System.out.println("not 2 :(");
        }
    }

    public static int evenNumCount(int num) {
        int count = 0;
        while (num > 0) {
            if ((num / 2) == 0) {
                count += 1;
            }
            num /= 10;
        }
        return count;
    }

    public static int factorial(int num) {
        if ((num == 0) | (num == 1)) {
            return num;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static int numCount(int num) {
        int count = 0;
        while (num > 0) {
            count += 1;
            num /= 10;
        }
        return count;
    }
}