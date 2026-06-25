import patterns.ChPyramid;
import patterns.NumberMirror;

class HelloWorld {

    public static void pattern(int n) {

        // Upper half pyramid
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            // for (int j = 0; j < 2 * i - 1; j++) {
            //     System.out.print("*");
            // }

            System.out.println();
        }

        // Lower half pyramid
        for (int i = n - 1; i >= 0; i--) {

            for (int j = 0; j <  i; j++) {
                System.out.print("*");
            }

            // for (int j = 0; j < 2 * i - 1; j++) {
            //     System.out.print("*");
            // }

            System.out.println();
        }
    }

    /*
     * 
     * ....* // i = 0 =>> space =>4 star =>1 ===> j< n- i+1 ==> 4
     * ...** // i =1 =>> space =>3 star =>2 ===> 5-1+1 = 3
     * ..*** // i=2 =>> space 2 star =>3 ====> 5-3 = 2
     * .**** // i =3 ============================> 5-4 =1
     ***** i4 =4 ============================> 5-5=0
     * Logic ======> n-(i+1)
     * 
     * 
     * //Inverted Pyramid
     * 
     * 
     * i =n ===> star =>n space =0
     * i = n-1 ====> star n-1 space = 1
     * i = n-2 =====> star => n-2 space=2
     * complexity ==>
     */

    public static void main(String[] args) {

       // BinaryTriangle.binaryTriangle(5);
    //   NumberMirror.numberMirror(8);
    // NumberTriangle.numberTri(7);
      //  pattern(6);
      ChPyramid.buildPyramid(4);

    }
}