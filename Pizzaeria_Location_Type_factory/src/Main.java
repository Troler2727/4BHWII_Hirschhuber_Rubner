import Models.*;

// locatione is a meme von mia dont judge it
public class Main {
    public static void main(String[] args) {

        //System.out.println(new pizza_calzone(10, 20, 1.1, new pizzeria_hamburg("asda", 10)).getlocatione());
        //System.out.println(new pizza_calzone(10, 20, 1.1, new pizzeria_berlin("asda", 10)).getlocatione().get_employees());
        //System.out.println(new pizza_hawaii(10, 20, 1.1, "buxdihude"));
       // System.out.println(new pizza_salami(10, 20, 1.1, "buxdihude"));

        System.out.println(pizzafactory.getPizza(Ort.Berlin,Pizza_typ.Calzone)); // schauen ob man eine pizza von berlin erzeugen kann
        System.out.println(pizzafactory.getPizza(Ort.Rostock,Pizza_typ.Salami));
        System.out.println(pizzafactory.getPizza(Ort.Rostock,Pizza_typ.Hawaii).getlocatione()); // schaun on zugrff auf location get und test Rostock
        System.out.println(pizzafactory.getPizza(Ort.Hamburg,Pizza_typ.Salami).getlocatione().get_address()); // aug pizzeria zugreifen


        pizza a1 = pizzafactory.getPizza(Ort.Rostock,Pizza_typ.Salami);

        a1.backen();
        a1.schneiden();
        a1.einpacken();

        // könnte man etz so machen das jede pizza nur einmal pro instanz gebacken -> geschnitten und verpackt werden kann

    }
}