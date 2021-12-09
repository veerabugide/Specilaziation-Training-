public class star7 {
    public static void main(String[] args) {
        int i,j;
        int alp=65;
        for(i=0;i<=5;i++){
            for(j=0;j<=i;j++){
                System.out.print((char)alp+ " ");
                alp++;
            }
            System.out.println();
        }
    }
}
