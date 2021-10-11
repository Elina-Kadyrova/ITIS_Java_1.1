package ru.kpfu.itis.tasks.task_III;

public class App {
    public static void main(String[] args) {
        Integer n = 9; 
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= n; i++) {
                if (i * j < 10) {
                System.out.print("  " + i * j);
                }
                else {
                    System.out.print(" " + i * j);
                }
            }
        System.out.println();
        }
    }
}
