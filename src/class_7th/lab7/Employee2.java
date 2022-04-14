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
public abstract class Employee2 {
	String departmentName;

	private Date hireDate; // copy from lab #2 (DateSecondTry)

	public abstract double getPay();

	private String name;
	// handle any kind of error here
	public void errorHandler(String msg) {
		System.err.println("Fatal Error: " + msg);
		System.exit(0);
	}

	public Employee2() {
		name = "No name";
		hireDate = new Date("January", 1, 1000);	// Just a placeholder
	}

	// precondition: neither theName nor theDate is null
	public Employee2(String theName, Date theDate) {
		if(theName == null || theDate == null)
			errorHandler("creating employee.");
		name = theName;
		hireDate = new Date(theDate);
	}

	public Employee2(Employee2 orgObj) {
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
		
	public abstract String toString();

	
	public abstract boolean equals(Employee2 otherEmployee);
	
	public abstract boolean equals(Object otherObject);

	public boolean samePay(Employee2 other){
		return (this.getPay() == other.getPay());
	}
}
