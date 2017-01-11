//Calculate Aliqote Sum

class AliquotVar
{
	int num=0;
	
}

class AliquotCal
{
int num1=0;
	
	public int aliquot(int no)
	{
		for(int i=1;i<no;i++)
		{		
		  if(no%i==0)
			num1=num1+i;	
		}
	
		return num1;
	}
	
}

class AliquotSum
{
	public static void main(String[] args)
	{
	AliquotVar av=new AliquotVar();
	AliquotCal ac=new AliquotCal();
	System.out.print("Enter a Number : ");
	av.num=Integer.parseInt(System.console().readLine());
	System.out.print("Aliquot Sum is :"+ac.aliquot(av.num));
	}
}