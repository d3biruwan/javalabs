public class task5 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.print("Нет аргументов командной строки");
        }
        else {
            System.out.print("Аргументы командной строки: ");
            for (String arg : args) {
                System.out.print(arg + " ");
            }
        }
    }
}
