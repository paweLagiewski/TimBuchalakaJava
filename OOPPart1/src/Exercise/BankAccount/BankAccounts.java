package Exercise.BankAccount;

import java.sql.SQLOutput;

public class BankAccounts {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccounts() {
        this("5679", 2.500, "Default Name", "Default address",
                "default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccounts(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parametrs called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public BankAccounts(String customerName, String email, String phoneNumber){
        this("99999", 100.55, customerName, email, phoneNumber);
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return this.customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void deposit (double deposit){
        this.balance = this.balance + deposit;
        System.out.println("Your current balance is " + this.balance);
    }

    public void withdraw (int withdraw){

        if(withdraw > this.balance){
            System.out.println("Insufficient Funds");
        } else {

            this.balance -= withdraw;
            System.out.println("Your current balance is " + this.balance);
        }
    }
}
