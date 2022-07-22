import java.util.Scanner;
public class Patternstar1{
    public static void main(String[] args)
    {
        int rows,coloumn;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter value of Rows:");
        rows = s.nextInt();
        
        System.out.print("Enter Value of Coloumn:");
        coloumn = s.nextInt();
        
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=coloumn;j++)
            {
                if(i == 1||j == 1||i ==rows||j ==coloumn)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            } System.out.println();
        }
    }
}
