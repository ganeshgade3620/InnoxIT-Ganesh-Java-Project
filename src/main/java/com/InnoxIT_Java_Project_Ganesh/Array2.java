public class Array2 {
    public static void main(String[] args) {
        int[][] studentGrades={{34,65,78,90},{56,67,43,89},{77,54,23,98}};
        for(int i=0;i<studentGrades.length;i++){
            System.out.println("Displaying grades of section "+i);
            int max=0;
            for (int j=0;j<studentGrades[i].length;j++){
                if (studentGrades[i][j]>max){
                    max=studentGrades[i][j];
                }
                System.out.println(studentGrades[i][j]+" ");
            }
            System.out.println("max: "+max);

        }
    }
}
