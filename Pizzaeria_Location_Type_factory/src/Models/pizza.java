package Models;

public  abstract class pizza {
    private int size_in_cm;
    private int weight_in_gramms;
    private double price;
    private pizzeria locatione;


    public pizza(int size_in_cm, int weight_in_gramms, double price, pizzeria locatione ){
        this.size_in_cm=size_in_cm;
        this.weight_in_gramms=weight_in_gramms;
        this.price = price;
        this.locatione = locatione ;
    }

    public pizzeria getlocatione(){

        return  this.locatione;
    }

    public int get_size_in_cm(){
        return  this.size_in_cm;
    }
    public int get_weight_in_gramms(){
        return  this.weight_in_gramms;
    }
    public double getprice(){
        return  this.price;
    }

    public abstract void backen();
    public abstract void schneiden();
    public abstract void einpacken();
}

//double money = 100.1;
//NumberFormat formatter = NumberFormat.getCurrencyInstance();
//String moneyString = formatter.format(money);
//System.out.println(moneyString);