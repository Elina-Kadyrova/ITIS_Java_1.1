public class Task1_WellDepthCalc {

	 public static void main(String[]args) {
	 	if (args.length == 1) {
	 		float t = Float.valueOf(args[0]);
	 		float g = 9.81f;
	 		double h = (double) ((g * t * t) / 2);
	 		h = Math.round(h * 100.0) / 100.0;
	 		System.out.println ("Depth of well = " + h +" metres");
	    	}
	    else {
	    System.out.println ("Input the number of seconds with 2 digits after decimal point");
		}
	 }
} 