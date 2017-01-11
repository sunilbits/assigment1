//Program for checking Prime no.

class PrimeVar
{
	int num=0;
}

class PrimeCal
{
	int i,n=0;

	public String prime(int no)
	{
		for(i=1;i<=no/2;i++)
		{		
		  if(no%i==0)
			n=n+1;	
		}
	
		if(n==1)
			return "Prime No.";
		else 	return "Not a Prime No.";
	}
	

}

class PrimeNo
{
	public static void main(String[] args)
	{
	PrimeVar pv=new PrimeVar();
	PrimeCal pc=new PrimeCal();
	System.out.print("Enter a Number : ");
	pv.num=Integer.parseInt(System.console().readLine());
	System.out.print(pc.prime(pv.num));
	
	
	}
}