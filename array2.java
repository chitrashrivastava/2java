import java.util.*;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt(); 
        int arr[] = new int[size];

        // input
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        // output
        System.out.println("The elements of the array are:");
        for(int i=0; i<size; i++){
            System.err.println(arr[i]);
        }

    }
}
