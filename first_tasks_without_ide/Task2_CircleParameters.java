public class Task2_CircleParameters {

	 public static void main(String[] args) {
	 	if (args.length ==1) {
	 		Float rad = Float.valueOf(args[0]);
	 		Double cir = 2*Math.PI*rad;
	 		Double area = (rad*rad)*Math.PI;
	 		cir = Math.round(cir*100.0)/100.0;
	 		area = Math.round(area*100.0)/100.0;
	 		System.out.println ("Circumference = " + cir);
	 		System.out.println ("Area of circle = " + area);
	    }
	    else {
	    System.out.println ("Enter a integer value for the radius of the circle");
		}
	}
} 