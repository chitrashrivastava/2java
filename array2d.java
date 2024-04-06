import java.util.*;
public class array2d {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int rows = sc.nextInt(); //rows input
       int cols = sc.nextInt(); //col input
       
    //    declaration of array
       int[][] numbers = new int[rows][cols];

    //    input
    // rows
    for(int i=0; i<rows; i++){
    //  cols  
    for(int j=0; j<cols; j++){
        numbers[i][j] = sc.nextInt();
    }

    }
    // output
    for(int i=0; i<rows; i++ ){
        for(int j=0; j<cols; j++){
            System.err.println(numbers[i][j]);
        }
        System.err.println();
    }
    
}
}