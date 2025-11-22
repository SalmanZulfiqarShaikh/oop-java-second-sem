class Circle{
    private double radius;
    private String color; 
    
    // Constructor without argument
    Circle(){
        radius = 2;
        color = new String("red");
        System.out.println("Constructor without argument");
    }
    // Constructor with argument
    Circle(double radius , String color){
        this.radius = radius;
        this.color = color;
        System.out.println(color);
        System.out.println("Constructor with argument");
    }

    // Method
    public double getRadius(){
        return radius;
    }

    public double getArea(){
        double area;
        area = 3.14 * (radius * radius);
        return area;
    }

}




public class FirstProgram{
public static void main(String args[]){
    System.out.println("");
    String color = new String("red");
    Circle circle1 = new Circle(2,color);
    System.out.println(circle1.getRadius());
    System.out.println(circle1.getArea());


}}