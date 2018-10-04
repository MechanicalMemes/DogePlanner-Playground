import com.sun.javafx.geom.Vec2d;

import java.util.ArrayList;
import java.util.List;

public class DogePlanner {
    private List<DogeObjective> objectives = new ArrayList<>();
    private DogeObjective startingPosition;
    private double speed;

    public DogePlanner(double speed){
        this.speed = speed;
    }

    public void addObjective(DogeObjective objective){
        objectives.add(objective);
    }

    public void setStartingPosition(Vec2d pos){
        startingPosition = new DogeObjective("Start", pos, 0);
    }

    public List<DogeObjective> getBestRun(){
        return null;
    }

    public DogeObjective getBestChoice(){
        DogeObjective bestChoice = null;
        double lastEff = 0;
        for(int i=0;i<objectives.size();i++){
            DogeObjective obj = objectives.get(i);

            double eff = calculateEfficeny(startingPosition, obj);
            if(eff > lastEff){
                lastEff = eff;
                bestChoice = obj;
            }
        }

        return bestChoice;
    }

    public DogeObjective getBestChoice(DogeObjective startAt, List<DogeObjective> choices){
        DogeObjective bestChoice = null;
        double lastEff = 0;
        for(int i=0;i<choices.size();i++){
            DogeObjective obj = choices.get(i);

            double eff = calculateEfficeny(startAt, obj);
            if(eff > lastEff){
                lastEff = eff;
                bestChoice = obj;
            }
        }

        return bestChoice;
    }

    public double calculateEfficeny(DogeObjective a, DogeObjective b){
        double distance = DogeMath.getDistance(a,b);
        double time     = DogeMath.getTimeForDistance(speed,distance);
        double score    = b.score;

        double eff = score / time;

        return eff;
    }

    public DogeObjective getStartingPosition() {
        return startingPosition;
    }
}
