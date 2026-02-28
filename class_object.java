class backAccount {
    private int accNumber = 23456345;
    private String accHolder = "ananya";
    private int balance = 67889;

    public backAccount(int balance, int accNumber, String accHolder) {
        this.balance = balance;
        this.accNumber = accNumber;
        this.accHolder = accHolder;
    }

    public int balance() {
        return balance;
    }

    public int accNumber() {
        return accNumber;
    }

    public String accHolder() {
        return accHolder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("amount deposit successfully!");
        } else {
            System.out.println("invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("amount withdraw successfully!");
        } else {
            System.out.println("insufficient balance or invalid amount");
        }
    }
}

public class class_object {
    public static void main(String[] args) {
        backAccount b1 = new backAccount(67889, 23456345, "ananya");
        System.out.println("Account Holder " + b1.accHolder());
        System.out.println("Account Balance " + b1.balance());

        b1.deposit(3000);
        System.out.println("Balance after deposite " + b1.balance());

        b1.withdraw(500);
        System.out.println("Balance after withdraw " + b1.balance());
    }
}
