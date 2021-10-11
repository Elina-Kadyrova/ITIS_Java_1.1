public class Task6_Sum {

	public static void main(String[]args) {
		if (args.length != 1) {
            System.out.println ("Enter only one sign - the number of members in sum");
        }
		else {
            Integer n = Integer.valueOf(args[0]);
            if (n <= 0) {
                System.out.println ("The number of members in sum should be natural");
            }
            else {
                Double sum = 0.0;
                Integer fact1 = 1;
                Integer fact2 = 1;
                for (int m = 1; m <= n; m++) {
                    fact1 *= (m - 1);
                    if (fact1 == 0) {
                        fact1 = 1;
                    }
                    fact2 *= (2 * m) * (2 * m - 1);
                    sum = sum + Math.pow (fact1, 2) / fact2;
                }
                System.out.println ("The sum = " + sum);
            }
        }
    }
} 