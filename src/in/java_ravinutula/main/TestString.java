package in.java_ravinutula.main;
import java.util.*;
public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= new String("sachin");
		s1.concat("tendulkar");//sachinTendulkar - GC eligible
		s1+="IND";//sachinIND - sachin becomes GC eligible
		String s2=s1.concat("MI");//sachingINDMI
		System.out.println(s1);
		System.out.println(s2);
		
		String s10= new String ("virat");
		String s20= s10.intern();
		
		//int i= (int) s20;
		System.out.println(s10);
		System.out.println(s20);
		
		String key,N;
		char c;
		int m=0;
		String x,y;
		String result="";
		char a,b;
		int l=0;
		y=null;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the string:");
		String k= sc.nextLine();
		
		for(int i=0;i<k.length();i++)
			{
			char ch=k.charAt(i);
						
				for(int j=0;j<result.length();j++) 
					{
						if(ch==result.charAt(j))
							{
								l++;
								
							}
					}
			if(l==0)
			{
				result+=ch;
			}
			l=0;
		//System.out.println("the new string :"+result);
		
		//String Result= RemoveDuplicate(k);
		//System.out.println(Result);
		
		
			}
		System.out.println("the new string :"+result);
	}
}
//	 class RemoveDuplicate(String s)
//	{
//		String x,y;
//		char a,b;
//		int l;
//		
//		l=s.length();
//		y=s;
//		
//		for(int i=0;i<s.length();i++)
//		{
//			for(int j=i+1;j<s.length();j++) 
//			{
//				a=s.charAt(i);
//				b=s.charAt(j);
//			
//				if (a==b)
//				{
//					continue;
//				}
//				else
//				{
//					y=y+a;
//				}
//			}
//			
//		}
//		return y;
//		
//	}


