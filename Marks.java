public class Marks
{
    public static void main(String[] args)
    {
         String result="Fail";
         int marks=0;
         int age=0;
         System.out.print("Please Enter a Marks: "); 
         marks=Integer.parseInt(System.console().readLine()); 
         System.out.print("Please Enter Your Age");  
         age=Integer.parseInt(System.console().readLine());
        
       
      if(marks>70 || (marks>60 && age<15) )
         result="A";
      else if( (marks>60 && marks<71)  ||  ((marks>44 && marks<61) && age<15))
         result="B";
     
      else if( (marks<61)  || (marks<45 && age<15) )  
       result="C";
      
       System.out.print(return "Your Grade is :"+result);
       
    }
}