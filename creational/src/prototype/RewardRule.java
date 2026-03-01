package prototype;

public class RewardRule implements  ProtoType{
    private String rewardType;
    private int points;

    public RewardRule(String rewardType, int points){
        this.rewardType = rewardType;
        this.points = points;
    }
    @Override
    public RewardRule clone() {
        return new RewardRule(this.rewardType, this.points);
    }
    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return rewardType + " : " + points;
    }
}
