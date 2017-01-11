public class TestDemo
{
    public static void main(String[] args)
    {
         int num=0;
         System.out.print("Please Enter a number: ");   
         num=Integer.parseInt(System.console().readLine());
         if(num== 0)
            System.out.println("You have entered zero value");
         else if (num < 0)
	    System.out.println("You have entered Negetive value ");
	 else 
	    System.out.println("You have entered positive value ");     
    }
}