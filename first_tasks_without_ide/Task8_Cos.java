public class Task8_Cos {

	public static void main(String[]args) {
		if (args.length != 2) {
            System.out.println ("Enter two signs: 1.The value of x in degrees 2.The number of attachments in expression");
        }
		else {
            Double x = Double.valueOf(args[0]);
            Integer n = Integer.valueOf(args[1]);
            if (n <= 0) {
                System.out.println ("The number of attachments should be natural");
            }
            else {
                x = Math.toRadians(x);
                Double sum = 0.0;
                while (n > 0) {
                    sum = Math.cos(x + sum);
                    n -= 1;
                }
                System.out.println ("The value of expression = " + sum);
            }
        }
    }
} 