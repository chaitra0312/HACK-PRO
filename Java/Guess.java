import java.util.*;
class Game {
    public static void GameOfGuessing() {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100 *Math.random());
        int k = 5;
        System.out.println("A number Choosen Between 1 and 100.");
        System.out.println("You have" + k + "Attempts to guess the correct Number.");
        for(int i=0;i<k;i++){
            System.out.println("Enter Your guess: ");
            int guess = sc.nextInt();
            if(guess == number) {
                System.out.println("Congrats! you guessed Correct number.");
                sc.close();
                return;
            } else if(guess < number) {
                System.out.println("The number is Greater Than" + guess);
            } else {
                System.out.println("The number is Less Than"+guess);
            }
            }
            System.out.println("You've exhaustes all attempts. The correct number was: " + number);
            sc.close();
        }
        public static void main(String[] args) {
            GameOfGuessing();
        }
    }
