public class Task5_Sum {

	public static void main(String[]args) {
		if (args.length != 2) {
            System.out.println ("Enter two signs: 1.The value of x 2.The number of attachments in sum");
        }
		else {
            Integer x = Integer.valueOf(args[0]);
            Integer n = Integer.valueOf(args[1]);
            if (n <= 0) {
                System.out.println ("The number of attachments in sum should be natural");
            }
            else {
                Double sum = 0.0;
                Integer i = n;
                while (i > 0) {
                    sum = x / ((i + 1) + sum);
                    i -= 1;
                }
                System.out.println ("The sum = " + (sum + 1));
            }
        }
    }
} 