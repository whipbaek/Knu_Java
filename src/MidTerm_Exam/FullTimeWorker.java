package MidTerm_Exam;

public class FullTimeWorker extends Worker{
    private String name;
    private String department;
    private int startYear;
    private int baseVacation;

    public FullTimeWorker() {
    }

    public FullTimeWorker(String name,
                          String department,
                          int startYear,
                          int baseVacation) {
        this.name = name;
        this.department = department;
        this.startYear= startYear;
        this.baseVacation = baseVacation;
    }

    public FullTimeWorker(TemporaryWorker temporaryWorker){
        this.name = temporaryWorker.getName();
        this.department = temporaryWorker.getDepartment();
        this.startYear = temporaryWorker.getStartYear();
        this.baseVacation = 20;
    }

    public int calculateVacation(){
        int vacation = 0;

        vacation = this.baseVacation;

        switch (this.findPosition()){
            case "Staff" :
                vacation +=3;
                break;
            case "Senior" :
                vacation +=5;
                break;
            case "Manager" :
                vacation +=10;
                break;
        }

        return vacation;
    }

    public String findPosition() {
        String position = "";
      //implement this...
        int experiment = 2022 -startYear;

        if(experiment<=3) position = "Staff";
        else if(experiment <= 8) position = "Senior";
        else if(experiment > 8) position = "Manager";

        return position;
    }

    @Override
    public void print() {
    	//implement this...
        System.out.printf("%-10s %-10s %15d %10d ",this.name,this.department,this.startYear,this.baseVacation);

    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getDepartment() {return department;}

    public void setDepartment(String department) {this.department = department;}

    public int getStartYear() {return this.startYear ;}

    public void setStartYear(int startYear) {this.startYear = startYear;}

    public int getBaseVacation() {return baseVacation;}

    public void setBaseVacation(int baseVacation) {this.baseVacation = baseVacation;}
}
