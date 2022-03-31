package class_5th.lab4;

public class Person {
    private String name;
    private Date born;
    private Date died;

    public Person(String name, Date born, Date died) {
        this.name = name;
        this.born = born;
        this.died = died;
    }

    public Person(String name, Date born) {
        this.name = name;
        this.born = born;
    }

    public Person(Person otherPerson){
        this.name = new String(otherPerson.getName());
        this.born = new Date(otherPerson.getBorn());
        this.died = new Date(otherPerson.getDied());
    }

    private static boolean consistent(Date birthDate, Date deathDate) {
        if (birthDate == null || deathDate == null) {
            System.out.println("object is null");
            return false;
        }

        if (birthDate.getYear() > deathDate.getYear()) return false;
        if (birthDate.getYear() == deathDate.getYear()) {
            if (birthDate.monthString(birthDate.getMonth()) > birthDate.monthString(deathDate.getMonth()))
                return false;
            else {
                if (birthDate.monthString(birthDate.getMonth()) == birthDate.monthString(deathDate.getMonth())) {
                    if (birthDate.getDay() >= deathDate.getDay()) return false;
                }
            }
        }
        return true;
    }

    public boolean equals(Person otherPerson) {
        if (this.getName().equals(otherPerson.getName()) &&
                this.getBorn().equals(otherPerson.getBorn()) &&
                this.getDied().equals(otherPerson.getDied()) ) return true;
        return false;
    }

    private static boolean datesMatch(Date date1, Date date2) {
        if(date1.equals(date2)) return true;
        return false;
    }

    public String toString() {
        String string = new String(this.name + ", " + this.born);
        if(this.died != null) {
            string += ", " + this.died;
        }

        return string;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public Date getDied() {
        return died;
    }

    public void setDied(Date died) {
        this.died = died;
    }
}
