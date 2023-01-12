package day30_CustomClass;

public class Dog {
    public String name;
    public String breed;
    public String color;
    public String gender;
    public int age;

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void bark() {
        System.out.println(name + " is barking");
    }

    public void setInfo(String dogName, String dogBreed, String dogColor, String dogGender, int dogAge) {
        name = dogName;
        breed = dogBreed;
        color = dogColor;
        gender = dogGender;
        age = dogAge;

    }


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
