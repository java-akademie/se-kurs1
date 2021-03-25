package ch.jmildner.spiele.s1ziege;


import ch.jmildner.tools.MyTools;

public class LetsMakeADeal // Ziegenproblem
{
    private static int numberWonWithoutChangingBox = 0;
    private static int numberWonWithChangingBox = 0;

    public static void main(String[] args) {
        MyTools.h1("Let's make a deal");

        for (int i = 1; i <= 10_000_000; i++) {
            playTheGame();
        }

        protocol();
    }

    private static void protocol() {
        System.out.printf("without changing the box: %,11d %n",
                numberWonWithoutChangingBox);
        System.out.printf("   with changing the box: %,11d %n",
                numberWonWithChangingBox);
        System.out.printf("         number of games: %,11d %n",
                numberWonWithChangingBox + numberWonWithoutChangingBox);
    }

    private static void playTheGame() {

        // init 3 boxes 0=goat, 0=goat, 1=ferrari
        int[] boxes = new int[3];
        boxes[MyTools.getRandom(1, 3) - 1] = 1;

        // make a choice
        int choiceOfThePlayer = MyTools.getRandom(1, 3) - 1;

        // without changing the choice
        {
            if (boxes[choiceOfThePlayer] == 1) {
                numberWonWithoutChangingBox++;
            }
        }

        // with changing the choice
        {
            if (boxes[0] == 0 && choiceOfThePlayer != 0) {
                // the moderator opens box 1 or 2 with the goat
                if (choiceOfThePlayer == 1)
                    choiceOfThePlayer = 2;
                else
                    choiceOfThePlayer = 1;
            } else if (boxes[1] == 0 && choiceOfThePlayer != 1) {
                // the moderator opens box 0 or 2 with the goat
                if (choiceOfThePlayer == 0)
                    choiceOfThePlayer = 2;
                else
                    choiceOfThePlayer = 0;
            } else if (boxes[2] == 0 && choiceOfThePlayer != 2) {
                // the moderator opens box 0 or 1 with the goat
                if (choiceOfThePlayer == 0)
                    choiceOfThePlayer = 1;
                else
                    choiceOfThePlayer = 0;
            }

            if (boxes[choiceOfThePlayer] == 1)
                numberWonWithChangingBox++;
        }
    }

}

