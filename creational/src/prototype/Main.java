package prototype;

public class Main {
    public static void main(String[] args) {
        RewardRule baseRule = new RewardRule("TripCompletion", 100);
        RewardRule driver1Rule = baseRule.clone();
        driver1Rule.setPoints(120);
        RewardRule driver2Rule = baseRule.clone();

        System.out.println(driver1Rule);
        System.out.println(driver2Rule);
    }
}
