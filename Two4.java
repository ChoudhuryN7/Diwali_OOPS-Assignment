class Two4
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1 || j==i)
					System.out.print(1+" ");
				 else if(j==2)
				{
					int x=i-1;
					System.out.print(x+" ");
				}
				 else if(j+1==i)
					System.out.print(j+" ");
				 else //if(j+2==i)
				 {
				    int g=i+1;
					System.out.print(g+" ");
				 }
				
					
					
			}
			System.out.println();
		}
	}
}