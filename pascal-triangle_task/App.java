package ru.kpfu.itis.tasks.task_IV;

public class App {

    public static void main(String[]args) {
        int lineNumber = 15;
        printPascalTriangle(lineNumber);
        System.out.println();
        printPascalTriangleArray(lineNumber);
    }

    public static void printPascalTriangle(int lineNumber) {
        for (int i = 0; i < lineNumber; i++) {
            int num = 1;
            for (int p = 0; p < (lineNumber - i) * 6 / 2; p++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (num / 10 < 1) {
                System.out.print(num + "     ");
                }
                else {
                    if (num / 100 < 1) {
                        System.out.print(num + "    ");
                    }
                    else {
                        if (num / 1000 < 1) {
                            System.out.print(num + "   ");
                        }
                        else {
                            System.out.print(num + "  ");
                        }
                    }
                }
                num = num * (i - j) / (j + 1);
            }
            for (int m = 0; m < (lineNumber - i) * 6 / 2; m++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printPascalTriangleArray(int lineNumber) {
        int[][] arr = new int[lineNumber][lineNumber * 2 + 1];
        arr[0][15] = 1;
        for (int i = 0; i < lineNumber; i++) {
            for (int j = 0; j < (lineNumber * 2 + 1); j++) {
                if ((j < lineNumber - i) || (j > lineNumber + i)) {
                    System.out.print("    ");
                }
                else {
                    if ((j == lineNumber - i) || (j == lineNumber + i)) {
                        arr[i][j] = 1;
                        System.out.print(arr[i][j] + "   ");
                    }
                    else {
                        if (i % 2 != j % 2){
                            arr[i][j] = arr[i-1][j-1] + arr[i-1][j+1];
                            if (arr[i][j] / 10 < 1) {
                                System.out.print(arr[i][j] + "   ");
                            }
                            else {
                                if (arr[i][j] / 100 < 1) {
                                    System.out.print(arr[i][j] + "  ");
                                }
                                else {
                                    if (arr[i][j] / 1000 < 1) {
                                        System.out.print(arr[i][j] + " ");
                                    }
                                    else {
                                        System.out.print(arr[i][j]);
                                    }
                                }
                            }
                        } 
                        else {
                            System.out.print("    ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
