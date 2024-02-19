//method overloading is one of polymorphism

class CricketMatch {

    public void recordRuns(String batsman, int runsScored) {
        System.out.println(batsman + " scored " + runsScored + " runs.");
    }
    //these two methods have same name but different parameters 
    public void recordRuns(String batsman, String bowler, int runsScored) {
        System.out.println(batsman + " scored " + runsScored + " runs off " + bowler + ".");
    }
    
    public void recordWicket(String bowler, String batsman) {
        System.out.println(bowler + " took the wicket of " + batsman + " Most Times");
    }

    public void recordMatchResult(String winner, String loser) {
        System.out.println(winner + " won the match against " + loser + " In world cup final");
    }
}

public class Methodoverloading{
    public static void main(String[] args) {
        CricketMatch match = new CricketMatch();

        match.recordRuns("Virat kohli", 100);
        match.recordRuns("Yuvraj", "Broad", 30);

        match.recordWicket("Ashwin", "warner");
        match.recordWicket("Broad", "warner");

        match.recordMatchResult("Australia", "India");
    }
}
