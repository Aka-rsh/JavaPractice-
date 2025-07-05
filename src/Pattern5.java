public class Pattern5 {
    public static void main(String[] args) {
        int n = 4;
        // for liar
        for (int frow = 1; frow <= 2 * n - 1; frow++) {
            System.out.print("*");
        }
        System.out.println();

        int rows = n - 1;
        int star = n - 1;
        int spaces = 1;
         for(int row=1; row<=rows; row++){
             // star
             for(int cs=1; cs<=star; cs++){
                 System.out.print("*");
             }
             // spaces
             for(int csp=1; csp<=spaces; csp++){
                 System.out.print(" ");
             }
             // star
             for(int cs=1; cs<=star; cs++){
                 System.out.print("*");
             }
             System.out.println();
             star--;
             spaces +=2;
         }
    }
}
