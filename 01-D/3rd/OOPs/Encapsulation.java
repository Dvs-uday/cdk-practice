class CricketPlayer {
    private String playerName;
    private int totalRunsScored;
    private int totalMatchesPlayed;

    public CricketPlayer(String playerName) {
        this.playerName = playerName;
        this.totalRunsScored = 0;
        this.totalMatchesPlayed = 0;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getTotalRunsScored() {
        return totalRunsScored;
    }

    public void setTotalRunsScored(int runsScored) {
            totalRunsScored = runsScored;
    }

    public int getTotalMatchesPlayed() {
        return totalMatchesPlayed;
    }

    public void setTotalMatchesPlayed(int matchesPlayed) {
            totalMatchesPlayed = matchesPlayed;
    }

    public double calculateBattingAverage() {
        if (totalMatchesPlayed > 0) {
            return (double) totalRunsScored / totalMatchesPlayed;
        } else {
            System.out.println("No matches played yet.");
            return 0.0;
        }
    }

    public void displayPlayerDetails() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Total Runs Scored: " + totalRunsScored);
        System.out.println("Total Matches Played: " + totalMatchesPlayed);
        System.out.println("Batting Average: " + calculateBattingAverage());
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        CricketPlayer player = new CricketPlayer("Virat Kohli");
        player.setTotalRunsScored(11250);
        player.setTotalMatchesPlayed(248);
        player.displayPlayerDetails();
    }
}
