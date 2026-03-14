import java.util.Scanner;

class RockPaperScissorsGame
{

    public static String getComputerChoice()
    {
        double r = Math.random();

        if(r < 0.33)
            return "Rock";
        else if(r < 0.66)
            return "Paper";
        else
            return "Scissors";
    }

    public static String findWinner(String user, String computer)
    {
        if(user.equals(computer))
            return "Draw";

        else if(user.equals("Rock") && computer.equals("Scissors"))
            return "User";

        else if(user.equals("Paper") && computer.equals("Rock"))
            return "User";

        else if(user.equals("Scissors") && computer.equals("Paper"))
            return "User";

        else
            return "Computer";
    }

    public static String[][] calculateStats(int userWins, int compWins, int totalGames)
    {
        String stats[][] = new String[2][3];

        double userPercent = (userWins * 100.0) / totalGames;
        double compPercent = (compWins * 100.0) / totalGames;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf(userPercent) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.valueOf(compPercent) + "%";

        return stats;
    }

    public static void displayResults(String gameResults[][], String stats[][])
    {
        System.out.println("Game Results:");
        System.out.println("Game\tUser\tComputer\tWinner");

        for(int i=0; i<gameResults.length; i++)
        {
            System.out.println((i+1) + "\t" +
                               gameResults[i][0] + " " +
                               gameResults[i][1] + "  " +
                               gameResults[i][2]);
        }

        System.out.println("Statistics:");
        System.out.println("Player\tWins\tPercentage");

        for(int i=0; i<stats.length; i++)
        {
            System.out.println(stats[i][0] + " " +
                               stats[i][1] + " " +
                               stats[i][2]);
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        String gameResults[][] = new String[n][3];

        int userWins = 0;
        int compWins = 0;

        for(int i=0; i<n; i++)
        {
            System.out.println("Game " + (i+1));
            System.out.print("Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = sc.next();

            String computerChoice = getComputerChoice();

            String winner = findWinner(userChoice, computerChoice);

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;

            if(winner.equals("User"))
                userWins++;

            else if(winner.equals("Computer"))
                compWins++;
        }

        String stats[][] = calculateStats(userWins, compWins, n);

        displayResults(gameResults, stats);

        sc.close();
    }
}
