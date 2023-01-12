package day37_Inheritance;

public class Teacher extends Employee{

    public Teacher(String name, String jobTitle, double salary, int age, long id, char gender) {
        super(name, jobTitle, salary, age, id, gender);
    }

    public void teaching(){
        System.out.println(name + " is teaching");
    }


}
