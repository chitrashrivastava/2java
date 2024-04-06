
import java.util.*;
public class rec {
     static int fun(int n){
   if(n==0){
    return 0;
   }else{
   return n+fun(n-1);
   }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fun(n));
    }
}
