package Models;

public class pizzafactory {

    private static pizzeria HAMBURG =  new pizzeria_hamburg("Hamburg 1 1", 10);
    private static pizzeria BERLIN =  new pizzeria_berlin("Berlin 1 1", 12);
    private static pizzeria ROSTOCK =  new pizzeria_Rostock("Rostock 1 1", 5);

    public static pizza getPizza(Enum o, Enum p){
        if (o == Ort.Berlin ){

            if(p == Pizza_typ.Calzone){ return new pizza_calzone(10, 20, 1.1, BERLIN );}
            if(p == Pizza_typ.Salami){return new pizza_salami(10, 20, 1.1, BERLIN );}
            if(p == Pizza_typ.Hawaii){return new pizza_hawaii(10, 20, 1.1, BERLIN );}

        }
        if (o == Ort.Rostock ){

            if(p == Pizza_typ.Calzone){ return new pizza_calzone(10, 20, 1.1, ROSTOCK );}
            if(p == Pizza_typ.Salami){return new pizza_salami(10, 20, 1.1, ROSTOCK );}
            if(p == Pizza_typ.Hawaii){return new pizza_hawaii(10, 20, 1.1, ROSTOCK );}

        }
        if (o == Ort.Hamburg ){

            if(p == Pizza_typ.Calzone){ return new pizza_calzone(10, 20, 1.1, HAMBURG );}
            if(p == Pizza_typ.Salami){return new pizza_salami(10, 20, 1.1, HAMBURG );}
            if(p == Pizza_typ.Hawaii){return new pizza_hawaii(10, 20, 1.1, HAMBURG );}

        }
        return null;


    }
}
