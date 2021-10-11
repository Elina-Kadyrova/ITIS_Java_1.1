public class Task3_WallisProduct {

	public static void main(String[]args) {
		if (args.length != 1) {
			System.out.println ("Enter only one sign - the number of factors in product");
		}
		else {
			Integer num = Integer.valueOf(args[0]);
			if (num <= 0) {
                System.out.println ("The number of factors in product should be natural");
            }
            else {
				Double pi = 1.0;
				for(int i = 1; i <= num; i++) {
					pi = pi * Math.pow ((2 * i), 2) / (2 * i - 1 ) / (2 * i + 1);
				}
				pi = pi * 2;
				System.out.println ("Approximate value of Pi = " + pi);
			}
		}
	}
}