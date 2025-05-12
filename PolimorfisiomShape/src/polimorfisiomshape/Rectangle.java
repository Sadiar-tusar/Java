
package polimorfisiomshape;

import polimorfisiomshape.shape.Shape;


public class Rectangle extends Shape{
    
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void area() {
        
        double area=height * width;
        System.out.println("Area of Rectangle is "+area);
    }
    
    
    
}
