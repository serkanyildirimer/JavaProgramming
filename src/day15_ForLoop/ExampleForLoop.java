package day15_ForLoop;

public class ExampleForLoop {
    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        char ch = '*';


        for (j = 1; j <= 8; j++) {


            for (i = 1; i <= 6; i++) {

                System.out.print(ch + " ");

            }

            System.out.println();
        }
    }
}
