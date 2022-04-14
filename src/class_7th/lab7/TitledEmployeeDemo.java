package class_7th.lab7;

/***
 * You cannot release or distribute 
 * this code without instructor's permission.
 * COMP217: Java Programming
 * Instructor: Prof. Suh, Young-Kyoon
 * Lab #7-1: TitledEmployeeDemo
 * @author yksuh
 *
 */
public class TitledEmployeeDemo {
	public static void main(String[] args) {
		
		TitledEmployee whjeon, yksuh;
		
		whjeon = new TitledEmployee("Woohyuk Jeon",new Date("January",1,1996),300000, "Director");
		yksuh = new TitledEmployee("Young-Kyoon Suh",new Date("September",20,1990),400000,"CEO");
		
		System.out.println("yksuh's title and name:" + yksuh.getName());
		System.out.println("whjeon's name: " + whjeon.getName());
		System.out.println();
		
		showEmployee(yksuh);
		
		System.out.println();
		
		System.out.println("whjeon invoked.");
		showEmployee(whjeon);
	}
	
	public static void showEmployee(SalariedEmployee emp) {
		System.out.println("Salary: " + emp.getSalary());
		System.out.println("Hire Date: " + emp.getHireDate());
	}
}

