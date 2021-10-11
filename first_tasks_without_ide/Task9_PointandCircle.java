public class Task9_PointandCircle {

	public static void main(String[]args) {
		if (args.length != 5) {
            System.out.println ("Enter next values: 1.Circle center coordinates (ox;oy) 2.Circle radius (r) 3.Point coordinates (x;y) ");
        }
		else {
            Integer ox = Integer.valueOf(args[0]);
            Integer oy = Integer.valueOf(args[1]);
            Integer r = Integer.valueOf(args[2]);
            Integer x = Integer.valueOf(args[3]);
            Integer y = Integer.valueOf(args[4]);
            if (r <= 0) {
                System.out.println ("Radius should be natural number");
            }
            else {
                if (Math.pow((x - ox),2) + Math.pow((y - oy),2) == Math.pow(r, 2)) {
                System.out.println("The point is on the circle");
                }
                else {
                System.out.println("The point is not on the circle");
                }
            }
        }
    }
} 