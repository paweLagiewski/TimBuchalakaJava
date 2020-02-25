package Exercise;

import Exercise.BankAccount.BankAccounts;
import Exercise.BankAccount.VipCustomer;

public class Main {

    public static void main(String[] args) {

        // BankAccounts
        BankAccounts billy = new BankAccounts("1234", 1000, "Billy Stewart",
                "billy#cos.com", "555-555-555");

        billy.setBalance(1000);
        System.out.println(billy.getBalance());
        billy.deposit(5000);
        billy.withdraw(100);

        BankAccounts account = new BankAccounts();

        BankAccounts tims = new BankAccounts("Tim", "tim@email.com", "123456798");
        System.out.println(tims.getAccountNumber() + " name " + tims.getCustomerName()) ;

        //VipCustomer
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 2000);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 20000, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());
    }

}
