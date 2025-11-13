public class Floorsqt {

   public static void main(String[] args) {

   }

   int floorSqrt(int n) {
      // code here
      int s = 0;
      int e = n - 1;
      while (s <= e) {
         int m = s + (e - s) / 2;
         if (m * m == n) {
            return m;
         } else if(m * m < n){
           s = m + 1;
         }else{
            e = m - 1;
         }
      }
      return -1;

   }

}