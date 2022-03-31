package class_5th.lab4;

public class PersonDemo {
    public static void main(String[] args) {

        Person bach = new Person("bach",new Date(3,31,1685), new Date(7,28,1750));
        Person stravinsky = new Person("stravinsky",new Date(6,17,1882), new Date(4,6,1971));
        Person adams = new Person("adams", new Date(2, 15, 1947));

        System.out.println("A Short List of Composers :");
        System.out.println(bach);
        System.out.println(stravinsky);
        System.out.println(adams);

        Person bachTwin;
        bachTwin = new Person(bach);

        System.out.println("Comparing bach and bachTwin:");
        if(bachTwin == bach){
            System.out.println("Same reference for both");
        } else{
            System.out.println("Distinct copies");
        }
        if(bachTwin.equals(bach)){
            System.out.println("Same data.");
        } else{
            System.out.println("Not same data.");
        }
    }
}
