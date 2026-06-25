public class BinaryTriangle {

    public static void binaryTriangle(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if (j % 2 == 0) {
                    System.out.print(0);
                } else {

                    System.out.print(1);
                }

            }
            System.out.println();
        }

    }
  // Time complexity ==> o(n2)
    /*
     * 1 === i =0 j ===> runs 1times ===> value =1
     * 10 ==== i=1 j runs runs 2 times ===> odd value ==>0 even palce ===>0
     * 101
     * 1010
     * 
     * 
     */

}