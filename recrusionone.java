public class recrusionone {

    public static void main(String[] args) {
        number(1);
    }


    static void number(int n){
        if(n==6){
            return ;
        } 
        System.out.println(n);
      number(n+1); 
     
    }
    
}
