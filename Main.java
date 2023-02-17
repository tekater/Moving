package moving;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[][] myArray = {
                {"_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_"},
        };
        Batman b = new Batman();
        Random random = new Random();
        int x = random.nextInt(5);
        int y = random.nextInt(5);

        myArray[x][y] = "b";
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {

                System.out.print(myArray[i][j]);
            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("w")) {
            System.out.println("StepAhead:");
            b.stepAhead(myArray,input);
        }else if (input.equals("a")) {
            System.out.println("TurnLeft:");
            b.turnLeft(myArray,input);
        }else if (input.equals("d")) {
            System.out.println("TurnRight:");
            b.turnRight(myArray,input);
        }else if (input.equals("s")) {
            System.out.println("StepBack:");
            b.stepBack(myArray,input);
        }else{
            System.out.println("Что-то пошло не так");
        }

    }
}
