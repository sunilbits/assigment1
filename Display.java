public class Display
{
    public static void main(String[] args)
    {
         int num=0;
         System.out.print("Please Enter a number: ");   
         num=Integer.parseInt(System.console().readLine());
        for(int i=1;i<=num; i++)
       {
             for(int j = 1; j <= i; j++) 
             System.out.print(j + " ");
             System.out.println(" ");  
        }   
    }
}