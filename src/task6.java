//Написать программу, реализующую операции стек с использованием массива
public class task6 {
    private static class stack {
        private static final int default_size=10;
        private int size;
        private int[] array;
        private int top = 0;
        stack(){
            this.array=new int[default_size];
            this.size=default_size;
        }
        stack(int i){
            this.array=new int[i];
            this.size=i;
        }

        public int pop() throws Exception {
            if(this.is_empty())
                throw new Exception("Stack is empty");
            return this.array[--top];
        }

        public void push(int element) {
            if(this.top>=this.size){
                this.size++;
                int[] temp_array=this.array;
                this.array=new int[this.size];
                System.arraycopy(temp_array,0,this.array,0,temp_array.length);
            }
            this.array[top++]=element;
        }

        public void peek(){
            if(this.is_empty()) {
                System.out.println("Stack is empty");
                return;
            }
            System.out.println(this.array[this.top-1]);
        }

        public boolean is_empty(){
            return top == 0;
        }

        public int get_size(){
            return this.size;
        }

        public void clear(){
            for(int element : this.array){
                element=0;
            }
            this.top=0;
        }

    }
    public static void main(String[] args) throws Exception {
        stack st = new stack(10);
        for (int i = 0; i < st.get_size(); i++)
            st.push(i);
        st.peek();
        int pop = st.pop();
        st.peek();
        for (int i = 0; i < 5; i++)
            st.push(i);
        System.out.println(st.get_size());
        for(int i = 0; i < st.get_size(); i++){
            System.out.print(st.pop()+" ");
        }
    }
}
