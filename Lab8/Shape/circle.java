package HomeWork.Lab8.Shape;

public class circle extends shape {
    double radius;
    public circle(){
        radius = 1.0;
    }
    public circle(double radius){
        this.radius = radius;
    }
    public circle(double radius,String color,boolean filled){
        super(color, filled);
    }
}
