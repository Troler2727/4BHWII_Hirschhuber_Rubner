package Models;

public class pizzeria_hamburg extends pizzeria{
    private String location = "This is pizzeria_hamburg";
    public pizzeria_hamburg(String address, int employees) {
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
