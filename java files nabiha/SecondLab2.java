abstract class GeometricShape{
    abstract void area();
    abstract void perimeter();
}

//Triangle class
class Triangle extends GeometricShape{
    int side1;
    int side2;
    int side3;
    int height;

    // Constructor
    Triangle(int a, int b, int c, int h){
        side1 = a;
        side2 = b;
        side3 = c;
        height = h;
    }
    // Methods
    void area(){
        System.out.println("Area of triangle " + ((side2 * height)/2));
    }

    void perimeter(){
        System.out.println("Perimeter of triangle " + (side1+side2+side3));
    }
}

//Square class
// class Square extends GeometricShape{
//     void area(){

//     }

//     void perimeter(){
//     }
// }

public class SecondLab2 {
    public static void main(String args[]){
        Triangle tri1 = new Triangle(3,3,3,2);
        tri1.perimeter();
        tri1.area();

}
}
