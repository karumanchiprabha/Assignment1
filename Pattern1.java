public class Pattern1
{
    public static void main(String[] args)
    {
        int n=11;
        for (int i =0; i <n; i++)
        {
            //Logic For I
            for (int j = 0; j < n; j++)
            {
                if (j==(n-1)/2||i==0||i==n-1)
                {
                    System.out.print("I");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\t");
            System.out.print("\t");
            //Logic For N
            for (int j = 0; j <n ; j++)
            {
                    if(j==0||j==n-1||i==j)
                    {
                        System.out.print("N");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
            }
            System.out.print("\t");
            System.out.print("\t");
            //Logic for E
            for (int j = 0; j < n; j++) {
                if (j ==0||i==0||i==n-1||i==(n-1)/2)
                {
                    System.out.print("E");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\t");
            System.out.print("\t");
            //Logic For R
            for (int j = 0; j <n ;j++)
            {
//                if((i==0 && j<(n-1)/2)|| (i==(n-1)/2)&& j>0 && j<(n-1)/2
//                        ||
//                        (j==(n-1)/2 && i>0 && i!=(n-1)/2 && i<n-1) || j==0
//                )
               if( j==0 ||i==0&&j!=(n-1)||j==n-1&&i!=0&&i!=(n-1)/2||i==(n-1)/2&&j!=(n-1))
                {
                    System.out.print("R");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\t");
            System.out.print("\t");
            //Logic for O
            for (int j = 0; j <n; j++)
            {
                if(j==0&&i!=0&&i!=n-1||i==0&&j!=0&&j!=n-1||j==n-1&&i>0&&i!=n-1||i==n-1&&j>0&&j!=n-1)
                {
                    System.out.print("O");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\t");
            System.out.print("\t");
            //Logic for N
            for (int j = 0; j <n ; j++)
            {
                if(j==0||j==n-1||i==j)
                {
                    System.out.print("N");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
