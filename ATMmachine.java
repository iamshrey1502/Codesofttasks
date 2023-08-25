import java.util.*;

public class ATMmachine {

    public static void checkbalance(float Balance){
        System.out.println("Your account balance is : " + Balance);
    }

    public static void depositmoney(float Balance){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter ammount you want to deposit : ");
        float adding=scn.nextFloat();
        Balance = Balance + adding;
        System.out.println("Transaction done successfully");
        System.out.println("Now your updated account balance is : " + Balance);
        scn.close();
    }

    public static void withdrawmoney(float Balance){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter ammount you want to withdraw : ");
        float removing=scn.nextFloat();
        Balance = Balance - removing;
        System.out.println("Transaction done successfully");
        System.out.println("Now your updated account balance is : " + Balance);
        scn.close();
    }

    public static void menu(float Balance){
        System.out.println("1 : Check balance");
        System.out.println("2 : Deposit money");
        System.out.println("3 : Withdraw money");
        

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your choice for option in menu : ");
        int choice=scn.nextInt();
         switch(choice){
            case 1 : System.out.println("You have chosen for checking your account balance");
                     checkbalance(Balance);
                     break;
            case 2 : System.out.println("You have chosen for depositing money in your bank account");
                     depositmoney(Balance);
                     break;
            case 3 : System.out.println("You have chosen for withdrawing money from your bank account");
                     withdrawmoney(Balance);
                     break;
            default : System.out.println("You have entered invalid choice");

         }

         scn.close();

    }
    public static void main(String args[]){
        int PIN=1398;
        float Balance=50000;
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your PIN : ");
        int entry=scn.nextInt();
        if(PIN==entry){
            System.out.println("Welcome to your account");
            menu(Balance);
        }
        else{
            System.out.println("You have entered invalid PIN");
        }

        scn.close();

    }
}
