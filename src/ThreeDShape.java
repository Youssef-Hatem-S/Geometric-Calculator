import java.util.TreeMap;

public abstract class ThreeDShape extends Shape {
    public abstract double getVolume();
    ThreeDShape(String c){
        super(c);
    }
    ThreeDShape(){};

}
