package class_7th.lab7;
/***
 * You cannot release or distribute 
 * this code without instructor's permission.
 * COMP217: Java Programming
 * Instructor: Prof. Suh, Young-Kyoon
 * Lab #7-2: Class IsADemo
 * @author yksuh
 */
 public class IsADemo {
	
	public static void main(String[] args) {
		SalariedEmployee joe; 
		HourlyEmployee sam; 
		
		
		joe = new SalariedEmployee("Josephine",new Date("March",21,1996),300000);
		sam = new HourlyEmployee("Samuel",new Date("April",30,1997),100.25,32);
	
		System.out.println("Is joe an object of SalariedEmployee or HourlyEmployee?");
		System.out.println("joe's longer name is " + joe.getName());
		System.out.println("showEmployee(joe) invoked.");
		showEmployee(joe);
		System.out.println();
		
		System.out.println("Is sam an object of SalariedEmployee or HourlyEmployee?");
		System.out.println("sam's longer name is " + sam.getName());
		System.out.println("showEmployee(sam) invoked.");
		showEmployee(sam);
	}
	
	public static void showEmployee(Employee empObj) {
		System.out.println(empObj);
	}
}
 
 