
package inheritencesubs.apple;

import inheritencesubs.frut.Fruits;
import javax.swing.InputMap;


public class Apple extends Fruits{
    
    private String rounded;
    private String flat;
    private String bottom ;
    private  int skhfd;

    public Apple() {
    }

    public Apple(String rounded, String flat, String bottom, int skhfd) {
        this.rounded = rounded;
        this.flat = flat;
        this.bottom = bottom;
        this.skhfd = skhfd;
    }

    public Apple(String rounded, String flat, String bottom, int skhfd, String shape, String weigh, int seed, String color) {
        super(shape, weigh, seed, color);
        this.rounded = rounded;
        this.flat = flat;
        this.bottom = bottom;
        this.skhfd = skhfd;
    }

    public String getRounded() {
        return rounded;
    }

    public void setRounded(String rounded) {
        this.rounded = rounded;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getBottom() {
        return bottom;
    }

    public void setBottom(String bottom) {
        this.bottom = bottom;
    }

    public int getSkhfd() {
        return skhfd;
    }

    public void setSkhfd(int skhfd) {
        this.skhfd = skhfd;
    }

    @Override
    public String toString() {
        return "Apple{" + "rounded=" + rounded + ", flat=" + flat + ", bottom=" + bottom + ", skhfd=" + skhfd + '}';
    }
    
    
    public String getPrime(){
    int input;
    int count=0;
    
    for(int i=1; i<=input; i++){
    if(input % i==0){
    count++;
    }
    }
    
    if(count==2){
    return input+" It is Prime Number";
    }
    else{
    return input+"It is Not Prime Number";
    }
    }

  
    
    

   
    
    
}
