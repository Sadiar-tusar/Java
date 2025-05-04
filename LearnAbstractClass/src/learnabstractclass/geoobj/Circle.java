
package learnabstractclass.geoobj;

import java.util.Date;
import learnabstractclass.abs.Geomatry;



public class Circle extends Geomatry{

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, boolean filled, Date dateCreated) {
        super(filled, dateCreated);
        this.radius = radius;
    }
    
    
    
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
       return 2 * Math.PI * radius; 
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    
    
}
