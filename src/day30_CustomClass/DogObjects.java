package day30_CustomClass;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 2;
        dog1.gender = "male";
        dog1.color = "gray";

        System.out.println(dog1);

        Dog dog2 = new Dog();

        dog2.setInfo("chow chow", "kkkk","pink", "female", 3);

        System.out.println(dog2);

    }
}
