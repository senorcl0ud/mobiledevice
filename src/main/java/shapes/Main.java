package shapes;

public class Main{
    public static void main(String[] args){
        Shapes aTriangle = new Triangle(20,40, 20, 30, 50, "Red" );
        Shapes aRectangle = new Rectangle(30,20, "Blue");
        Shapes aSquare = new Square (25,"Green");
        Shapes aCircle = new Circle(0, "Yellow", 6);

        Shapes[] polygons = new Shapes[]{aTriangle, aRectangle, aSquare, aCircle};

        for(Shapes geometry : polygons){
            System.out.println(geometry.calculateArea() + " " + geometry.calculatePerimeter()) ;
        }

//        Circle aCircle = new Circle(50.50);
//        System.out.println("The area of this circle is " + aCircle.areaOfCircle());
//
//        Rectangle aRectangle = new Rectangle(20,30);
//        System.out.println("The area of this rectangle is " + aRectangle.areaOfRectangle());
//        System.out.println("The perimeter of this rectangle is " + aRectangle.perimeterOfRectangle());
//
//        Triangle aTriangle = new Triangle(20.00,40.00);
//        System.out.println("The area of this triangle is " + aTriangle.areaOfTriangle());
//
//        Triangle aSecondTriangle = new Triangle(10,20,30) ;
//        System.out.println("The perimeter of this triangle is " + aSecondTriangle.perimeterOfTriangle());
//
//        Square aSquare = new Square();
//        System.out.println("The perimeter of this square is " + aSquare.perimeterOfSquare());
//        System.out.println("The area of this square is " + aSquare.areaOfSquare());
//        System.out.println(aSquare.getSide());
//        aSquare.setSide(6);
//        System.out.println(aSquare.getSide());

    }
}
