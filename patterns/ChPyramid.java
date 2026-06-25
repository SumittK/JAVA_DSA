package patterns;

public class ChPyramid {

    public static void buildPyramid(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print((char) (k + 64));
            }

         for (int j = i - 1; j >= 1; j--) {
            System.out.print((char) ('A' + j - 1));
        }

            System.out.println();
        }

    }

    /*
     *  A
     * ABA
      ABCBA
     ABCDCBA
     * 
     * 
     * 
     * 
     */

}
