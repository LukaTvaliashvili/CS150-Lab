package main.lesson20231030.inclass;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        /*
        { {1,2,3}, {4,5}, {6,7} } - Two dimensional array
         */
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5}, {6, 7}};

        /*
        {
          0  1  2
      0  {1, 2, 3},
      1  {4, 5},
      2  {6, 7}

        }
         */

        // arr[0][1] - 2
        // arr[1][1] - 5

        //ex: print all the elements of two-dimensional array

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length ; j++){
                System.out.println(arr[i][j]);
                /*
                first iteration: [0][0], [0][1], [0][2]
                 */
            }
        }
    }
}
