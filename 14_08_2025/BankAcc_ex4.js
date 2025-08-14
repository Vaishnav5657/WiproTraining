class BankAccount {
    constructor(accountNumber, balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    deposit(amount) {
        this.balance += amount;
        console.log("Deposited:", amount, "New Balance:", this.balance);
    }

    withdraw(amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            console.log("Withdrawn:", amount, "New Balance:", this.balance);
        } else {
            console.log("Insufficient balance");
        }
    }
}

let account = new BankAccount("ACC123", 5000);
account.deposit(1500);
account.withdraw(2000);
account.withdraw(6000);
