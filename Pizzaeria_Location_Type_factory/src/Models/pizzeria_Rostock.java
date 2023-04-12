package Models;

public class pizzeria_Rostock extends pizzeria{

    private String location = "This is pizzeria_rostock";
    public pizzeria_Rostock(String address, int employees) {
        super(address, employees);
    }
    public String get_location(){
        return location;
    }
    @Override
    public String toString() {
        return location;
    }
}
