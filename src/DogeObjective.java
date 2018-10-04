import com.sun.javafx.geom.Vec2d;

public class DogeObjective {
    public String name;
    public Vec2d position;
    public double score;

    public DogeObjective(String name, Vec2d pos, double score){
        this.name = name;
        this.position = pos;
        this.score = score;
    }
}
