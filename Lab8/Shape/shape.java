package HomeWork.Lab8.Shape;

public class shape {
    String color;
    boolean filled;

    public shape(){
        color ="red";
        filled = true;
    }
    public shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public void setColor(String color) {this.color = color;}
    public String getColor() {return color;}
    public boolean isFilled(){return this.filled = filled;}
    public void setFilled(boolean filled) {this.filled = filled;}

    @Override
    public String toString() {
        return  "A shape with "+"color of" + color  + "and filled" + filled;
    }
}
