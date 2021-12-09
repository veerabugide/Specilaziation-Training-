public class star6 {
    public static void main(String[] args) {
        int i,j;
        char[] ch= {'A','B','C','D','E'};
        for(i=0;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(ch[j] + " ");
            }
            System.out.println();
        }
    }
}