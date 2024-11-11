package in.java_ravinutula.main;
import java.util.*;




public class SortObject {
	
	class Employee implements Comparable
	{
		int eid;
		String ename;
		
		Employee (int eid,String ename)
		{
			this.eid=eid;
			this.ename=ename;
		}
		
		public String toString()
		{
			return eid+"--"+ ename;
		}
		
		@Override
		public int compareTo(Object o)
		{//sort the Employee object based on employee id in ascending order
			int eid1=this.eid;
			
			
			Employee e1= (Employee)o;
			int eid2=e1.eid;
			
			if (eid1<eid2)
				return -5;
			else if (eid1>eid2)
				return 5;
			else
				return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JVM uses Comparable compareTo() to sort the Object added into TreeSet
				//Compulsorily the Object should implement Comparable otherwise ClassCastException
				
				TreeSet t= new TreeSet();
				
				t.add("s");
				t.add("r");
				t.add("i");
				t.add("k");
				t.add("a");
				t.add("r");
				
				System.out.println("sorted alphabet list is:"+t);
				
				System.out.println("===========");
				
				TreeSet ctid= new TreeSet();
				
				//Employee e1 = new Employee (10,"Sachin");
				//Employee e1 = new Employee (10,"Sachin");
//				//Employee e2 = new Employee(14,"Ponting");
//				Employee e3 = new Employee(9,"lara");
//				Employee e4 = new Employee(12,"Gooch");
				
				//ct.add(e1);
				//ctid.add(e2);
//				ctid.add(e3);
//				ctid.add(e4);
				
				System.out.println("sorted players list is:"+ctid);
				
				System.out.println("===========");
				
				//JVM uses MyComparator compareTo() to sort the Object added into TreeSet
				/*
				 * TreeSet ctname= new TreeSet(new MyComparator());
				 * 
				 * Employee e11 = new Employee (10,"Sachin"); Employee e22 = new
				 * Employee(14,"Ponting"); Employee e33 = new Employee(9,"lara"); Employee e44 =
				 * new Employee(12,"Gooch");
				 * 
				 * ctname.add(e11); ctname.add(e22); ctname.add(e33); ctname.add(e44);
				 * 
				 * System.out.println("sorted players list is:"+ctname);
				 */

			}
	
			/*
			 * class MyComparator implements Comparator { public int compareTo(Object o1,
			 * Object o2) { // sort the names based on alphabetical order
			 * 
			 * Employee e11 = (Employee) o1; Employee e22 = (Employee) o2;
			 * 
			 * String e11name = e11.ename; String e22name = e22.ename;
			 * 
			 * //making a call to compareTo() to sort the date in ascending order return
			 * e11name.compareTo(e22name);
			 * 
			 * } }
			 */



}
