package day37_Inheritance;

public class Developer extends Employee{

    public Developer(String name, String jobTitle, double salary, int age, long id, char gender) {
        super(name, jobTitle, salary, age, id, gender);
    }

    public void fixBugs(){
        System.out.println(name + " is fixing bugs");
    }


}
