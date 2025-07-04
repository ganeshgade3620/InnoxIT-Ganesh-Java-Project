public class ForEach {
    public static void main(String[] args) {
       int []  iArray=new int[]{0,1,2,3,4,5,6,7,8,9};
        for (int i=0;i<iArray.length;i++){
            System.out.println(iArray[i]);
        }
        //for-each:Convenient Iteration(Cleaner Syntax)
        //could be better for array,prefered for nested iterations
        for(int i:iArray){//i represent elements of array
            //condition statement and increment are implecit.
            System.out.println(i+" ");
        }

        System.out.println();
        System.out.println("printing rolls of dice...");
        int[] dice1={1,2,3,4,5,6};
        int[] dice2={1,2,3,4,5,6};

        for (int i=0;i<dice1.length;i++){
            for (int j=0;j<dice2.length;j++){
                System.out.println(dice1[i]+" "+dice2[j]);
            }
        }
        System.out.println();
        for (int i: dice1){
            for (int j:dice2){
                System.out.println(i+" "+j);
            }
        }

        // When would we prefer traditional for: need access to index
       //   1.transform array
       //   2.Parallel interation
        for (int i=0,j=0;i<dice1.length && j<dice2.length;i++,j++){
            System.out.println(dice1[i]+ " "+dice2[j]);
        }
        //3.Backward interation.


    }
}
