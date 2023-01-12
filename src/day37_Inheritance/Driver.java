package day37_Inheritance;

public class Driver extends Employee{

    public Driver(String name, String jobTitle, double salary, int age, long id, char gender) {
        super(name, jobTitle, salary, age, id, gender);
    }

    public void driving(){
        System.out.println(name + " is driving");
    }


}
