package Models;

public  abstract class pizzeria {

    private String address;
    private int employees;


    public pizzeria(String address, int employees ){
        this.address = address;
        this.employees = employees;

    }

    public String get_address(){

        return  this.address;
    }

    public int get_employees(){
        return  this.employees;
    }

}
