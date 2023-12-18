/*Написать программу, демонстрирующую использование

логических операци1 && || !
тернарной операции x < y ? x : y
поразрядных логических операций & | ^ ~
операции сдвига >> << >>>*/
public class task3 {
    public static void main(String[] args) {
        boolean t= true;
        boolean f=false;
        //Логические операции
        System.out.println("Логическое И && принимает 2 операнда и возвращает true, только если оба операнда - true, иначе возвращает false");
        System.out.println(String.valueOf(t&&f)+" "+String.valueOf(f&&f)+" "+String.valueOf(t&&t));//должно быть false false true

        System.out.println("Логическое ИЛИ || принимает 2 операнда и возвращает true, только если один из операндов - true, иначе возвращает false");
        System.out.println(String.valueOf(t||f)+" "+String.valueOf(f||f)+" "+String.valueOf(t||t));//должно быть false false true

        System.out.println("Логическое НЕ ! - унарный оператор, возвращает true, если операнд является false, иначе возвращает false");
        System.out.println(String.valueOf(!t)+" "+String.valueOf(!f));//должно быть false true

        //Тернарная операция
        System.out.println("Тернарная операция x < y ? x : y проверяет условие перед знаком вопроса и возвращает x, если условие true, иначе возвращает y");
        System.out.println(String.valueOf(t ? t : f)+" "+String.valueOf(f ? t : f));

        //Логические операции & |
        int counter1=0,counter2=0;
        boolean f1 = (counter1++>0)&(counter1++>0);
        boolean f2 = (counter2++>0)&&(counter2++>0);
        System.out.println("Операции & и | могут использоваться с операндами типа boolean так же, как и && и ||.\n Отличие в том, что в том, что для операторов & и | всегда вычисляются значения обоих операндов,\n а при работе операторов && и || второй операнд вычисляется только по необходимости");
        System.out.println(String.valueOf(counter1)+" "+String.valueOf(counter2));
        counter1=1;
        counter2=1;
        f1 = (counter1++>0)||(counter1++>0);
        f2 = (counter2++>0)|(counter2++>0);
        System.out.println(String.valueOf(counter1)+" "+String.valueOf(counter2));

        //поразрядные логические операции & | ^ ~
        int a = 3 & 5;
        int b = 3 | 5;
        int c = 3 ^ 5;
        int d = ~ 5;
        System.out.println("поразрядные логические операции & | ^ ~");
        System.out.println(Integer.toBinaryString(3));
        System.out.println("&");
        System.out.println(Integer.toBinaryString(5));
        System.out.println("-----------");
        System.out.println(Integer.toBinaryString(a)+" = "+a+"\n");

        System.out.println(Integer.toBinaryString(3));
        System.out.println("|");
        System.out.println(Integer.toBinaryString(5));
        System.out.println("-----------");
        System.out.println(Integer.toBinaryString(b)+" = "+b+"\n");

        System.out.println(Integer.toBinaryString(3));
        System.out.println("^");
        System.out.println(Integer.toBinaryString(5));
        System.out.println("-----------");
        System.out.println(Integer.toBinaryString(c)+" = "+c+"\n");

        System.out.println("~");
        System.out.println(Integer.toBinaryString(5));
        System.out.println("-----------");
        System.out.println(Integer.toBinaryString(d)+" = "+d+"\n");

        //операции сдвига >> << >>>
        a=-20<<3;
        b=-20>>3;
        c=-20>>>3;
        System.out.println("Операции сдвига >> << >>>\n");
        System.out.println("x<<y выполняет сдвиг битового представления числа x на y позиций влево");
        System.out.println("-20 << 3 :");
        System.out.println(Integer.toBinaryString(20));
        System.out.println("<<");
        System.out.println(3);
        System.out.println("-----------");
        System.out.println(Integer.toBinaryString(a)+" = "+a+"\n");

        System.out.println("x>>y выполняет сдвиг битового представления числа x на y позиций вправо c сохранением знака числа(крайний левый бит=0 у положительных чисел и-1 у отрицательных)");
        System.out.println("-20 >> 3 :");
        System.out.println(Integer.toBinaryString(-20));
        System.out.println(">>");
        System.out.println(3);
        System.out.println("-----------");
        System.out.println(Integer.toBinaryString(b)+" = "+b+"\n");

        System.out.println("x>>>y выполняет сдвиг битового представления числа x на y позиций вправо и не сохраняет знак");
        System.out.println("-20 >>> 3 :");
        System.out.println(Integer.toBinaryString(-20));
        System.out.println(">>>");
        System.out.println(3);
        System.out.println("-----------");
        System.out.println(Integer.toBinaryString(c)+" = "+c+"\n");

    }
}