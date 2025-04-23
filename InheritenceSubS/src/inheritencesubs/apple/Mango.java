
package inheritencesubs.apple;

import inheritencesubs.frut.Fruits;




public class Mango extends Fruits{
    
    private String name;
    private String ati;
    private String discolor;

    public Mango() {
    }

    public Mango(String name, String ati, String discolor) {
        this.name = name;
        this.ati = ati;
        this.discolor = discolor;
    }

    public Mango(String name, String ati, String discolor, String shape, String weigh, int seed, String color) {
        super(shape, weigh, seed, color);
        this.name = name;
        this.ati = ati;
        this.discolor = discolor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAti() {
        return ati;
    }

    public void setAti(String ati) {
        this.ati = ati;
    }

    public String getDiscolor() {
        return discolor;
    }

    public void setDiscolor(String discolor) {
        this.discolor = discolor;
    }

    @Override
    public String toString() {
        return "Mango{" + "name=" + name + ", ati=" + ati + ", discolor=" + discolor + '}';
    }
    
    
}
