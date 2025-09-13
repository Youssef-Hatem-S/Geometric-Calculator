import java.util.Date;

public abstract class Shape implements Drawable {

    private Date dateCreated= new Date();
    private String color;
    public String getColor() {
        return color;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    abstract String getName();
    abstract double getArea();
    abstract double getPerimeter();
    Shape(String color){
        this.color = color;
    }
    Shape(){}
}
