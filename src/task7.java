public class task7 {
    private static class Reference<Type> {
        private Type referent;
        public Reference(Type initialValue) {
            referent = initialValue;
        }
        public void set(Type newVal) {
            referent = newVal;
        }
        public Type get() {
            return referent;
        }
    }

    private static  <Type> void value_swap(Reference<Type> arg1, Reference<Type> arg2) {
        Type temp=arg1.get();
        arg1.set(arg2.get());
        arg2.set(temp);
    }

    public static void main(String[] args) {
        int a = 5, b = 10;
        Reference<Integer> a_ref = new Reference<>(a);
        Reference<Integer> b_ref = new Reference<>(b);

        String line1 = "TEST", line2 = "test";
        Reference<String> line1_ref = new Reference<>(line1);
        Reference<String> line2_ref = new Reference<>(line2);

        System.out.println("a = " + a_ref.get() + ", b = " + b_ref.get());
        System.out.println("Swapping...");
        value_swap(a_ref, b_ref);
        System.out.println("a = " + a_ref.get() + ", b = " + b_ref.get());

        System.out.println("line1 = " + line1_ref.get() + ", line2 = " + line2_ref.get());
        System.out.println("Swapping...");
        value_swap(line1_ref, line2_ref);
        System.out.println("line1 = " + line1_ref.get() + ", line2 = " + line2_ref.get());


    }
}
