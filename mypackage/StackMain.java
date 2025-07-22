package mypackage;

public class StackMain {
    public static void main(String[] args) throws StackException {
        Customstack st = new Customstack(5);
        st.push(45);
        st.push(56);
        st.push(67);
        st.push(78);
        st.push(89);

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

}

}
