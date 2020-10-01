
/**
 * Author: Christian Vincent
 * Date: 10-31-18
 * Description: This 
 * 
 */
class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;
    
    //constructors
    public Triangle() {
        
    }
    
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    //sets side1 of this triangle to specified value
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    
    //returns side1's value of this triangle
    public double getSide1() {
        return side1;
    }
    
    //sets side2 of this triangle to specified value
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    
    //returns side2's value of this triangle
    public double getSide2() {
        return side2;
    }
    
    //sets side3 of this triangle to specified value
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    
    //returns side3's value of this triangle
    public double getSide3() {
        return side3;
    }
    
    //determienes and returns the area
    public double getArea() {
        //Heron's formula for the area of a triangle given 3 sides
        double p;
        //p is half-perimeter
        p = (side1 + side2 + side3) / 2;
        
        //return the area of the triangle
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
    
    //determines and returns the perimeter
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    
    //returns a string description of this triangle
    @Override
    public String toString() {
        return super.toString() + " Triangle: side1 = " + side1 + " side2 = " 
                + side2 + " side3 = " + side3;
    }
}
