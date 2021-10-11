import java.util.Scanner;

public class Task_IndexOf2 {

	public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        System.out.println ("Please enter two strings to compare");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
		Boolean k = str1.contains(str2);
        if (k == true) {
            char[] str1ToArray = str1.toCharArray();
            char[] str2ToArray = str2.toCharArray();
            Integer p = 0;
            for(int i = 0; i < str1ToArray.length; i++) {
                for (int j = 0; j < str2ToArray.length; j++) {
                   if (str1ToArray[i] == str2ToArray[j]) {
                    p = i + 1;
                    break;
                   }
                break;
                }
            }
            System.out.println(p);
        }
        else {
            System.out.println("-1");
        }
    }
} 