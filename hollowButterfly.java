

public class hollowButterfly {
    public static void main(String[] args) {
        int n = 5;

        //outer loop
        for (int i = 1; i <= n; i++) {

            //inner loop
            //upper half
            //1st part
            for (int j = 1; j <= i; j++) {
                if (i==1 || j==1 || j==i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //spaces
            int spaces=2*(n-i);
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            //2nd part
            for(int j=1; j<=i; j++) {
                if (j==1 || j==i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        //lower loop
        //outer loop
        for(int i=n; i>=1; i--) {
            //1st part
            for(int j=1; j<=i; j++) {
                if (i==1 || j==1 || j==i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //spaces
            int spaces=2*(n-i);
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            //2nd part
            for(int j=1; j<=i; j++) {
                if(i==1 || j==1 || j==i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
