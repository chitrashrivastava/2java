import java.util.Scanner;

public class functionmul {
    public static int  mul(int a, int b){
 

        // operation in function
        int sum = a * b;
         return sum ;

    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(+mul(a, b));
        
    }
}
