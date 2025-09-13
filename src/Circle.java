public class Circle extends Shape{

    private double radius;
    @Override
    String getName() {
        return "Circle";
    }
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }
    @Override
    public String howToDraw() {
        return "grap your compass and open it in"+radius+"cm. and draw your lovely circle :)";
    }
    @Override
    public String toString() {
        return getColor()+" Circle\nRadius: "+radius;
    }

    public double getRadius(double radius) {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    Circle(double r) {
        this.radius = r;
    }
    Circle(String c,double r){
        super(c);
        this.radius = r;
    }

}
