package class_7th.lab7;

public class AbstractClassDemo {
    public static void main(String[] args) {
        SalariedEmployee2 joe = null;
        HourlyEmployee2 jimmy = null;

        joe = new SalariedEmployee2("Joe Worker",new Date("February",1,2015), 1200);
        jimmy = new HourlyEmployee2("Jim Gray",new Date("September",5,1936),50.5,160);

        System.out.println(joe.getClass());
        System.out.println("Monthly Income : $" + joe.getPay());
        System.out.println(joe);

        System.out.println();
        System.out.println(jimmy.getClass());
        System.out.println("Total Pay : $" + jimmy.getPay());
        System.out.println(jimmy);

        System.out.println();

        if(joe.samePay(jimmy))
            System.out.println("Their pays are same");
        else
            System.out.println("Their pays are different.");

    }
}
