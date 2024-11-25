import java.util.Scanner;

public class pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int m = sc.nextInt();

        //Outer loop
        // for (int i = 1; i <= n; i++) {
        //     //Inner loop
        //     for (int j = 1; j <= m; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = 1; i <= n; i++) {
        //     for(int j = 1; j <= m; j++) {
        //         //cell -> (i, j)
        //         if(i == 1 || i == n || j == 1 || j == m) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
    

        // for(int i = n; i >= 1; i--) {
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // for(int i = 1; i <= n; i++) {
        //     //Inner loop -> space print
        //     for(int j = 1; j <= n-i; j++) {
        //         System.out.print(" ");
        //     }

        //     // inner loop -> star print 
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = 1; i <= n; i++) {
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        // for(int i = n; i >= 1; i--) {
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        //or
        // for(int i = 1; i <= n; i++) {
        //     for(int j = 1; j <= n-i+1; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        // int num = 1;
        // for(int i = 1; i <= n; i++) {
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     System.out.println();
        // }

            //outer loop
        // for(int i = 1; i <= n; i++) {
        //     // inner loop
        //     for(int j = 1; j <= i; j++) {
        //         if((i+j)%2 == 0) {  //even
        //             System.out.print("1 ");
        //         } else { //odd
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }

            //upper half
            // for(int i=1; i<=n; i++) {
            //     //first part
            //     for(int j=1; j<=i; j++) {
            //         System.out.print("* ");
            //     }

            //     //spaces 
            //     int spaces = 2 * (n-i);
            //     for(int j=1; j<=spaces; j++) {
            //         System.out.print("  ");
            //     }

            //     //2nd part
            //     for(int j=1; j<=i; j++) {
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }

            // //lower half
            // for(int i=n; i>=1; i--) {
            //     //first part
            //     for(int j=1; j<=i; j++) {
            //         System.out.print("* ");
            //     }

            //     //spaces 
            //     int spaces = 2 * (n-i);
            //     for(int j=1; j<=spaces; j++) {
            //         System.out.print("  ");
            //     }

            //     //2nd part
            //     for(int j=1; j<=i; j++) {
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }

        
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }

            //stars
            for(int j=1; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
