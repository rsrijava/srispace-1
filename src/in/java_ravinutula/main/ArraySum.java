package in.java_ravinutula.main;

import java.util.*;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan= new Scanner(System.in);
		System.out.println("Enter array size:");
		Scanner scan= new Scanner(System.in);
		int aS= scan.nextInt();
		int ar[]= new int[aS];
		
		for (int i=0;i<ar.length;i++ ) 
		{
			System.out.println("Please enter the marks for student #:"+i);
			ar[i]=scan.nextInt();
		}
		Arrays.sort(ar);
		System.out.println("Here is the sorted list of marks:");
		
		for(int key:ar)
		{
			System.out.print(key+" ");
		}
		System.out.println();
		Arrays.fill(ar,(ar.length-4),(ar.length-2),95);
System.out.println("Here is the updated marks list:");
		
		for(int key:ar)
		{
			System.out.print(key+" ");
		}
		//System.out.println();
		
		
		//Arrays.
	}

}
