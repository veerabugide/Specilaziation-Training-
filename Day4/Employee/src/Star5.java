public class Star5 {
    public static void main(String[] args) {
        int i,j;
        int alp=64;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print((char)(alp +j)+ " ");
            }
            System.out.println();
        }
    }
}
