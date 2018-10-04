import com.sun.javafx.geom.Vec2d;

public class DogeMath {
    public static double getTimeForDistance(double speed, double distance){
        return distance/speed;
    }

    public static double getDistance(DogeObjective a, DogeObjective b){
        return a.position.distance(b.position);
    }
}
