class star
{
	public static void main(String args[])
	{
		for(int i =4;i>=1;i--)
		{
			for(int j=1;j<i+1;j++)
			{
				System.out.print(" ");
			}					
			System.out.print("*");
			int num=i;
			switch(i)
			{
				case 3:
				System.out.print(" ");				
				System.out.print("*");
				break;
				case 2:
				System.out.print("   ");
				System.out.print("*");
				break;
				case 1:
				System.out.print("     ");
				System.out.print("*");
				break;
			}
            System.out.println();			
		}	
        for(int z=1;z<10;z++)
		{
			System.out.print("* ");
		}			
			
	}
		
		
}
