public class Task12_MultTable2 {

	public static void main(String[]args) {
		if (args.length != 1) {
            System.out.println ("Enter only one sign - maximum multiplier in the table");
        }
		else {
            Integer n = Integer.valueOf(args[0]); 
            if (n <= 0) {
                System.out.println ("Maximum multiplier in the table should be natural"); 
            }
            else { 
                for (int j = 1; j <= n; j++) {  
                    for (int i = 1; i <= n; i++) {
                        System.out.printf("%4s", (i * j));
                    }
                    System.out.println();
                }
            }
        }
    }
} 