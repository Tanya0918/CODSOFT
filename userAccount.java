import java.util.Scanner;

public class userAccount{
     double balance;
     userAccount(double initialBalance){
         balance=initialBalance;
    }
    
    public void withdraw(double amount){
        if(balance>=amount){
        balance-=amount;
        System.out.println("Money withdrawing successful.\nCurrent Balance =" + balance);
    }
    else{
        System.out.println("Insufficient Balance");
    }
    }

    public void deposit(double amount){
        if(amount>0){
        balance+=amount;
        System.out.println("Money depositing successful.\nCurrent Balance =" + balance);
    }
    else{
        System.out.println("Insufficient amount to deposit");
    }
    }

    public void checkbalance(){
        System.out.println("Your Bank Balance: " + balance);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        userAccount bank=new userAccount(1000.0);
        System.out.println("ATM Functions:");
        System.out.println("1. Withraw money");
        System.out.println("2. Deposit Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");

        while (true) { 
            System.out.println("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    bank.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    bank.deposit(depositAmount);
                    break;
                case 3:
                    bank.checkbalance();
                    break;
                case 4:
                     System.out.println("Thanks for using the ATM!!");
                     return;
                default:
                    System.out.println("Invalid choice.");
            }
            System.out.println("Do you want to use any other function: ");
            String access = input.next();
            if(access.equals("no")){
                System.out.println("Thank you for visiting!!");
                break;
            }
        }
    }
}
