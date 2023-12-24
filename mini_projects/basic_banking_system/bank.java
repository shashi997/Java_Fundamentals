import java.util.Scanner;

public class bank {
    public static void main(String[] args) {

        boolean result = true;

        int num;

        float balance = 0.0f;

        int amount = 0;

        
        while (result == true) {

            System.out.println(" 1. Check Balance");
            System.out.println(" 2. Deposit Amount");
            System.out.println(" 3. Withdraw Amount");
            System.out.println(" 4. exit");

            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();


            switch (num) {
                case 1:
                    System.out.println("you have " + balance + " in your account");
                    break;
                case 2:
                    System.out.print("Enter the Amount you want to deposit : ");
                    amount = sc.nextInt();
                    balance += amount;
                    System.out.println("You've added " + amount + " in your account" );
                    break;
                case 3:
                    if(balance>0){
                        System.out.print("Enter the Amount to be withdrawn from your account : ");
                        amount = sc.nextInt();
                        if(amount <= balance){
                            balance -= amount;
                            System.out.println("you've withdrawn " + amount + " from your account ");
                        }
                        else{
                            System.out.println("You've insufficient funds in your account");
                        }
                    }
                    else {
                        System.out.println("You've insufficient balance");
                    }
                    break;
                case 4:
                    result = false;
                    break;
                default:
                    System.out.println("You've entered wrong number Try Entering the correct number ");
                    break;
            }

            // sc.close();
        }
    }
}