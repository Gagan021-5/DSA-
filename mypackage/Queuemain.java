package mypackage;

public class Queuemain {
    public static void main(String[] args) throws Exception {
       CircularQueue cq = new CircularQueue(5);
        cq.insertCircQueue(5);
        cq.insertCircQueue(6);
        cq.insertCircQueue(8);
        cq.insertCircQueue(33);

        cq.display();

        System.out.println(cq.removecircqueue());
        cq.insertCircQueue(133);
        cq.display();
}

}