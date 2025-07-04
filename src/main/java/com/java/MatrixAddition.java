
public class MatrixAddition {

    //method to add two matrices and retrun the resulting matrix
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB){
        //get the number of rows and columns
        int rows=matrixA.length;
        int cols=matrixA[0].length;

        //create a new matix to store the sum
        int[][] result=new int[rows][cols];

        //Iterate through each row
        for(int i=0;i<rows;i++){
          //iterate through each colums
          for (int j=0;j<cols;j++){
              //add corresponding elements from matrixA and matirixB
              result[i][j]=matrixA[i][j] + matrixB[i][j];
          }
        }
        //return the computed sum matix
        return result;
    }
    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        // Iterate through each row
        for (int[] row : matrix) {
            // Iterate through each element in the row
            for (int elem : row) {
                // Print the element with a space
                System.out.print(elem + " ");
            }
            // Move to the next line after printing a row
            System.out.println();
        }
    }
    public static void main(String[] args) {

        // Define two 3x3 matrices (same dimensions)
        int[][] matrixA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
              };

        int[][] matrixB = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
             };
        //call the addMatrices method and store the result
        int[][] result=addMatrices(matrixA, matrixB);

        //print the resulting matix
        System.out.println("Resulting Matrix:");
        printMatrix(result);
    }
}
