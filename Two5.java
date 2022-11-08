class Two5
{
	public static void main(String args[])
	{
	for(int i=1;i<=4;i++)
	
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				
			System.out.print(j);
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(j);
			}
		System.out.println();
		}
		for(int i=3;i>=1;i--)
		{
	for(int j=3;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int j=i;j>=1;j--)
		{
			System.out.print(j);
			
		}
		for(int j=2;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	}
	
		
}
/* 1
  212
 32123
4321234
 32123
  212
   1*/