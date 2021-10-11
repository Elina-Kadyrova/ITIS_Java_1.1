public class Task10_Square {

	public static void main(String[]args) {
		if (args.length != 1) {
            System.out.println ("Enter only one sign - side of a square");
        }
		else {
            Integer a = Integer.valueOf(args[0]); 
            if (a <= 0) {
                System.out.println ("Side of square should be natural number");
            }
            else {
                for (int i = 1; i <= a; i++) {
                    for (int j = 1; j <= a; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
        }
    }
} 