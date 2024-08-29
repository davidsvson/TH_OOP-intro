import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        Person p1 = new Person();
//        Person p2 = new Person();
//
//        Person p3 = p2;
//
//        p2.setName("Susan");
//
//        Person p4 = new Person("david", 46);
//
//        System.out.println(p4.getName());

        Account savingAccount = new Account();
        Account salaryAccount = new Account(1000.0);

        System.out.println(savingAccount.getBalance());

        savingAccount.deposit(500.0);
        savingAccount.withdraw(800.0);

        System.out.println(savingAccount.getBalance());


        Scanner scanner = new Scanner(System.in);

        System.out.println("hur mycket pengar ska tas ut: ");
        int amount = scanner.nextInt();


        savingAccount.withdraw(amount);

        System.out.println(savingAccount.getBalance());















    }
}