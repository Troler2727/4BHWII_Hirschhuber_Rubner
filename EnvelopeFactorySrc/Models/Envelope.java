package Models;

public  abstract class Envelope {

    public abstract int getWeight();
    public abstract String getSize();

    public String toString(){
        return "Size: " + this.getSize() + " Weight: " +this.getWeight();
    }
}


