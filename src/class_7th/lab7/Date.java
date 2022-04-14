package class_7th.lab7;
/***
 * You cannot release or distribute 
 * this code without instructor's permission.
 * COMP217: Java Programming
 * Instructor: Prof. Suh, Young-Kyoon
 * Class Date: Copied from DateSecondTry
 * @author yksuh
 */
public class Date {
	private String month;
	private int day;
	private int year; // four digit number
	
	public Date() {
		this.month = "January";
		this.day = 1;
		this.year = 1900;
	}
	
	public Date(String month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public Date(Date orgDate) {
		if(orgDate == null) {
			System.exit(0);
		}
		this.month = orgDate.month;
		this.day = orgDate.day;
		this.year = orgDate.year;
	}
	
	public String toString(){
		return (month + "/" + day + "/" + this.year);
	}
	
	public boolean equals(Date otherDate){
		return (
			(month.equals(otherDate.month))
				&& (day == otherDate.day) 
				&& (year == otherDate.year) 
		);
	}
}
