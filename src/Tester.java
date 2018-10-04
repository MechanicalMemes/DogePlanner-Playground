import com.sun.javafx.geom.Vec2d;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    static double robotSpeed = 1.5;

    Vec2d startingPos = new Vec2d(0,0);
    static DogePlanner planner;
    public static void main(String[] args){
        planner = new DogePlanner(robotSpeed);

        planner.setStartingPosition(new Vec2d(0,0));
        planner.addObjective(new DogeObjective("Sample", new Vec2d(1,1), 5));
        planner.addObjective(new DogeObjective("Find God", new Vec2d(5,5), 5));

        DogeObjective obj = planner.getBestChoice(planner.getStartingPosition());

        System.out.println(obj.name);

    }

}
