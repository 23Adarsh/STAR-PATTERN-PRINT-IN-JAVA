import java.util.Scanner;
public class star {
    public static void main(String[] args)
    {   
        int rows;
        Scanner s = new Scanner(System.in);
        System.out.print("Triangle Shape Star print:\n");
        
        System.out.print("Enter Value of Rows-:");
        rows = s.nextInt();
        
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}