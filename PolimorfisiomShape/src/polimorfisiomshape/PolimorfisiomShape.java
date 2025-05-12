
package polimorfisiomshape;

import polimorfisiomshape.shape.Shape;



public class PolimorfisiomShape {

    
    public static void main(String[] args) {
       
        Shape[] shape=new Shape[3];
        
        shape[0]=new Circle(5);
        shape[1]=new Rectangle(10, 15);
        shape[2]=new Triangle(20, 25);
        
        for(Shape shapes:shape){
        
            shapes.area();
        }
    }
    
}
