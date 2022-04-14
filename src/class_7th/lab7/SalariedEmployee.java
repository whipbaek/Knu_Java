package class_7th.lab7;
/***
 * You cannot release or distribute 
 * this code without instructor's permission.
 * COMP217: Java Programming
 * Instructor: Prof. Suh, Young-Kyoon
 * Class SalariedEmployee
 * @author yksuh
 */
// class invariant: all objects have a name strine, 
//	hire date, and nonnegative salary. 
// "No Name": no real name specified yet. 
// A hire date of January 1, 1000: no real hireDate yet.
public class SalariedEmployee extends Employee{
	private double salary; // annual
	
	public SalariedEmployee() {
		super();	 // can be omitted.
		salary = 0;
	}
	
	// precondition: neither theName nor theDate is null;
	// theSalary is nonnegative
	public SalariedEmployee(String theName, Date theDate, double theSalary) {
		super(theName, theDate);
		if(theSalary >= 0) salary = theSalary;
		else 
			errorHandler("Negative salary");
	}
	
	public SalariedEmployee(SalariedEmployee orgObj) {
		super(orgObj); // An object of SalariedEmployee
					   // is also an object of Employee.
	}
	
	public double getSalary() { return salary;}
	
	// returns the pay for the month.
	public double getPay() { return salary/12;}
	
	// precondition: newSalary >= 0
	public void setSalary(double newSalary) {
		if(newSalary >= 0) {
			salary = newSalary;
		}else 
			errorHandler("Negative salary.");
	}
	
	public String toString() {
		return (getName() + " " 
				+ getHireDate().toString() 
				+ "\n$" + salary + " per year");
	}
	
	public boolean equals(SalariedEmployee other) {
		return (getName().equals(other.getName())
			&& getHireDate().equals(other.getHireDate()) 
			&& salary == other.salary);
	}
}
