package day31_Constructors;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                '}';
    }

    public void calcCost() {

        int pizzaCost = 0;

        if (size == 'S') {
            pizzaCost = 10 + (2 * (numberOfCheeseTopping + numberOfPepperoniTopping));
        }else if (size == 'M'){

                pizzaCost = 12 + (2 * (numberOfCheeseTopping + numberOfPepperoniTopping));

        }else {
            pizzaCost = 14 + (2 * (numberOfCheeseTopping + numberOfPepperoniTopping));

            return;
        }

        System.out.println("Pizza cost is:  $"+pizzaCost);
    }

}
