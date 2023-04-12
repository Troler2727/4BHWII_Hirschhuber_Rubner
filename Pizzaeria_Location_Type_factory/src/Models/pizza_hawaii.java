package Models;

import java.lang.constant.Constable;

public class pizza_hawaii extends pizza{

    private String type = "Hawaii";

    public pizza_hawaii(int size_in_cm, int weight_in_gramms, double price, pizzeria locatione) {
        super(size_in_cm, weight_in_gramms, price, locatione);
    }

    public String get_type() {
        return type;
    }
    public void backen(){
        System.out.println("die Pizzeria " + getlocatione()+" bäckt " + type +"pizza"  );
    }
    public void schneiden(){
        System.out.println("Die Pizzeria " +  getlocatione()+ " schneidet " + type);
    }
    public void einpacken(){
        System.out.println("Die Pizzeria " + getlocatione() + " packt die Pizza " + type + " ein");
    }
    public String toString(){
        return "Size: " + this.get_size_in_cm() + " Weight: "+ this.get_weight_in_gramms()+ " Price:" + this.getprice()+ " Type:" + type +" From:" + this.getlocatione();
    }

}
