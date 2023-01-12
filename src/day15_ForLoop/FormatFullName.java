package day15_ForLoop;

public class FormatFullName {

    public static void main(String[] args) {

        String firstName = "JOSH";
        String lastName = "smITH";

        firstName = firstName.charAt(0) + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println("first name :" + firstName);
        System.out.println("last name :" + lastName);



    }
}
