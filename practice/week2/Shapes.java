interface Shape{
    double area();
}
class Rectangle implements Shape{
    private double width;
    private double height;
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double area(){
        return width * height;
    }
}
class Circle implements Shape{
    private double radius;
    Circle(double radius){
        this.radius = radius ;
    }
    public double area(){
        return Math.PI*radius*radius;
    }

}
public class Shapes {
    public static void main (String[] args){
        Shape r = new Rectangle(4,5);
        System.out.println("Rectangle area : " + r.area());
        Shape c = new Circle(4);
        System.out.println("Circle area : " + c.area());
    }

}
