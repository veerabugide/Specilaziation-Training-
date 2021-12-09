public class star18 {
    public static void main(String[] args) {
        int i, j, rows;

        rows = 5;
        for (i = rows; i >= 1; i--)
        {
            for (j = rows; j >= i; j--)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
