package day24_CustomMethods_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {

        int a = 150;
        int b = 185;

        int result = maxNumber(a,b) * 2;

        System.out.println(result);

    }

    public static int maxNumber (int a, int b){

        int max = 0;



        if (a>b){
            max =a;
        } else if (b>a) {
            max = b;

        }else {
            max=a;}


        return max;
    }

}
