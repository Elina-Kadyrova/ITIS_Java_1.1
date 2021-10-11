import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int n = 2;
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        boolean result1;
        for (int i = 0; i < arr.length - 1; i++) {
            String str1 = arr[i];
            String str2 = arr[i + 1];
            char[] str1ToArray = str1.toCharArray();
            char[] str2ToArray = str2.toCharArray();
            result1 = true;
            for (int j = 0; j < str1ToArray.length - 1; j++) {
                for (int k = 0; k < str2ToArray.length; k++) {
                    if (str1ToArray[j] == str2ToArray[k]) {
                        result1 = false;
                        break;
                    }
                }
            }
            System.out.println(result1);
        }


        boolean result2;
        int[] boolmas = new int[26];
        for (int i = 0; i < arr.length - 1; i++) {
            String str1 = arr[i];
            String str2 = arr[i + 1];
            char[] str1ToArray = str1.toCharArray();
            char[] str2ToArray = str2.toCharArray();
            result2 = true;
            for (int j = 0; j < str1ToArray.length; j++) {
                switch (str1ToArray[j]) {
                    case 'a':
                        boolmas[j] = 1;
                    case 'b':
                        //...
                }
            }
            for (int j = 0; j < str2ToArray.length; j++) {
                switch (str2ToArray[j]) {
                    case 'a':
                        if (boolmas[j] == 1){
                            result2 = false;
                        }
                    case 'b':
                        //...
                }
            }
            System.out.println(result2);
        }
    }
}
