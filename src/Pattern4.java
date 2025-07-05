public class Pattern4 {
    public static void main(String[] args) {
        int n=7;
        int star=1;
        int spaces =n/2;

        for(int row=1; row<=n; row++){
            for(int csp=1; csp<=spaces; csp++){
                System.out.print(" ");
            }
            for(int cs=1; cs<=star; cs++){
                System.out.print("*");
            }
            System.out.println();
            if(row <= n/2){
                spaces--;
                star +=2;
            }else{
                spaces++;
                star -=2;
            }
        }
    }
}

