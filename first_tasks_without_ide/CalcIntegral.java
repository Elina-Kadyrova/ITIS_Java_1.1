import java.util.Scanner;

public class CalcIntegral {
 
	public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        double xa = 0.0; //зафиксированные значения промежутка
        double xb = 2.0;
        while (true) {
            System.out.println("Enter n"); //ввод количества делений между левой и правой границами промежутка(точность расчёта)
            String strn = sc.nextLine();
            int n = Integer.parseInt(strn);
            System.out.println(calcInt1(n, xa, xb));
            System.out.println(calcInt2(n, xa, xb));
            System.out.println(calcInt3(n, xa, xb));
        }
    }

    public static double calcInt1(int n, double xa, double xb) { // способ 1
        double dx = (xb - xa) / n; 
        double x0 = xa;
        double sum = 0.0;
        while (x0 <= xb) {
            sum += Math.abs(dx * f(x0));
            x0 += dx;
        }
        return Math.round(sum * 1000.0) / 1000.0;
    }

    public static double calcInt2(int n, double xa, double xb) { // способ 2
        double dx = (xb - xa) / n; 
        double x0 = xa;
        double x1;
        double sum = 0.0;
        while (x0 <= xb) {
            x1 = x0 + dx;
            sum += Math.abs((f(x0) + f1(x1)) * dx / 2);
            x0 += dx;
        }
        return Math.round(sum * 1000.0) / 1000.0;
    }

    public static double calcInt3(int n, double xa, double xb) { // способ 3
        double dx = (xb - xa) / n; 
        double x0 = xa;
        double x1;
        double x2;
        double sum = 0.0;
        while (x0 <= xb) {
            x1 = x0 + dx;
            x2 = (2 * x0 + dx) / 2;
            sum += Math.abs (dx / 6 * (f(x0) + 4 * f2(x2) + f1(x1)));
            x0 += dx;
        }
        return Math.round(sum * 1000.0) / 1000.0;
    }

    public static double f (double x0) { 
        double y0 = x0 * x0;
        return y0;
    }

    public static double f1 (double x1) { 
        double y1 = x1 * x1;
        return y1;
    }

    public static double f2 (double x2) { 
        double y2 = x2 * x2;
        return y2;
    }
}