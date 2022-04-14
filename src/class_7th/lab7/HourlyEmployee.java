package class_7th.lab7;
/***
 * You cannot release or distribute 
 * this code without instructor's permission.
 * COMP217: Java Programming
 * Instructor: Prof. Suh, Young-Kyoon
 * Class HourlyEmployee
 * @author yksuh
 */
// class invariant: all objects have a name string, hire date, 
// nonnegative wage rate, and nonnegative number of hours worked. 
// a name string of "No name" indicates no real name specified yet. 
// A hire date of January 1, 1000 indicates no real hire date specified yet.

public class HourlyEmployee extends Employee {

	// handle any kind of error here
	public void errorHandler(String msg) { 
		System.err.println("HourlyEmployee-Fatal " +
				"Error: " + msg);
		System.exit(0);
	}
		
	private double wageRate;
	private double hours;	// for the month
		
	public HourlyEmployee() {
		this("yksuh", new Date("Jan", 1, 2018), 
			 0, 0);
		wageRate = 0;
		hours = 0;
	}
	
	// precondition: neither theName nor theDate is null
	// theWageRate and theHours are nonnegative.
	public HourlyEmployee(String theName, Date theDate, 
						double theWageRate, double theHours) {
		super(theName, theDate);
		if((theWageRate >= 0) && (theHours >= 0)) {
			wageRate = theWageRate;
			hours = theHours;
		}else 
			errorHandler("creating an illegal hourly employee.");
	}
	
	// "is a" relationship
	// HourlyEmployee "is" Employee.
	
	public HourlyEmployee(HourlyEmployee orgObj) {       
		super(orgObj); 
		wageRate = orgObj.wageRate;
		hours = orgObj.hours;
	}
	
	public double getRate() { return wageRate;}
	public double getHours() { return hours;}
	
	// returns the pay for the month.
	public double getPay() { return wageRate*hours;}
	
	// precondition: hoursWorked is nonnegative.
	public void setHours(double hoursWorked) {
		if(hoursWorked >= 0) 
			hours = hoursWorked;
		else 
			errorHandler("Negative hours worked.");
	}
	
	// precondition: newWageRate is nonnegative.
	public void setRate(double newWageRate) {
		if(newWageRate >= 0) 
			wageRate = newWageRate;
		else 
			errorHandler("Negative wage worked.");
	}
	
	public String toString() { // In the HourlyEmployee class
		return (getName() + " " + getHireDate().toString() 
				+ "\n$" + wageRate + " per hour for " 
				+ hours + " hours");
	}

	public boolean equals(Employee otherObject) {
		if(otherObject == null) return false;

		if(this.getName() == otherObject.getName() &&
		   this.getHireDate() == otherObject.getHireDate()) return true;

		return false;
	}
}
