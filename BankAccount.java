public class BankAccount {
    public String owner;
    public double balance;


    BankAccount(String owner, double balance){
        this.owner= owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double withdraw(double amt){
        System.out.println("Money Withdraw");
        this.balance = balance - amt;
        return amt;
    }

    public void deposit(){
        System.out.println("Money Withdraw");
        this.balance = balance + 100;
    }


}
