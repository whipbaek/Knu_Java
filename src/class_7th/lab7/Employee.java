package class_7th.lab7;
/***
 * You cannot release or distribute 
 * this code without instructor's permission.
 * COMP217: Java Programming
 * Instructor: Prof. Suh, Young-Kyoon
 * Practice of Inheritance
 * Employee Class
 * @author yksuh
 */
public class Employee {
	String departmentName;
	
	private Date hireDate; // copy from lab #2 (DateSecondTry)
	
	private String name;
	// handle any kind of error here
	public void errorHandler(String msg) {
		System.err.println("Fatal Error: " + msg);
		System.exit(0);
	}
		
	public Employee() {
		name = "No name";
		hireDate = new Date("January", 1, 1000);	// Just a placeholder	
	}
	
	// precondition: neither theName nor theDate is null
	public Employee(String theName, Date theDate) {
		if(theName == null || theDate == null) 
			errorHandler("creating employee.");
		name = theName;
		hireDate = new Date(theDate);
	}
	
	public Employee(Employee orgObj) {
		name = orgObj.name;
		hireDate = orgObj.hireDate;
	}
	
	public String getName() { return name;}
	
	public Date getHireDate() { return new Date(hireDate); }
		
	// precondition: newName isn't null
	public void setName(String newName) {
		if(newName == null) 
			errorHandler("setting employee name.");
		else
			name = newName;
	}

	// precondition newDate is not null.
	public void setHireDate(Date newDate) {
		if(newDate == null)
			errorHandler("setting employee hire date.");
		else
			hireDate = new Date(newDate);
	}
		
	public String toString() { // In the Employee class
		return name + " " + hireDate.toString(); 
	}
	
	public boolean equals(Employee otherEmployee) {
		return (name.equals(otherEmployee.name) && 
				hireDate.equals(otherEmployee.hireDate));
	}
	
	public boolean equals(Object otherObject) {
		if(otherObject == null) return false;
//		else if(this.getClass() != otherObject.getClass()) {
		else if(!(otherObject instanceof Employee))
			return false; 
		else {
			Employee otherEmployee = (Employee)otherObject;
			return (name.equals(otherEmployee.name) && 
					hireDate.equals(otherEmployee.hireDate));
		}
	}
}
