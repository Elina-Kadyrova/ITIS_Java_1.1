public class Task7_Sum {

	public static void main(String[]args) {
		if (args.length != 1) {
            System.out.println ("Enter only one sign - the number of members in sum");
        }
		else {
            Integer num = Integer.valueOf(args[0]);
            if (num <= 0) {
                System.out.println ("The number of members in sum should be natural");
            }
            else {
                Double sum = 0.0;
                for (int i = 1; i <= num; i++) {
    	           if (i % 2 == 0) {
    	               sum = sum - (1 / Math.pow((2 * i - 1), 2));
                    }
    	           else {
    	               sum = sum + (1 / Math.pow((2 * i - 1), 2));
                    }
                }
            System.out.println ("The sum of the " + num + " members of the series is " + sum);
            }
        }
    }
} 