public class Pattern3 {
    public static void main(String[] args) {
        int n=5;
        int star=1;

        for(int row=1; row<=n; row++){
            // for star
            for(int cs=1; cs<=star; cs++){
                System.out.print("* ");
            }
            System.out.println();
            if(row <= n/2){
                star++;
            }else{
                star--;
            }
        }
    }
}
