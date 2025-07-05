class Pattern2{
    public static void main(String[] args) {
        int n=4;

        int spaces=n-1;
        int star=1;

        for(int row=1; row<=n; row++){
            // for spaces
            for(int csp=1; csp<=spaces; csp++){
                System.out.print(" ");
            }
            // for star
            for(int cs=1; cs<=star; cs++){
                System.out.print("*");
            }
            System.out.println();
            spaces--;
            star=star+2;
        }
    }
}