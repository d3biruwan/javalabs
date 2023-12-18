import java.util.Scanner;

public class task4 {
    enum mood {
        happy,
        sad
    }

    public static void main(String[] args) {
        int i = 0;
        byte b = 3;
        short sh = 10;
        char c = 'c';
        Integer I = 0;
        mood md = mood.happy;

        System.out.print("Тип int :");
        switch (i) {
            case 0:
                System.out.println("int is 0");
                break;
            default:
                System.out.println("int is not 0");
                break;
        }

        System.out.print("Тип byte :");
        switch (b) {
            case 3:
                System.out.println("byte is 3");
                break;
            default:
                System.out.println("byte is not 3");
                break;
        }

        System.out.print("Тип short :");
        switch (sh) {
            case 10:
                System.out.println("short is 10");
                break;
            default:
                System.out.println("short is not 10");
                break;
        }
        System.out.print("Обертка типа Integer :");
        switch (I) {
            case 0:
                System.out.println("Integer is 0");
                break;
            default:
                System.out.println("Integer is not 0");
                break;
        }
        System.out.print("Тип char :");
        switch (c) {
            case 'c':
                System.out.println("char is c");
                break;
            default:
                System.out.println("char is not c");
                break;
        }

        System.out.print("Тип Enum :");
        switch (md) {
            case mood.happy:
                System.out.println("I'm happy");
                break;
            default:
                System.out.println("I'm sad");
                break;
        }

    }
}
