package ru.kpfu.itis.tasks.task_II;

public class App {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Error: enter 3 numbers");
        }
        else {
            Integer n = Integer.valueOf(args[0]);
            Integer a = Integer.valueOf(args[1]);
            Integer b = Integer.valueOf(args[2]);
            if (n < 1) {
                System.out.println("Error: invalid value of variable n");
            }
            else {
                if (a > b) {
                    System.out.println("Error: the left end of the range must be less than the right");
                }
                else {
                    Integer[] arr = new Integer[n];
                    for (int i = 0; i < n; i++) {
                        arr[i] = a + (int)(Math.random()*(b-a));
                    }
                    Integer max = Integer.MIN_VALUE;
                    Integer min = Integer.MAX_VALUE;
                    Double s = 0.00;
                    for (int j = 0; j < n; j++) {
                        if (arr[j] > max) {
                            max = arr[j];
                        }
                        if (arr[j] < min) {
                            min = arr[j];
                        } 
                        s += arr[j];
                    }
                    Double mean = s / n;
                    System.out.println(max);
                    System.out.println(min);
                    System.out.println(Math.round(mean * 100.00) / 100.00);
                }
            }
        }
    }
}
