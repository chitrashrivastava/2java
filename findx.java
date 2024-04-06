import java.util.*;

public class findx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

 int x = sc.nextInt();

        //  output 
        
        for(int i=0;  i<numbers.length; i++ ){
            if(numbers[i]==x){ // x ko serch kiya jese 2, (i=0==2 ) (i=1==2) (i=2==2)
               
                System.out.println("x is found at index: " + i);

            }
           
        }

    }
}
