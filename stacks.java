import java.util.Stack;

public class stacks{

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(678);
        st.push(89);
        System.out.println(st);
        System.out.println("After poping");
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

    }
}