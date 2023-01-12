package day36_Inheritance.animalTask;

public class Animal {

    public String name, breed,  color;
    public char gender, size;
    public int age;

    public void setInfo(String name, String breed, String color, char gender, char size, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.gender = gender;
        this.size = size;
        this.age = age;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }
    public void drink(){
        System.out.println(name + " is drinking");
    }
    public void move(){
        System.out.println(name + " is moving");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                ", age=" + age +
                '}';
    }


}
