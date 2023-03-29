package Models;

public class A4 extends Envelope{

    private String size;
    private int weight;

    public A4(String size, int weight ){
        this.size=size;
        this.weight=weight;
    }

    public String getSize(){
        return  this.size;
    }
    public int getWeight(){
        return  this.weight;
    }


}
