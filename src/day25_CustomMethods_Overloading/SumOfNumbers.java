package day25_CustomMethods_Overloading;

public class SumOfNumbers {
    public static void main(String[] args) {

        int result2;

        result2 = sumOf2Numbers(2,4);

        System.out.println(result2);

        int result3 = sumOf3Numbers(5,88,98);

        System.out.println(result3);

        int result4 = sumOf4Numbers(2,44,55,66);

        System.out.println(result4);




    }

    public static int sumOf2Numbers(int a, int b){
        int sum2 = 0;

        sum2 = a+b;



        return sum2;
    }

    public static int sumOf3Numbers(int a, int b, int c){
        int sum3 = 0;

        sum3 = a+b+c;



        return sum3;
    }

    public static int sumOf4Numbers(int a, int b , int c, int d){
        int sum4 = 0;

        sum4 = a+b+c+d;



        return sum4;
    }

}
