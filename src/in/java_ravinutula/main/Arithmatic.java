package in.java_ravinutula.main;

public class Arithmatic {
	double result;
	
	void add(int a,int b) {
		
		result = a+b;
		System.out.println("add result: "+result);
		
	}
	
	void sub(int a,int b) {
		
		result = a-b;
		System.out.println("sub result: "+result);
		
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	void mul(int a,int b) 
	{
	
	result = a*b;
	System.out.println("mul result: "+result);
	
   }

	void div(int a,int b) {
		
		result = a/b;
		System.out.println("div result: "+result);
		
	   }

	public Arithmatic() {
		// TODO Auto-generated constructor stub
	}

}
