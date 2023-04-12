package Models;

public class pizzeria_berlin extends pizzeria{


    private String location = "This is pizzeria_berlin";
    public pizzeria_berlin(String address, int employees) {
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
