public class Break2 {

    public static boolean containsPerfectScore(int[] studentScores){
        System.out.println(studentScores[0]);
        boolean perfectScore=false;

        for (int score : studentScores) {
            System.out.println("Current score: " + score);
           /* if (score==100){
                System.out.println("perfect score!!");
                perfectScore=true;
                break;
            }*/
            //   System.out.println("not perfect score");

            switch (score) {
                case 100:
                    System.out.println("perfect score");
                    break;
                default:
                    System.out.println("not perfect score");
            }
        }
        return perfectScore;

    }
    public static void main(String[] args) {
        int[]studentScores={58,76,90,100,88,60};

        containsPerfectScore(studentScores);

    }
}
