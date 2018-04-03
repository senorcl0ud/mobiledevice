package shapes;

public class Shapes {
    protected int side1;
    protected String color;


    public Shapes(int side1, String color){
        this.side1 = side1;
        this.color = color;
    }

    public String calculateArea(){
        return  "The area of this shape is : ";
    }

    public String calculatePerimeter(){
        return "The perimeter of this shape is : ";
    }



    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
