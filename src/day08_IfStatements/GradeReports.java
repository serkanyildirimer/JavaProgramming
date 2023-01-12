package day08_IfStatements;

public class GradeReports {

    public static void main(String[] args) {

        int score;

        score = 50;

        boolean excellent = score >= 90 && score <= 100;
        boolean great = score >= 80 && score <= 89;
        boolean good = score >= 70 && score <= 79;
        boolean passed = score >= 60 && score <= 69;
        boolean failed = score >= 0 && score <= 59;


        if (excellent) {
            System.out.println("your great is excellent");
        }
        if (great) {
            System.out.println("your great is great" + great);
        }
        if (good) {
            System.out.println("your great is good");
        }
        if (passed) {
            System.out.println("your great is passed");
        }
        if (failed) {
            System.out.println("your great is failed");
        }


    }
}

/*
 90 100 excellent
 80 89 great
 70 79 good
 60 69 passed
 0 59 failde

 */