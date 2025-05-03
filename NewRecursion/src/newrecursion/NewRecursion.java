
package newrecursion;


public class NewRecursion {

    
    public static void main(String[] args) {
        
        System.out.println(hanoi(5));
       
    }
    
      public static int hanoi(int n){
        if(n==0 || n==1){
            return n;
        }
         int f = 2*hanoi(n-1)+1;
        return f;
    }

    public int towerOfHanoi(int n, int from, int to, int aux) {
        return hanoi(n);
    }
    
}
