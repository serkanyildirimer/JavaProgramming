package day06_PrimitiveTypeCasting;

public class PrimitiveCasting {
    public static void main(String[] args) {

        // double>float>long>int>short>byte

        int x = 55;
        short y = (short) x; // explicit casting

        System.out.println(y + "\n");

        //System.out.println("");

        int a = 2;
        long b = a;

        System.out.println(b);

    }

}
