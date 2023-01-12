package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {


        char ch = 'F';
        String result = "Passed";


        switch (ch) {
            case 'A':


            case 'B':


            case 'C':


            case 'D':

                System.out.println(result);
                System.out.println("your grade is " + ch);

                break;


            default:
                System.out.println("kaldınız.");

        }


    }
}
