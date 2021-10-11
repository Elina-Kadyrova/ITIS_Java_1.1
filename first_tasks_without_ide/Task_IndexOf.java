public class Task_IndexOf {

	public static void main(String[]args) {
		if (args.length != 2) {
            System.out.println ("Enter two strings to compare");
        }
		else {
            String str1 = args[0];
            String str2 = args[1];
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
} 