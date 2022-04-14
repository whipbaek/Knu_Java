package class_7th.lab7;

public class TitledEmployee extends SalariedEmployee {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TitledEmployee() {
        super();
    }

    public TitledEmployee(String theName, Date theDate, double theSalary, String theTitle) {
        super(theName, theDate, theSalary);
        this.title = theTitle;
    }

    public String getName() {
        return super.getName() + " , " + title;
    }
}
