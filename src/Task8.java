
import java.util.Random;

public class Task8
{
    public static void main(String[] args)
    {
        Random gen = new Random();
        int rollNum = 0;
        int die1, die2, die3, dieRoll;

        System.out.printf("%-6s %-7s %-7s %-7s %-7s\n", "Roll", "Die1", "Die2", "Die3", "Total");
        System.out.println("---------------------------------------------------");

        do {
            rollNum++;
            die1 = gen.nextInt(6) + 1;
            die2 = gen.nextInt(6) + 1;
            die3 = gen.nextInt(6) + 1;
            dieRoll = die1 + die2 + die3;
            System.out.printf("%-6d %-7d %-7d %-7d %-7d\n", rollNum, die1, die2, die3, dieRoll);
        } while (die1 != die2 || die1 != die3);

        System.out.println("---------------------------------------------------");
        System.out.println("All dice match! Simulation ended.");
    }
}
