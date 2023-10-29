package week11;

enum AType {SAVINGS, CURRENT, LOAN}

public class Account {

    String accName;
    int accNo;
    float accBalance;

    AType aType;


    public Account(String name, int id, float balance, AType type) {
        this.accName = name;
        this.accNo = id;
        this.accBalance = balance;
        this.aType = type;
    }

    void print() {
        System.out.println("Account name " + this.accName);
        System.out.println("Account Number " + this.accNo);
        System.out.println("Account Type " + this.aType);
        System.out.println("Account Balance $" + this.accBalance);
    }
}

class Runner {
    public static void main(String[] args) {
        Account a = new Account("Sandeep", 12664433, 1234569.93F, AType.CURRENT);
        a.print();

    }
}
