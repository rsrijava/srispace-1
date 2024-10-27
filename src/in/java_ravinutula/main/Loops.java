package in.java_ravinutula.main;

public class Loops {
	
	
	int res;
	
	void least(int a,int b,int c)
	{
		res = (a<b)? (a<c? a:c):((b<c)? b:c);
		System.out.println("least value is: "+ res);
		
	}
	void great(int a,int b,int c)
	{
		res = (a>b)? (a>c? a:c):((b>c)? b:c);
		System.out.println("Greatest value is: "+ res);
		
	}
	
	void Square()
	{
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++) 
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	void Triangle(int n)
	{
		for (int i=1;i<=n;i++)
		{
			for (int j=0;j<i;j++) 
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
		void Fibbo(int n)
		{
			for (int i=1;i<=n;i++)
			{
				for (int j=0;j<i;j++) 
				{
					System.out.print(i);
				}
				System.out.println();
			}
		
	    }
		void Emptysq(int n)
		{
			for (int i=0;i<n;i++)
			{
				for (int j=0;j<n;j++) 
				{
					if (i==0||(i==(n-1))||(j==0)||(j==(n-1))||(i==j)||((i+j)==(n-1)))
					{
						System.out.print(" "+"*");
					}
					else
					{
						System.out.print("  ");
					}
							
					
				}
				System.out.println();
			}
		
	     }
		void iNeuron(int n)
		{
			for (int i=0;i<n;i++)
			{
				for (int j=0;j<n;j++) 
				{
					if ((i==0 && j<(n-1)/10 ||i==n-1&& j<(n-1)/10||j==(n-1)/30)
							||(j==(n+1)/10)||(j==(2*(n-1))/10)
							|| ((i==j) && j>(n-1)/10 && j<(2*(n-1))/10) )
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
							
					
				}
				System.out.println();
			}
//			for (int i=0;i<n;i++)
//			{
//				for (int j=0;j<n;j++) 
//				{
//					if (i==0 &&j>(n-1)/10 &&j<(2*(n-1))/10 ||i==n-1 && j>(n-1)/10 &&j<(2*(n-1))/10||j==(n-1)/30)
//					{
//						System.out.print("*");
//					}
//					else
//					{
//						System.out.print(" ");
//					}
//							
//					
//				}
//				System.out.println();
//			}
		
	     }
		void Emptyd(int n)
		{
			for (int i=0;i<n;i++)
			{
				for (int j=0;j<n;j++) 
				{
					if ((i==0 && j<n-1)||(i==(n-1)&& j<n-1)||(j==0)||(j==(n-1)&& i>0 && i<n-1))
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
							
					
				}
				System.out.println();
			}
		
	     }
		void Foursq(int n)
		{
			for (int i=0;i<n;i++)
			{
				for (int j=0;j<n;j++) 
				{
					if (i==0||(i==(n-1))||(j==0)||(j==(n-1))||(i==n/2)||j==n/2)
					{
						System.out.print(" "+"*");
					}
					else
					{
						System.out.print("  ");
					}
							
					
				}
				System.out.println();
			}
		
	     }

		void Emptyh(int n)
		{
			for (int i=0;i<n;i++)
			{
				for (int j=0;j<n;j++) 
				{
					if ((i==(n/2))||(j==0)||(j==(n-1)))
					{
						System.out.print(" "+"*");
					}
					else
					{
						System.out.print("  ");
					}
							
					
				}
				System.out.println();
			}
		
	     }
		void Emptye(int n)
		{
			for (int i=0;i<n;i++)
			{
				for (int j=0;j<n;j++) 
				{
					if (i==0||(i==(n-1))||(i==(n/2))||(j==0))
					{
						System.out.print(" "+"*");
					}
					else
					{
						System.out.print("  ");
					}
							
					
				}
				System.out.println();
			}
		
	     }
		/*int Fib(int n)
		{
			Fib(0)=0;
			for (int i=2;i<=n+1;i++)
			{
				for (int j=1;j<i;j++) 
				{
					int res=Fib(j)+ Fib(j-1);
					System.out.print(" "+res);
					return (res);
				}
				System.out.println();
			}
		
	    }*/
}
