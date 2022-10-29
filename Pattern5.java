public class Pattern5
{
    public static void main(String[] args)
    {

        for (int i = 0; i <14; i++)
        {
            for (int j = 0; j <14; j++)
            {
                if(i==0)
                {
                    System.out.print("*");
                }
            }
        }
        System.out.println();
        int i, j, n=6;
//Prints upper half  pattern
        for (i = n; i >= 1; i--)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
//Prints lower half  pattern
        for (i = 2; i <= n; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for ( i = 0; i <14 ; i++)
        {
            for (j = 0; j <14; j++)
            {
                if(i==n-1)
                {
                    System.out.print("*");
                }
            }
        }
        System.out.println();
    }
}

