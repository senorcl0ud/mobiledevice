package shapes;

public class Triangle extends Shapes {
    private int base;
    private int height;
    private int side2;
    private int side3;

    public Triangle(int base, int height, int side1, int side2, int side3, String color){
        super(side1, color);
        this.height = height;
        this.base = base;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String calculatePerimeter(){
        return super.calculatePerimeter() +  side1 + side2 + side3;
    }

    @Override
    public String calculateArea(){
        return super.calculateArea() + (this.base * this.height)/2;
    }




}


