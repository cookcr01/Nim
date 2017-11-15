package nim;

import java.util.*;

public class Nim {

    public static void main(String[] args) {
        int CurrentPlayer, toothpicks, f, g;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to my game of Nim");
        CurrentPlayer = (int) (Math.random() * 2) + 1;
        toothpicks = (int) (Math.random() * 9) + 21;
        g = (int) (Math.random() * 3) + 1;

        switch (CurrentPlayer) {
            case 1:
                System.out.println("This time you are going to go first.");
                System.out.println("I choose number of toothpicks to be: " + toothpicks);
                break;
            case 2:
                System.out.println("This time I am going to go first.");
                do{
                System.out.print("You choose the number of toothpicks between 20 and 30: ");
                toothpicks = keyboard.nextInt();
                }while(toothpicks  <= 20 || toothpicks >= 30);
        }

        do {
            if (CurrentPlayer == 1) {
                System.out.print("Your turn. There are " + toothpicks + " toothpicks left. You can only remove 1-3 toothpicks, how many do you want to remove? ");
                f = keyboard.nextInt();
                

                while (f <= 3 & f <= toothpicks & f > 0) {
                    toothpicks = toothpicks - f;
                    CurrentPlayer = CurrentPlayer + 1;
                    break;
                }

                continue;
            }
            if (CurrentPlayer == 2) {

                CurrentPlayer = CurrentPlayer - 1;
                if (toothpicks == 3) {
                    System.out.println("My turn. There are " + toothpicks + " toothpicks left. I the computer will remove 2 ");
                    toothpicks = toothpicks - 2;
                } else if (toothpicks == 2) {
                    System.out.println("My turn. There are " + toothpicks + " toothpicks left. I the computer will remove 1 ");
                    toothpicks = toothpicks - 1;
                } else if (toothpicks == 1) {
                    System.out.println("My turn. There are " + toothpicks + " toothpicks left. I the computer will remove 1 ");
                    toothpicks = toothpicks - 1;
                } else {
                    System.out.println("My turn. There are " + toothpicks + " toothpicks left. I the computer will remove 3 ");
                    toothpicks = toothpicks - 3;

                }

            }
        } while (toothpicks > 0);

        if (CurrentPlayer == 1) {
            System.out.println("YOU WIN");

        } else {
            System.out.println("YOU LOSE");
        }

    }

}
