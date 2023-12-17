import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");
        String str;
        while(scan.hasNext()) {
            str =scan.next();
            System.out.print(str + " ");
        }
    }
}