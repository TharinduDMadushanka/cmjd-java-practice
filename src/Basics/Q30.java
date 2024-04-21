package Basics;

// Passing Object to Method

class Account{
    double balance;
    Account(double balance){
        this.balance = balance;
    }

    public void printBalance(){
        System.out.println("Balance is : " + this.balance);
    }
}

class Operation{
    public void withdraw(Account a1, double amount){
        a1.balance -= amount;
    }

    public void deposit(Account a1, double amount){
        a1.balance += amount;
    }
}

class Q30 {
    public static void main(String[] args) {
        Account a1 = new Account(10000);
        a1.printBalance();

        Operation operation = new Operation();
        operation.withdraw(a1, 5000);
        a1.printBalance();

        operation.deposit(a1, 7000);
        a1.printBalance();
    }
}


