
import java.util.Scanner;

public class Number_Guess_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNum = (int)(Math.random() * 100) + 1;
        int userNum = 0;

        do {
            System.out.println("Guess my Number (1 - 100), or enter -1 to quit:");
            userNum = sc.nextInt();

            if (userNum == -1) {
                System.out.println("You chose to quit. Better luck next time!");
                break;
            }

            if (userNum == myNum) {
                System.out.println("WOOHOO .. CORRECT NUMBER !!!");
                break;
            } else if (userNum > myNum) {
                System.out.println("Your Number is Too Large");
            } else {
                System.out.println("Your Number is Too Small");
            }
        } while (userNum >= 0);

        System.out.println("My Number Was: " + myNum);
    }
}





