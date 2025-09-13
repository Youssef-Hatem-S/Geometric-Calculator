public class Cube extends ThreeDShape{
    private double side;

    @Override
    public double getVolume() {
        return side*side*side;
    }
    @Override
    public String toString() {
        return getColor()+" Cube\nSide length: "+side;
    }
    @Override
    String getName() {
        return "Cube";
    }
    @Override
    public double getArea() {
        return side*side*6;
    }
    @Override
    public double getPerimeter() {
        return 12*side;
    }
    @Override
    public String howToDraw() {
        return "draw two squares with"+side+"cm. each and join their corresponding vertices";
    }


    void setSide(double side) {
        this.side = side;
    }
    double getSide() {
        return side;
    }

    Cube(String c,double s){
        super(c);
        setSide(s);
    }
    Cube(double s){
        side = s;
    }


}
