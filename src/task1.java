import java.util.Arrays;

class task1 {
    public static void main(String[] args) {
       /* concat(): объединяет строки
        valueOf(): преобразует объект в строковый вид
        join(): соединяет строки с учетом разделителя
        сompareTo(): сравнивает две строки
        charAt(): возвращает символ строки по индексу
        getChars(): возвращает группу символов
        equals(): сравнивает строки с учетом регистра
        equalsIgnoreCase(): сравнивает строки без учета регистра
        regionMatches(): сравнивает подстроки в строках
        indexOf(): находит индекс первого вхождения подстроки в строку
        lastIndexOf(): находит индекс последнего вхождения подстроки в строку
        startsWith(): определяет, начинается ли строка с подстроки
        endsWith(): определяет, заканчивается ли строка на определенную подстроку
        replace(): заменяет в строке одну подстроку на другую
        trim(): удаляет начальные и конечные пробелы
        substring(): возвращает подстроку, начиная с определенного индекса до конца или до определенного индекса
        toLowerCase(): переводит все символы строки в нижний регистр
        toUpperCase(): переводит все символы строки в верхний регистр*/

        String example = " ExAmPle StRiNg ";
        String example_lc = example.toLowerCase().trim();
        String example_uc = example.toUpperCase().trim();

        System.out.println(example_lc);
        System.out.println(example_uc);
        System.out.println("Removing"+example+"spaces");
        System.out.println("Removing"+example.trim()+"spaces");
        System.out.println(example_lc.substring(0,7));
        System.out.println(example_lc.replace("example","sample"));
        if(example_lc.endsWith("g"))
            System.out.println("String '"+example_lc+"' ends with g");
        else
            System.out.println("String '"+example_lc+"' doesn't end with g");
        if(example_lc.startsWith("a"))
            System.out.println("String '"+example_lc+"' starts with a");
        else
            System.out.println("String '"+example_lc+"' doesn't start with a");
        System.out.println(example_lc.lastIndexOf("string")+" is the last index of the word 'string'");
        System.out.println(example_lc.indexOf("example")+" is the first index of the word 'example'");
        System.out.println("We can use regionMatches() to compare strings(substrings):");
        if(example_lc.regionMatches(true,0,example_uc,0,example_lc.length()))
            System.out.println("these strings match: "+example_lc+" "+example_uc+ " (ignoring case)");
        else
            System.out.println("these strings don't match: "+example_lc+" "+example_uc+ " (ignoring case)");
        if(example_lc.regionMatches(false,0,example_uc,0,example_lc.length()))
            System.out.println("these strings match: "+example_lc+" "+example_uc+ " (not ignoring case)");
        else
            System.out.println("these strings don't match: "+example_lc+" "+example_uc+ " (not ignoring case)");
        System.out.println("We can use equals() and сompareTo() to compare String objects c:");
        System.out.println("equals(): "+example_lc+" and "+example_uc+" - "+ example_lc.equals(example_uc) );
        System.out.println("сompareTo(): "+example_lc+" and "+example_uc+" - "+ example_lc.compareTo(example_uc));
        System.out.println("We can use equalsIgnoreCase() to compare String objects ignoring case c:");
        System.out.println(example_lc+" and "+example_uc+" - "+example_lc.equalsIgnoreCase(example_uc));
       /* charAt(): возвращает символ строки по индексу
        getChars(): возвращает группу символов*/
        System.out.println("Symbol with index 3 of "+example_lc+" is "+ example_lc.charAt(3));
        char[] buffer= new char[3];
        example_lc.getChars(0,3,buffer,0);
        System.out.println("First 3 symbols of "+example_lc+" are "+ Arrays.toString(buffer));
        System.out.println("Concatenating with concat():\n"+example_lc+" + "+example_uc+"= "+ example_lc.concat(example_uc));
        String[] strings=new String[2];
        strings[0]=example_lc;
        strings[1]=example_uc;
        System.out.println("If we concatinate using join(), we can add apaces between strings:\n"+example_lc+" + "+example_uc+" = "+String.join(" ", strings));
    }
}
