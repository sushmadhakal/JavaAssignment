package assignment5;

//Write a Program to perform for the following task.
public class Quest37 {
    public static void main(String[] args) {
        int [][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] arr2 ={{4,5,6},{2,7,8},{3,1,9}};

        final int ROWS = 3;
        final int COLS = 3;

        int[][] sum = new int[ROWS][COLS];
        for(int i=0; i<ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
            System.out.println();
        }
            System.out.println("Sum of the given matrices is: ");
            for(int i = 0; i < ROWS; i++) {
                for (int j = 0; j < COLS; j++) {
                    System.out.print(sum[i][j] + "    ");
                }
                System.out.println();
            }
        }

}
