package day37_Inheritance;

public class Employee {

    public String name, jobTitle;
    public double salary;
    public int age;
    public long id;
    public char gender;

    public void work(){
        System.out.println(name + " is working");
    }

   // @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", id=" + id +
                ", gender=" + gender +
                '}';
    }

    public Employee(String name, String jobTitle, double salary, int age, long id, char gender) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.age = age;
        this.id = id;
        this.gender = gender;
    }
}
