public class star13 {
    public static void main(String[] args) {
        int i, j, rows;

        rows = 6;
        for (i= 0; i<= rows-1; i++)
        {
            for (j=0; j<=i; j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
        for (i=rows-1; i>=0; i--)
        {
            for(j=0; j <= i-1;j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
    }
}
