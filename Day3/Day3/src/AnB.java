
public class AnB {
    public static void main(String[] args) {
        int a[] = {100,45,67,89,500,200};// 6 7
        int b[] = {100,200,300,400,500,700,900};
        int size;
        if(a.length>b.length)
        {
            size=b.length;
        }
        else
        {
            size=a.length;
        } int []c=new int[size];
        int i,j,k=0;
        for(i=0;i<a.length;i++)
        {
            for(j=0;j< b.length;j++)
            {
                if(a[i]==b[j])
                {
                    c[k++]=a[i];
// System.out.println(c[k]);
                }
            }
        }
        for(i=0;i<k;i++)
        {
            System.out.println(c[i]);
        }
    }
}