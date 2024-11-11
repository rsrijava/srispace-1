package in.java_string.main;
import java.util.*;

public class Pangram 
{

	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//String s1;
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("plz enter the string:");
		String s=sc.nextLine();
		
		System.out.println("===");
		
		CheckPangram c=new CheckPangram();
		c.pangram(s);
		
		
	}
}
	class CheckPangram
	{
		boolean flag=false;
		void pangram(String str)
		{
			String s11=str.replace(" ","");
			String s1=s11.toLowerCase();
			
			char[] ch=s1.toCharArray();
			System.out.println(ch);
			int[] arr=new int[26];
			for (int i=0;i<ch.length;i++)
			{
				//System.out.print(ch[i] +" ");
				int index=ch[i]-97;
				arr[index]++;
			}
			for (int j=0;j<arr.length;j++)
			{
				if(arr[j]==0)
				{
					System.out.println("its not a pangram!");
					flag=true;
				}
				
			}
			if(flag==false)
			{
				System.out.println("its a pangram!");
				
			}
			
		}
	}


