import java.util.Scanner;
public class butter{
    public static void main(String[] args)
    {
        int rows;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Value of Rows -:");
        rows = s.nextInt();

        for(int i=1;i<rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            int spaces = 2*(rows-i);
            
            for(int k=1;k<=spaces;k++)
            {
                System.out.print(" ");
            }

            for(int l=1;l<=i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=rows;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            int spaces = 2*(rows-i);
            
            for(int k=1;k<=spaces;k++)
            {
                System.out.print(" ");
            }

            for(int l=1;l<=i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
