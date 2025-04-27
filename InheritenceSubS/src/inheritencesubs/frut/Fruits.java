
package inheritencesubs.frut;


public class Fruits {
    
    private String shape;
    private String weigh;
    private int seed;
    private String color;

    public Fruits() {
    }

    public Fruits(String shape, String weigh, int seed, String color) {
        this.shape = shape;
        this.weigh = weigh;
        this.seed = seed;
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getWeigh() {
        return weigh;
    }

    public void setWeigh(String weigh) {
        this.weigh = weigh;
    }

    public int getSeed() {
        return seed;
    }

    public void setSeed(int seed) {
        this.seed = seed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruits{" + "shape=" + shape + ", weigh=" + weigh + ", seed=" + seed + ", color=" + color + '}';
    }
    
    
    
    
}
