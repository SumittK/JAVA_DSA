package patterns;

public class NumberMirror {

    public static void numberMirror(int n) {

        // left side number pattern

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // right side number mirror

            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");

            } 

      
                 int x = i;
                while ( x> 0) {
                    System.out.print(x);

                    x--;
                

            }
            System.out.println();
        }

    }

    /*
     * 1     1
     * 12   21
     * 123 321
     * 12344321
     * 
     * 
     * 
     * i=1 ===> space n+n -2 => 2(n-1) ===> 6
     * i=2 ====> 2n-4     => 2(n-2) ======> 4
     * 
     * i=3 ====>  2n-6    => 2(n-3)========> 2
     * 
     * i=4 ====> 2n -8   => 2(n-4)=========>0
     */

}
