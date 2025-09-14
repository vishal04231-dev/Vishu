package methods.string;
import java.util.*;

class RockPaperScissorsDemo {
    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        int idx = (int)(Math.random() * 3);
        return choices[idx];
    }

    public static int findWinner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if (user.equals("rock") && comp.equals("scissors")) return 1;
        if (user.equals("scissors") && comp.equals("paper")) return 1;
        if (user.equals("paper") && comp.equals("rock")) return 1;
        return -1;
    }

    public static String[][] calculateStats(int userWins, int compWins, int games) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf((userWins * 100.0) / games) + "%";
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.valueOf((compWins * 100.0) / games) + "%";
        return stats;
    }

    public static void displayStats(String[][] stats) {
        System.out.println("Player\tWins\tPercentage");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();
        int userWins = 0, compWins = 0;

        for (int i = 1; i <= games; i++) {
            System.out.print("Game " + i + " - Enter rock/paper/scissors: ");
            String user = sc.nextLine().toLowerCase();
            String comp = getComputerChoice();
            int result = findWinner(user, comp);
            if (result == 1) userWins++;
            else if (result == -1) compWins++;
            System.out.println("Computer: " + comp + " | Result: " + (result == 0 ? "Draw" : result == 1 ? "User Wins" : "Computer Wins"));
        }

        String[][] stats = calculateStats(userWins, compWins, games);
        displayStats(stats);
    }
}
