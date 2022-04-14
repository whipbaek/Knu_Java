package class_7th.lab7;
/***
 * You cannot release or distribute 
 * this code without instructor's permission.
 * COMP217: Java Programming
 * Instructor: Prof. Suh, Young-Kyoon
 * Lab #7-3: Class InstanceOfDemo
 * @author yksuh
 */
public class InstanceOfDemo {

	public static void main(String[] args) {
		Employee e = new Employee("Joe", new Date());
		HourlyEmployee h = new 
		     HourlyEmployee("Joe", new Date(), 8.5, 40);
		
		boolean testH = e.equals(h);
		boolean testE = h.equals(e);

		System.out.println("testH = " + testH);
		System.out.println("testE = " + testE);

		System.out.println();
		
		Employee eObj = new Employee();
		HourlyEmployee heObj = new HourlyEmployee();

		System.out.println(eObj.getClass() == heObj.getClass());
		System.out.println((eObj instanceof Employee));
		System.out.println((heObj instanceof Employee));
		System.out.println((eObj instanceof HourlyEmployee));
		System.out.println((heObj instanceof HourlyEmployee));

		System.out.println();
	}
}

