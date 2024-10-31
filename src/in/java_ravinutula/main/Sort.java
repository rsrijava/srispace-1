package in.java_ravinutula.main;

import java.util.*;

public class Sort {

	public static void main(String[] args)
	{
		
		System.out.println("enter the array length:");
		Scanner s= new Scanner(System.in);
		int aL=s.nextInt();
		System.out.println();
		
		int[] ar= new int[aL];
		//Scanner sc= new Scanner(System.in);
		
		//Adding values to the array
		for (int i=0;i<ar.length;i++)
		{
			System.out.println("enter the array value#:"+i);
			ar[i]=s.nextInt();
		}
		
		//Displaying the array
		System.out.println("Below is the arrya you entered:");
		for(int k:ar) 
		{
			System.out.print(k+" ");
		}
		
		System.out.println();
		System.out.println("==========");
		//sorting using bubble sort
		for (int l=0;l<ar.length;l++)
		{
			for (int m=1;m<ar.length-l;m++) 
			{
				if(ar[m]<ar[m-1])
				{
					int temp=ar[m];
					ar[m]=ar[m-1];
					ar[m-1]=temp;
				}
			}
			//System.out.print(ar[l]+" ");
		}
		System.out.println();
		System.out.println("---------");
		
	 	// print the sorted array
		System.out.println("Below is the sorted array:");
		for (int el:ar) 
		{
			System.out.println(el+" ");
			
		}

	}

}
