package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {


        BankAccount bankAccount = new BankAccount();

        bankAccount.setInfo("Sertkan Yıldırımer",223456789,1000);

        bankAccount.deposit(1000);
        bankAccount.checkBalance();

        bankAccount.withdraw(500);
        bankAccount.checkBalance();


    }
}
