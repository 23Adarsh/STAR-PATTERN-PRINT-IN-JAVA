import java.util.Scanner;
public class rombus{
    public static void main(String[] args)
    {
        int rows;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter value of Rows -:");
        rows = s.nextInt();
        
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=rows-i;j++)
            {
                System.out.print(" ");
            }
            
            for(int k=1;k<=5;k++)
        {
            System.out.print("*");
        }
        System.out.println();
        }
    
        
    }
}
