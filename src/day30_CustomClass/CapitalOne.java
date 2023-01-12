package day30_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("John",2276,'M',22,"qa",3400.00,true);
        employee2.setInfo("John2",2276,'M',22,"qa",3400.00,true);
        employee3.setInfo("John3",2276,'M',22,"qa",3400.00,true);
        employee4.setInfo("John4",2276,'M',22,"qa",3400.00,true);
        employee5.setInfo("John8",2276,'M',22,"qa",3400.00,true);

        Employee[] employees = {employee1,employee2, employee3, employee4,employee5};

        int countFullTime = 0;
        int partTime = 0;

        for (Employee each : employees ) {

            if (each.isFullTime){
                countFullTime++;
            }else {
                partTime++;
            }

        }


    }
}
