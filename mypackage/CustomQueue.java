package mypackage;

public class CustomQueue {
    private int[] data;
    private static final int size = 10;

    int end = 0;

     public CustomQueue(){
        this(size);
    }

    public CustomQueue(int s) {
        this.data = new int[s];

    }

    
    public boolean isfull() {
        return end == data.length;

    }

    public boolean isempty() {
        return end == 0;

    }

    public boolean insertQueue(int val){
        if(isfull()) return false;
        
        data[end++] =val;
        return true;
    }

    public int deleteQueue()throws Exception{
        if(isempty()) {
            throw new Exception("Empty!");
        }
          int removed = data[0];
          for(int i=1;i<end;i++){    //rest elements 0(n)
            data[i-1] = data[i];
            end--;
          }
          return removed;
         
    }

    public int front() throws Exception{
        if(isempty()){
            throw new Exception("Queue is Empty");

        }
        return data[0];
    }

    public void display(){
        for(int i=0;i<end;i++){
            System.out.print(data[i]+ " -> ");
        }
        System.out.println("END");
    }

    

}
