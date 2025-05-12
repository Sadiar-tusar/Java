
package polimorfisiomshape;

import polimorfisiomshape.shape.Shape;

public class Circle extends Shape{
    
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double area=Math.PI * Math.pow(radius, 2);
        System.out.println("Area of circle is "+area);
    }
    
    
    
    
}
