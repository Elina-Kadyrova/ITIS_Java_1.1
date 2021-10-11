public class Main {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 0; s < 100; i++) {
            s+=i;
        }
        System.out.println(s);

        s = 0;
        int i = 0;
        while (s<100){
            s+=i++;
        }
        System.out.println(s);


        s = 0;
        i = 0;
        System.out.println(rec(s, i));

    }

    public static int rec(int s, int i){
        if (s >= 100){
            return s;
        }
        else {
            return rec(s + i, i+=1);
        }
    }
}
