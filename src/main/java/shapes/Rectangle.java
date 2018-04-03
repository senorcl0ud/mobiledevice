package shapes;

public class Rectangle extends Shapes {
    private int side2;

    public Rectangle(int side1, int side2, String color){
        super(side1, color);
        this.side2 = side2;

    }

    @Override
    public String calculateArea(){
        return super.calculateArea()  + side1 * side2;
    }

    @Override
    public String calculatePerimeter(){
        return super.calculatePerimeter() + 2 * (side1 + side2);
    }
}
