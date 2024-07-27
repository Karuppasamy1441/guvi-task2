public class Account {
    double balance;
    public Account(){
        balance=100;
    }
    public Account(double balance){
     this.balance=balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance =balance+amount;
        }
        System.out.println("Deposit Rs "+amount);
        System.out.println("current balance : Rs"+balance );
        System.out.println("===================================");
    }
    public void withdraw(double amount){
        if(amount <=balance){
        balance =balance-amount;
        System.out.println("Withdraw Rs"+amount);
            System.out.println("current balance :Rs"+balance );
            System.out.println("===============================");
        }else{
        System.out.println("Insufficient balance...");
        }
    }
    public void display(){
        System.out.print("Current Balance :Rs"+balance);
    }
}
class Main{
    public static void main(String[] args){
        Account accountobj=new Account();
        Account accountobj1=new Account(500);
        accountobj1.deposit(100);
        accountobj1.withdraw(50);
        accountobj1.display();
    }
}
