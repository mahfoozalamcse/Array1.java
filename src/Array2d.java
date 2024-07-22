import java.util.*;
public class Array2d {
    public static void printSpiral(int matrix[][]){
       int startRow =0;
       int startCol =0;
       int endRow = matrix.length-1;
       int endCol = matrix[0].length-1;

       while (startRow <= endRow && startCol <= endCol){
           // top
           for(int j=startCol; j<=endCol; j++){
               System.out.print(matrix[startRow][j]+" ");
           }
           // right
           for(int i=startRow+1; i<=endRow; i++){
               System.out.print(matrix[i][endCol]+" ");
           }
           // bottom
           for(int j=endCol-1; j>=startCol; j--){
               if(startRow == endRow){
                   break;
               }
               System.out.print(matrix[endRow][j]+" ");
           }
           // left
           for(int i= endRow-1; i>=startRow+1; i--){
               if(startCol == endCol){
                   break;
               }
               System.out.print(matrix[i][startCol]+" ");
           }
           startRow++;
           endRow--;
           startCol++;
           endCol--;

       }
        System.out.println();
    }
    // Diagonal sum
    public static int diagonalSum(int matrix[][]){
        int sum =0;
        /*

        // brute force aproch

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                //primary diagonal
                if(i == j){
                    sum +=matrix[i][j];
                }
                // secondary diagonal
                else if(i+j == matrix.length-1){
                    sum +=matrix[i][matrix.length-i-1];
                }
            }
        }
        return sum;

         */
        // optamize code linear time

        for(int i=0; i< matrix.length; i++){
            // primary diagonal
            sum += matrix[i][i];
            // secondary diagonl
            if(i != matrix.length-i-1){
                sum +=matrix[i][matrix.length-i-1];
            }

        }
        return sum;
    }
    public static boolean stairSearch(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;

        while (row < matrix.length && col >=0 ){
            if(matrix[row][col] == key){
                System.out.println("key is found "+"("+row+","+col+")");
                return true;
            }else if(key < matrix[row][col]){
                col--;
            }else {
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
     int matrix[][] = { {1, 2, 3, 4},
                       {5, 6, 7, 8 },
                      {9, 10, 11, 12 },
                      {13, 14, 15, 16}};
     //printSpiral(matrix);
     //   System.out.println(diagonalSum(matrix));
        int key = 14;
        System.out.println(stairSearch(matrix, key));

    }
}
