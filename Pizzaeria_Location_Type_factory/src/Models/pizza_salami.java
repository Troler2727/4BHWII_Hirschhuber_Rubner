package Models;

public class pizza_salami extends pizza{

    private String type = "Salami";

    public pizza_salami(int size_in_cm, int weight_in_gramms, double price, pizzeria locatione) {
        super(size_in_cm, weight_in_gramms, price, locatione);
    }

    public String get_type() {
        return type;
    }

    public void backen(){
        System.out.println("die Pizzeria " + getlocatione()+" bäckt " + type +"pizza" );
    }
    public void schneiden(){
        System.out.println("Die Pizzeria " +  getlocatione()+ " schneidet " + type+"pizza");
    }
    public void einpacken(){
        System.out.println("Die Pizzeria " + getlocatione() + " packt die Pizza " + type + " ein");
    }

    public String toString(){
        return "Size: " + this.get_size_in_cm() + " Weight: "+ this.get_weight_in_gramms()+ " Price:" + this.getprice()+ " Type:" + type +" From:" + this.getlocatione();
    }

}
