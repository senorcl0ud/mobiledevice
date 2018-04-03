package shapes;

public class Circle extends Shapes{
 //instance variable
 private double radius;

 //constructor method
 public Circle(int side1, String color, double radius){
     super(side1, color);
     this.radius = radius;
 }

    @Override
    public String calculateArea(){
     return super.calculateArea() + Math.PI * Math.pow(radius,2);
    }

    @Override
    public String calculatePerimeter(){
     return super.calculatePerimeter() + 2 * Math.PI * radius;
    }
}