import java.util.Random;
import java.util.Scanner;

public class RPS_game {
    public static void main(String[] args) {
        System.out.println("<------Rock-Paper-Scissor Game------>");
        System.out.println("0 => Rock \n1 => Paper \n2 => Scissors");

        int c=0;
        int y=0;

        for(int i=0;i<5;i++){
            Random rand = new Random();
            int compCh = rand.nextInt(3);

            System.out.print("Enter Your Choice : ");
            Scanner sc = new Scanner(System.in);
            int yourCh = sc.nextInt();

            if(yourCh==compCh){
                System.out.println("Computer's Choice was : " + compCh);
                System.out.println("!! It's a Draw !!");
            }
            else if(yourCh==0 && compCh==1){
                System.out.println("Computer's Choice was : " + compCh);
                System.out.println("!! Computer Won !!");
                c++;
            }
            else if(yourCh==0 && compCh==2){
                System.out.println("Computer's Choice was : " + compCh);
                System.out.println("!! You Won !!");
                y++;
            }
            else if(yourCh==1 && compCh==0){

                System.out.println("Computer's Choice was : " + compCh);
                System.out.println("!! You Won !!");
                y++;
            }
            else if(yourCh==1 && compCh==2){
                System.out.println("Computer's Choice was : " + compCh);
                System.out.println("!! Computer Won !!");
                c++;
            }
            else if(yourCh==2 && compCh==0){
                System.out.println("Computer's Choice was : " + compCh);
                System.out.println("!! Computer Won !!");
                c++;
            }
            else if(yourCh==2 && compCh==1){
                System.out.println("Computer's Choice was : " + compCh);
                System.out.println("!! You Won !!");
                y++;
            }
            else {
                System.out.println("!! Invalid Choice !!");
                i--;
            }
        }
        if(y>c){
            System.out.println("\nYou won "+y+" games");
            System.out.println("Computer won "+c+" games");
            System.out.print("======  You Won the game  ======");
        }
        else if(y==c){
            System.out.println("\nYou won "+y+" games");
            System.out.println("Computer won "+c+" games");
            System.out.print("======  It's a Draw  ======");
        }
        else{
            System.out.println("\nYou won "+y+" games");
            System.out.println("Computer won "+c+" games");
            System.out.print("======  Computer Won Better Luck next time  ======");
        }

    }

}
