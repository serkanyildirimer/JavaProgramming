package day15_ForLoop;

public class ForLoopExample2 {

    public static void main(String[] args) {

        int i = 1;


        for (i = 1; i <= 100; i++) {

            if (i % 15 == 0) {

                System.out.print("FINRA" + " ");

            } else if (i % 5 == 0) {
                System.out.print("RA" + " ");

            } else if (i % 3 == 0) {
                System.out.print("FIN" + " ");

            } else {
                System.out.print(i + " ");
            }


        }
    }
}


