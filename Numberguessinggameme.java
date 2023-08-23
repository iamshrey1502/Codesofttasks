import java.util.*;

public class Numberguessinggameme {
    public static void Numberguessgame(){
        System.out.println("Welcome to the number guessing game");
        Random random=new Random();
        int number=random.nextInt(100)+1;
        System.out.println(number);
        System.out.println("You have only five chances for prediction");

        for(int i=1;i<=5;i++){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your prediction : ");
        int prediction=sc.nextInt();

        if(number==prediction){
            System.out.println("Your prediction is correct.");
            System.out.println("CONGRATULATIONS, You won.");
            System.out.println("Your score is : " + i);
            break;
        }
        else if(number>prediction){
            System.out.println("Your prediction is lower than that of actual one.");
            System.out.println("Better luck next time.");
        }
        else if(number<prediction){
            System.out.println("Your prediction is higher than that of actual one.");
            System.out.println("Better luck next time.");
        }
        else{
            System.out.println("Invaild input by you.");
        }

        sc.close();

    }
        

    }
    public static void main(String args[]){

        Numberguessgame();
        System.out.println("If you want to play again then type true otherwise false");
        System.out.println("Do you want to play again ? ");
        Scanner scn=new Scanner(System.in);
        boolean answer=scn.nextBoolean();
        
        while(answer==true){
            Numberguessgame();
            System.out.println("If you want to play again then type true otherwise false");
            System.out.println("Do you want to play again ? ");
            boolean reply=scn.nextBoolean();
            if(reply==false){
                break;
            }
            else{
                System.out.println("You choose to play again");

            }

        }

        System.out.println("GAME ENDS");
        scn.close();
        





    }
    
}