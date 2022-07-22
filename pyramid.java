import java.util.Scanner;
public class pyramid{
    public static void main(String[] args)
    {  int rows;
       Scanner s = new Scanner(System.in);
       
       System.out.print("Enter Value of Rows -:");
        rows = s.nextInt();
        
        for(int i=1;i<rows;i++)
        {
            for(int j=1;j<rows-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
