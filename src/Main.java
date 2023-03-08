
import moddels.Drucker;

public class Main {
    public static void main(String[] args) {
        Drucker d0 = Drucker.getInstance();
        Drucker d1 = Drucker.getInstance();

        System.out.println("Hashcode of d0 is "
                + d0.hashCode());
        System.out.println("Hashcode of d1 is "
                + d1.hashCode());

        if (d0 == d1) {
            System.out.println("Haben den gleichen speicherplatz am HEAP -> gleiches Objekt");
        }

        System.out.println(d0.drucken());
        System.out.println(d1.drucken());
    }


}

