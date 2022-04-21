package MidTerm_Exam;

public class TemporaryWorker extends Worker{
    private String name;
    private String department;
    private int startYear;
    private int baseVacation;
    private int score;

    public TemporaryWorker(String name,
                           String department,
                           int startYear,
                           int baseVacation,
                           int score) {
        this.name = name;
        this.department = department;
        this.startYear = startYear;
        this.baseVacation = baseVacation;
        this.score = score;
    }

    public boolean isFulltimeWorker() {
        return this.score>80;
    }
    
    @Override
    public void print() {
        System.out.printf("%-10s %-10s %15d %10d %15d ",this.name,this.department,this.startYear,this.baseVacation,this.score);
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getDepartment() {return department;}

    public void setDepartment(String department) {this.department = department;}

    public int getStartYear() {return startYear;}

    public void setStartYear(int startYear) {this.startYear = startYear;}

    public int getBaseVacation() {return baseVacation;}

    public void setBaseVacation(int baseVacation) {this.baseVacation = baseVacation;}

    public int getScore() {return score;}

    public void setScore(int score) {this.score = score;}
}
