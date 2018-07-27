package BattelShip;

import java.util.Scanner;

public class BattelShipProgram {

    public static void main(String[] args) {
        boardDispaly("|  *  ");
        System.out.println();
        //boardDispaly("|  x  ");

    }

    public static void boardDispaly(String symbol) {
        Scanner read = new Scanner(System.in);
        System.out.println("Select your short boat index ");
        int shortBoatIndex = read.nextInt();
        System.out.println("Select the first index of your long boat");
        int longBoatInitialIndex = read.nextInt();
        Player player = new Player(shortBoatIndex, longBoatInitialIndex);
        String[] battleBoardMiddle = new String[10];


        for (int i = 0; i < 10; i++) {
            System.out.print(" =====");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {

            if (i == shortBoatIndex)
                battleBoardMiddle[i] = symbol;

            if (i == longBoatInitialIndex) {
                battleBoardMiddle[i] = symbol;
                battleBoardMiddle[i + 1] = symbol;
                System.out.print(battleBoardMiddle[i+1]);
            }
            if (i == 9)
                battleBoardMiddle[9] = "|     |";
            if (i != shortBoatIndex && i != longBoatInitialIndex && i != 9 && i != longBoatInitialIndex+1)
                battleBoardMiddle[i] = "|     ";
            System.out.print(battleBoardMiddle[i]);

        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(" =====");
        }
        System.out.println();


    }

}



