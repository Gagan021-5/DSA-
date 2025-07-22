package mypackage;

public class Queuemain {
    public static void main(String[] args) throws Exception {
        CustomQueue q = new CustomQueue(5);
        q.insertQueue(5);
        q.insertQueue(6);
        q.insertQueue(8);
        q.insertQueue(33);

        q.display();
    }
}
