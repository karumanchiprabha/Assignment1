public class Pattern5
{
    public static void main(String[] args)
    {

        int i, j, n=13;
        for (i = 0; i<n; i++)
        {
            for (j = 0; j <n; j++)
            {
                if(i==0||i==n-1||j==0||i==1&&j<n/2||i==n-2&&j<n/2||i==2&&j<=i+(n-j-1)/2||i==3&&j<(n/2)-2 ||i==4&&j<(n/2)-3||
                  i==5&&j<(n/2)-4||i==6&&j<(n/2)-5||i==n-3&&j<(n/2)-1||i==n-4&&j<(n/2)-2||i==n-5&&j<(n/2)-3||i==n-6&&j<(n/2)-4)
                {
                    System.out.print("*");
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
