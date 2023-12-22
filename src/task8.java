import java.lang.reflect.*;

public class task8 {
    public static void Class_info(Class<?> cl) {
        String name = cl.getName();
        int class_mods = cl.getModifiers();
        Constructor<?>[] ctors = cl.getDeclaredConstructors();
        Method[] methods = cl.getDeclaredMethods();
        Field[] fields = cl.getDeclaredFields();
        Class<?> parent = cl.getSuperclass();

        System.out.println("Имя класса: " + name);
        System.out.println("Модификаторы класса: " + Modifier.toString(class_mods));
        if (parent != null)
            System.out.println("Родительский класс: " + Modifier.toString(parent.getModifiers()) + " " + parent.getName());
        else
            System.out.println("Не имеет родительского класса");
        System.out.println("Конструкторы:");
        for (Constructor<?> ctor : ctors)
            System.out.println(ctor);

        System.out.println("Поля:");
        for (Field field : fields)
            System.out.println(field);

        System.out.println("Методы:");
        for (Method method : methods)
            System.out.println(method);
    }

    public static void main(String[] args) {
        Class_info(Array.class);
    }
}
