package in.java_ravinutula.main;
import java.util.*;
//public class ArraySum
// {
//	
//	
//	
//	
//}
	


public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the array size:");
		int aL= sc.nextInt();
		
		
		int ar[]= new int[aL];
		
		for (int i=0;i<ar.length;i++ ) 
		{
			System.out.println("Please enter the marks for student #:"+i);
			ar[i]=sc.nextInt();
		}
		System.out.println();
		System.out.println("The marks of all students are:");
		
		for(int std:ar) 
		{
			System.out.println(std);
			
		}
		

	}

}

