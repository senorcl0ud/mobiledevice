package shapes;

public class Square extends Shapes{

    public Square(int side1, String color){
        super(side1, color);

    }


    @Override
    public String calculateArea(){
        return super.calculateArea() + side1 * side1;
    }

    @Override
    public String calculatePerimeter() {
        return super.calculatePerimeter() + side1 * 4;
    }
}



