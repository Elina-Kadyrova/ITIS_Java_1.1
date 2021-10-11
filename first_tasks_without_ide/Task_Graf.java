public class Task_Graf {

    public static void main(String[]args){

        String [][] arr = new String [30][50];
        for(int i = 0; i < 30; i++) {
            int y = (int) Math.round(Math.sin(i) + 10);
            for (int j = 0; j < 50; j++) {
                if (j <= y) {
                    arr[i][j] = "*";
                }
                else {
                    arr[i][j] = " ";
                }
            }
        }
        for (int j = 0; j < 50; j++) {
            for (int i = 0; i < 30; i++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}