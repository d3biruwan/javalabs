import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class task9 {
    public static void invoke_method(String class_name, String method_name) {
        try {
            Class<?> cl = Class.forName(class_name);
            Method method = cl.getDeclaredMethod(method_name);
            Object obj = cl.newInstance();
            method.invoke(obj);
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    static class ex_class {
        public void print() {
            System.out.println("Method invoked");
        }
    }

    public static void main(String[] args) {
        invoke_method(ex_class.class.getName(), ex_class.class.getMethods()[0].getName());
    }
}
