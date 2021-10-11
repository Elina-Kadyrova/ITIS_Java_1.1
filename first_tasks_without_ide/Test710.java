import java.util.Scanner;

public class Test710 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] notes = new String[1000];
        int counter = 0;
        while (true) {
            System.out.println("Please enter command"); //выбор команд
            String command = sc.nextLine();
            switch (command) {
                case "add":
                    add(counter, notes, sc);
                    counter++;
                    break;
                case "remove":
                    remove(counter, notes, sc);
                    break;
                case "find max":
                    findmax(notes);
                    break;
                case "output":
                    output(notes);
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Unknown command! Try again");
            }
        }
    }

    public static void add(int counter, String[] notes, Scanner sc){ //команда добавить строку(элемент массива)
        notes[counter] = sc.nextLine();
    }

    public static void remove(int counter, String[] notes, Scanner sc){ //команда удалить строку(элемент массива)
        String str = sc.nextLine();
        counter = Integer.parseInt(str);
        for (int i = counter; i < 999; i++) {
            if (notes[i + 1] != null) {
            notes[counter] = notes[counter + 1];
            }
            else {
                notes[i] = null;
            }
        }
    }

    public static void findmax(String[] notes){ //найти маскимальную по длине строку(элемент массива)
        int max = 0;
        for (int i = 0; i < 1000; i++) {
            if (notes[i] != null) {
                if (notes[i].length() > notes[max].length()) {
                max = i;
                }
            }
        }
        System.out.println("Element with " + notes[max].length() + " signs:" + notes[max]);
    }

    public static void output(String[] notes){ //вывести массив строк
        for (int i = 0; i < 1000; i++){
            if (notes[i] == null) {
                continue;
            }
            System.out.println(notes[i]);
        }
    }
