package day37_Inheritance;

public class Tester extends Employee {

    public Tester(String name, String jobTitle, double salary, int age, long id, char gender) {
        super(name, jobTitle, salary, age, id, gender);
    }

    public void creatingTicket(){
        System.out.println(name + " is creating Tickets");
    }


}
