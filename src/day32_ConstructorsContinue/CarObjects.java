package day32_ConstructorsContinue;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car("toyota");
        Car car2 = new Car("ddd","bmw");
        Car car3 = new Car("ddd","bmw",2000);
        Car car4 = new Car("ddd","bmw",2000,5000);
        Car car5 = new Car("ddd","bmw",2000,5000,"red");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);


    }
}
