
import java.util.Scanner;

public class Main{
  public static void main(String args[]){

    Health health = new Health();
    health.hp = 100;

    String select;
    Scanner take = new Scanner(System.in);

    System.out.println("Welcome to health test");
    System.out.println("Select what you want to do");

    for(;;){
        System.out.println("For decrase hp choose -");
        System.out.println("For raise hp choose +");
        System.out.println("To show how many you else have choose hp \n");
        System.out.println("Exit = Exit");

        select = take.nextLine();

        switch(select){
          case "+":
            health.hp = health.healthUp();
            System.out.println(health.hp);
            break;

          case "-":
            health.hp = health.healthDown();
            System.out.println(health.hp);
            break;

          case "hp":
            System.out.println(health.hp);
            break;

          case "Exit":
            System.exit(1);

          default:
            System.out.print("You have chosen wrong!!! Select Again!!!");
        }
          if (health.hp <= 0){
            System.out.println("Game Over");
            System.exit(1);

      }
    }
  }
}
