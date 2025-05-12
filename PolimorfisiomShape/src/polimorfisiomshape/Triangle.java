
package polimorfisiomshape;

import polimorfisiomshape.shape.Shape;


public class Triangle extends Shape{
    
    private double base,height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void area() {
        
        double area=0.5 * base * height;
        System.out.println("Area of Triangle is "+area);
    }
    
    
    
    
}
